package xyz.xyz0z0.ui.operators;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import xyz.xyz0z0.myapplication.R;

public class IntervalExampleActivity extends AppCompatActivity {

    private static final String TAG = "Interval";
    private final CompositeDisposable disposables = new CompositeDisposable();
    Button btn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interval_example);

        btn = findViewById(R.id.btn);
        textView = findViewById(R.id.textView);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doSomeWork();
            }
        });
    }

    private void doSomeWork() {
        disposables.add(getObservable()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(getObserver()));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        disposables.clear();
    }

    private Observable<? extends Long> getObservable() {
        return Observable.interval(0, 2, TimeUnit.SECONDS);
    }

    private DisposableObserver<Long> getObserver() {
        return new DisposableObserver<Long>() {
            @Override
            public void onNext(Long aLong) {
                textView.append(" onNext : value : " + aLong);
            }

            @Override
            public void onError(Throwable e) {
                textView.append(" onError : " + e.getMessage());
            }

            @Override
            public void onComplete() {
                textView.append(" onComplete");
            }
        };
    }
}
