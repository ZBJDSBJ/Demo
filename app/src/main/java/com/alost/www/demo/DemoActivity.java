package com.alost.www.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alost.www.demo.data.PieData;
import com.alost.www.demo.view.PieView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DemoActivity extends AppCompatActivity {


    @BindView(R.id.pie_view)
    PieView mPieView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_view);
        ButterKnife.bind(this);

        initView();
    }

    private void initView() {
        ArrayList<PieData> dataList = new ArrayList<>();
        dataList.add(new PieData("第一", 60));
        dataList.add(new PieData("第二", 90));
        dataList.add(new PieData("第三", 45));
        dataList.add(new PieData("第四", 60));
        dataList.add(new PieData("第五", 110));

        mPieView.setData(dataList);

    }

}
