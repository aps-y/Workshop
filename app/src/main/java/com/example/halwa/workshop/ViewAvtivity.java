package com.example.halwa.workshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewAvtivity extends AppCompatActivity {

    TextView textView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_avtivity);

        Intent intent = getIntent();
        String str = intent.getStringExtra("details");
        textView = findViewById(R.id.textView);
        textView.setText(str);

    }
}
