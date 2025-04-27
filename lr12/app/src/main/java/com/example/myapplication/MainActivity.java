package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Boolean isClicked = false;

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Button btn = (Button) v;
            if (!isClicked) {
                btn.setBackgroundColor(Color.RED);
                btn.setText("Кнопка была нажата");
                isClicked = true;
            }else {
                btn.setBackgroundColor(Color.BLACK);
                btn.setText("Кнопка была отжата");
                isClicked = false;
            }
        }
    };

    View.OnLongClickListener longClickListener = new View.OnLongClickListener() {

        @Override
        public boolean onLongClick(View v) {
            Button btn = (Button) v;
            btn.setText("Кнопка была зажата");
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button);
        Button btn1 = findViewById(R.id.button1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = findViewById(R.id.output);
                EditText name = findViewById(R.id.name);
                textView.setText("Добро пожаловать, " + name.getText());
            }
        });

        btn1.setOnClickListener(listener);
        btn1.setOnLongClickListener(longClickListener);
    }
}