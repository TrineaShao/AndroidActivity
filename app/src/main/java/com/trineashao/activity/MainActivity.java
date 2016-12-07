package com.trineashao.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //自定义Activity
//          setContentView(R.layout.my_activity);
        /*
        初始化组件并且注册监听事件
         */
        button = ((Button) findViewById(R.id.btn_another));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 startActivity(new Intent(MainActivity.this,AnotherActivity.class));
                //2.启动一个链接页面
                // startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.baidu.com")));
            }        });
    }
}
