package xyz.xyz0z0.ui.operators;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import io.reactivex.Flowable;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import xyz.xyz0z0.myapplication.R;

public class FlowableExampleActivity extends AppCompatActivity {

    private static final String TAG = "Flowable";
    Button btn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_observer);

        btn = (Button) findViewById(R.id.btn);
        textView = (TextView) findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doSomeWork();
            }
        });
    }

    private void doSomeWork() {

        Flowable<Integer> observable = Flowable.just(2, 2, 3, 4);
        observable.reduce(50, new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) throws Exception {
                return integer + integer2;
            }
        }).subscribe(getObserver());
    }

    private SingleObserver<Integer> getObserver() {
        return new SingleObserver<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                textView.append(" onSubscribe : " + d.isDisposed());
            }

            @Override
            public void onSuccess(Integer integer) {
                textView.append(" onSuccess : value " + integer);
            }

            @Override
            public void onError(Throwable e) {
                textView.append(" onError : " + e.getMessage());
            }
        };
    }
}
