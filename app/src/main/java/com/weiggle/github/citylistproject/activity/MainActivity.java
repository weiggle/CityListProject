package com.weiggle.github.citylistproject.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.weiggle.github.citylistproject.R;

public class MainActivity extends AppCompatActivity {

    private Button mFirst,mSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView(){
        mFirst = (Button)findViewById(R.id.first);
        mSecond = (Button) findViewById(R.id.second);

        mFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,CityRecyclerActivity.class));
            }
        });

        mSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,CityRecyclerActivity.class));
            }
        });

    }
}
