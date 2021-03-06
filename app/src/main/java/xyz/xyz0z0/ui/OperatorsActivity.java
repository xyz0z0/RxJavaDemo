package xyz.xyz0z0.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import xyz.xyz0z0.myapplication.R;
import xyz.xyz0z0.ui.operators.BufferExampleActivity;
import xyz.xyz0z0.ui.operators.CompletableActivity;
import xyz.xyz0z0.ui.operators.DisposableExampleActivity;
import xyz.xyz0z0.ui.operators.FlowableExampleActivity;
import xyz.xyz0z0.ui.operators.IntervalExampleActivity;
import xyz.xyz0z0.ui.operators.MapExampleActivity;
import xyz.xyz0z0.ui.operators.ReduceExampleActivity;
import xyz.xyz0z0.ui.operators.SimpleExampleActivity;
import xyz.xyz0z0.ui.operators.SingleObserverActivity;
import xyz.xyz0z0.ui.operators.TakeExampleActivity;
import xyz.xyz0z0.ui.operators.TimerExampleActivity;
import xyz.xyz0z0.ui.operators.ZipExampleActivity;

public class OperatorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operators);

        Button btnSimple = findViewById(R.id.simple_button);
        btnSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OperatorsActivity.this, SimpleExampleActivity.class));
            }
        });

        Button btnMap = findViewById(R.id.map_button);
        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OperatorsActivity.this, MapExampleActivity.class));
            }
        });

        Button btnZip = findViewById(R.id.zip_button);
        btnZip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OperatorsActivity.this, ZipExampleActivity.class));
            }
        });

        Button btnDisposable = findViewById(R.id.disposable_button);
        btnDisposable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OperatorsActivity.this, DisposableExampleActivity.class));
            }
        });
        Button btnTake = findViewById(R.id.take_button);
        btnTake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OperatorsActivity.this, TakeExampleActivity.class));
            }
        });

        Button btnTimer = findViewById(R.id.timer_button);
        btnTimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OperatorsActivity.this, TimerExampleActivity.class));
            }
        });

        Button btnInterval = findViewById(R.id.btnInterval);
        btnInterval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OperatorsActivity.this, IntervalExampleActivity.class));
            }
        });
        Button btnSingleObserver = findViewById(R.id.btnSingleObserver);
        btnSingleObserver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OperatorsActivity.this, SingleObserverActivity.class));
            }
        });
        Button btnCompletable = findViewById(R.id.btnCompletable);
        btnCompletable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OperatorsActivity.this, CompletableActivity.class));
            }
        });
        Button btnFlowable = findViewById(R.id.btnFlowable);
        btnFlowable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OperatorsActivity.this, FlowableExampleActivity.class));
            }
        });

        Button btnReduce = findViewById(R.id.btnReduce);
        btnReduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OperatorsActivity.this, ReduceExampleActivity.class));
            }
        });

        Button btnBuffer = findViewById(R.id.btnBuffer);
        btnBuffer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OperatorsActivity.this, BufferExampleActivity.class));
            }
        });


    }


}
