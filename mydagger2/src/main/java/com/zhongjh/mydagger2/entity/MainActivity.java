package com.zhongjh.mydagger2.entity;

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
    MainEntity mainEntity;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainComponent.builder().build().inject(this);
        mainEntity.setName("名称");
        mainEntity.getMainParameter().setName("名称2");


        ((TextView) findViewById(R.id.tvName)).append(mainEntity.getName() + "_" + mainEntity.getMainParameter().getName());
    }


}
