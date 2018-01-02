package xyz.xyz0z0.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import xyz.xyz0z0.rxjava.RxJavaActivity;
import xyz.xyz0z0.ui.OperatorsActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOperators = findViewById(R.id.operators_button);
        btnOperators.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, OperatorsActivity.class));
            }
        });
    }
}
