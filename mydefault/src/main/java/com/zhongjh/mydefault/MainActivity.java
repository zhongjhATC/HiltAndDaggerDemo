package com.zhongjh.mydefault;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @author zhongjh
 * @date 2022/4/24
 */
public class MainActivity extends AppCompatActivity {

    private MainEntity mainEntity;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainEntity = new MainEntity();
        mainEntity.setName("名称");

        ((TextView) findViewById(R.id.tvName)).setText(mainEntity.getName());
    }
}
