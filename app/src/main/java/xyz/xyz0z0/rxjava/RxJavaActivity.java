package xyz.xyz0z0.rxjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import xyz.xyz0z0.myapplication.R;

public class RxJavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rx_java);

//        Observable switcher = Observable.create(new ObservableOnSubscribe() {
//            @Override
//            public void subscribe(ObservableEmitter e) throws Exception {
//                e.onNext("On");
//                e.onNext("Off");
//                e.onNext("On");
//                e.onNext("On");
//                e.onComplete();
//            }
//        });
//
//        Observer<String> observer = new Observer<String>() {
//            @Override
//            public void onSubscribe(Disposable d) {
//                Log.d("cxg","开始");
//            }
//
//            @Override
//            public void onNext(String s) {
//                Log.d("cxg","handle this---"+s);
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onComplete() {
//                Log.d("cxg","观察结束...\n");
//            }
//        };
//
//        switcher.subscribe(observer);

//        Observable mObservable = Observable.create(new ObservableOnSubscribe<Integer>() {
//
//            @Override
//            public void subscribe(ObservableEmitter<Integer> e) throws Exception {
//                e.onNext(1);
//                e.onNext(2);
//                e.onComplete();
//            }
//        });
//
//        Observer mObserver = new Observer<Integer>(){
//
//            @Override
//            public void onSubscribe(Disposable d) {
//
//            }
//
//            @Override
//            public void onNext(Integer integer) {
//
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onComplete() {
//
//            }
//        };
//
//        mObservable.subscribe(mObserver);

        flowableDemo();
    }

    private void flowableDemo() {

        Flowable.range(0,10)
                .subscribe(new Subscriber<Integer>() {
                    Subscription sub;

                    @Override
                    public void onSubscribe(Subscription s) {
                        Log.d("cxg","onSubscribe start");
                        sub = s;
                        sub.request(1);
                        Log.d("cxg","onSubscribe end");
                    }

                    @Override
                    public void onNext(Integer integer) {
                        Log.d("cxg","onNext--->"+integer);
                        sub.request(1);

                    }

                    @Override
                    public void onError(Throwable t) {
                        t.printStackTrace();
                    }

                    @Override
                    public void onComplete() {
                        Log.d("cxg","onComplete");
                    }
                });
    }
}
