package xyz.xyz0z0.ui.operators;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import xyz.xyz0z0.myapplication.R;
import xyz.xyz0z0.utils.AppConstant;

public class SimpleExampleActivity extends AppCompatActivity {

    Button btn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_example);

        btn = findViewById(R.id.btn);
        textView = findViewById(R.id.textview);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doSomeWork();
            }
        });
    }

    private void doSomeWork() {
    }

    private Observable<String> getObservable() {
        return Observable.just("Cricket", "Football");
    }

    private Observer<String> getObserver() {
        return new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.d("cxg", "onSubscribe : " + d.isDisposed());
            }

            @Override
            public void onNext(String s) {
                textView.append(" onNext : value : " + s);
                textView.append(AppConstant.LINE_SEPARATOR);
                Log.d("cxg", "onNext : value" + s);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };
    }
}
