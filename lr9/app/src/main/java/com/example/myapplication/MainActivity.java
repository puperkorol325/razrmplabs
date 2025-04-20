package com.example.myapplication;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.example_3);

        String str = "Hello Android";
        int length = str.length();
        char ch = str.charAt(1);

        String sub1 = str.substring(6);
        String sub2 = str.substring(0,5);

        int index = str.indexOf("And");
        boolean contains = str.contains("Hello");

        String replaced = str.replace("Hello", "Hi");
        String[] parts = str.split(" ");
        String upper = str.toUpperCase();
        String lower = str.toLowerCase();

        String withSpaces = " text ";
        String trimmed = withSpaces.trim();

        String link = "Посетите <a href='https://music.yandex.ru/artist/17780662'>наш сайт</a>";
        Spanned linkText = Html.fromHtml(link);

        TextView textView = findViewById(R.id.changeTxt);
        textView.setText(linkText);

        // String result;

        // result = "test" + 1 + "|" + 2 + "test";
        // Log.e("Конкатенация-1", result);
        // String firstName = "Arseniy";
        // String lastName = "Vinokurov";
        // result = firstName + lastName;
        // Log.e("Конкатенация-2", result);
        // result = firstName + " | " + lastName;
        // Log.e("Конкатенация-3", result);
        // textView.setTextColor(Color.BLACK);

        //ConstraintLayout constraintLayout = new ConstraintLayout(this);
        //TextView textView = new TextView(this);
        //textView.setBackgroundColor(0xffe8eaf);
        //textView.setTextColor(0xff5c6bc0);
        //textView.setAllCaps(true);
        //textView.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
        //textView.setText("Hello Android!");
        //textView.setTypeface(Typeface.create("casual", Typeface.NORMAL));
        //textView.setTextSize(26);
        //ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
         //       (ViewGroup.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        //layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
       // layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        //textView.setLayoutParams(layoutParams);
        //constraintLayout.addView(textView);
        //setContentView(constraintLayout);
    }
}