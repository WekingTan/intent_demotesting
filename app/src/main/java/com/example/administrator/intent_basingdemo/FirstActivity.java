package com.example.administrator.intent_basingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Button button1 = (Button) findViewById(R.id.button_FA);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = "Hello SecondActivity";
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("extra_data", data);
                //（传递的数据，请求码）
                startActivityForResult(intent, 1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            //判断数据是那个 Activity 返回的
            case 1:
                //判断返回的处理结果
                if (resultCode == RESULT_OK) {
                    String resultData = data.getStringExtra("SA_data");
                    EditText edittext2 = (EditText) findViewById(R.id.editText2);
                    edittext2.setText(resultData);
                }
                break;
            default:
        }
    }
}
