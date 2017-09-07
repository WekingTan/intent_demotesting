package com.example.administrator.intent_basingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent1 = getIntent();
        String data = intent1.getStringExtra("extra_data");
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        editText1.setText(data);

        Button button2 = (Button) findViewById(R.id.button_SA);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("SA_data", "Hello First Activity");
                setResult(RESULT_OK, intent);
                finish();
            }
        });

    }
}
