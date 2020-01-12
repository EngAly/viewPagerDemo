package com.fci.engaly.viewpagerdemo;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ViewPagerAdapter adapter;
    ViewPager pager;
    int c = 0;
    TextView tv;
    boolean flag = false;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pager = findViewById(R.id.view_pager);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);
        tv = findViewById(R.id.textView);
        button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });

    }

    private void start() {
        if (!flag) {
            new Thread(new work(20)).start();
        }
    }

    class work implements Runnable {
        int x, c = 0, i;
        Handler handler = new Handler();

        public work(int x) {
            this.x = x;
        }

        @Override
        public void run() {
            flag = true;
            for (int i = 0; i < x; i++) {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        c++;
                        tv.setText(c + "");
                    }
                });

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
//                        Log.d("ds")
                }
            }
            i = 0;
            flag = false;
        }
    }
}

