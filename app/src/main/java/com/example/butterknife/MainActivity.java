package com.example.butterknife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.butterknife.ButterKnife;
import com.butterknife.annotations.BindView;

//import butterknife.BindView;
//import butterknife.ButterKnife;
//import butterknife.Unbinder;

/**
 * ButterKnife介绍
 * 主要是解决findViewById和setOnclick，还包括资源的注入，IOC运行时注解和编译时注解
 * ButterKnife原理分析
 * 主要是才用编译是注解，说白了就是用apt生成代码
 * 只要能生成什么什么bingding类就好了， apt mirror（模块的知识） thinking in java 一书中有介绍
 */

public class MainActivity extends AppCompatActivity {
    //    @BindView(R.id.tv1)
//    TextView tv1;
//    @BindView(R.id.tv2)
//    TextView tv2;
//    Unbinder bind;
    @BindView(R.id.tv2)
    TextView textView2;
    @BindView(R.id.tv1)
    TextView textView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//         bind = ButterKnife.bind(this);//绑定布局
//        探究黄油刀的原理就是使用apt生成代码
//        MainActivity_ViewBinding viewBinding = new MainActivity_ViewBinding(this);
        textView1.setText("adasd");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        bind.unbind();//解绑 防止内存泄漏
    }
}