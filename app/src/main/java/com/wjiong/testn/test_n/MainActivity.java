package com.wjiong.testn.test_n;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button title_back;
    Button title_edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* title_back= (Button) findViewById(R.id.title_back);
        title_edit= (Button) findViewById(R.id.title_edit);

        title_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("tag","返回");
            }
        });

        title_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("tag","编辑");
                //Toast.LENGTH_SHORT 表示显示2秒
            }
        });*/
    }
}
