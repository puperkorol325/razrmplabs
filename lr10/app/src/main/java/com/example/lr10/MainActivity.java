package com.example.lr10;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.util.Patterns;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout._2);

        // С activity_main.xml

        /* ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText editText = findViewById(R.id.editText);
        TextView text = findViewById(R.id.outputText);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                text.setText(s);
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() >= 5) {
                    text.setTextSize(10f);
                }
                if (s.length() >= 10) {
                    text.setTextColor(Color.RED);
                }
            }
        }); */

        // С _2.xml

        TextInputEditText emailField = findViewById(R.id.email);
        TextInputEditText passwordField = findViewById(R.id.password);
        TextInputLayout emailLayout = findViewById(R.id.textField1);
        TextInputLayout passwordLayout = findViewById(R.id.textField);

        Button submitButton = findViewById(R.id.submit);
        TextView message = findViewById(R.id.message);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = String.valueOf(emailField.getText());
                String password = String.valueOf(passwordField.getText());
                if ((email.length() > 0 && Patterns.EMAIL_ADDRESS.matcher(email).matches()) && password.length() >= 8) {
                    message.setTextColor(0xff0ff42b);
                    message.setText("Валидация прошла успешно");
                }else {
                    message.setTextColor(0xffff0004);
                    message.setText("Проверьте правильность введенных данных");
                }
            }
        });
    }
}