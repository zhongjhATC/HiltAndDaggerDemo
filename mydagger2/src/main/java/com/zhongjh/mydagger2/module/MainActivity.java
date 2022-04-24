package com.zhongjh.mydagger2.module;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.zhongjh.mydagger2.R;

import javax.inject.Inject;

/**
 * @author zhongjh
 * @date 2022/4/24
 */
public class MainActivity extends AppCompatActivity {

    @Inject
    MainParameter mainParameter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainComponent.builder().mainModule(new MainModule("参数")).build().inject(this);

        ((TextView) findViewById(R.id.tvName)).append("_" + mainParameter.getName());
    }


}
