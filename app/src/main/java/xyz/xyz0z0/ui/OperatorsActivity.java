package xyz.xyz0z0.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import xyz.xyz0z0.myapplication.R;
import xyz.xyz0z0.ui.operators.MapExampleActivity;
import xyz.xyz0z0.ui.operators.SimpleExampleActivity;

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
    }
}
