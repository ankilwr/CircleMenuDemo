package com.shihang.circlemenudemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    CircleMenuLayout mCircleMenuLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCircleMenuLayout = (CircleMenuLayout) findViewById(R.id.id_menulayout);
        initCircleMenu();
    }

    private void initCircleMenu(){
        mCircleMenuLayout.addItem(0, R.mipmap.circle_circle,       "圈子");
        mCircleMenuLayout.addItem(1, R.mipmap.circle_crowdfunding, "赛事众筹");
        mCircleMenuLayout.addItem(2, R.mipmap.circle_event,        "赛事活动");
        mCircleMenuLayout.addItem(3, R.mipmap.circle_experience,   "体验项目");
        mCircleMenuLayout.addItem(4, R.mipmap.circle_insurance,    "购买保险");
        mCircleMenuLayout.addItem(5, R.mipmap.circle_show,         "商业演出");
        mCircleMenuLayout.addItem(6, R.mipmap.circle_store,        "义卖商城");
        mCircleMenuLayout.addItem(7, R.mipmap.circle_training,     "培训项目");
        mCircleMenuLayout.notifyDataSetChange();
        mCircleMenuLayout.setOnMenuItemClickListener(menuClickListener);
    }


    private CircleMenuLayout.OnMenuItemClickListener menuClickListener = new CircleMenuLayout.OnMenuItemClickListener(){

        @Override
        public void itemClick(View view, int flag){
            switch (flag){
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
            }
            Toast.makeText(MainActivity.this,mCircleMenuLayout.getMenuItem(flag).getText(), Toast.LENGTH_SHORT);
        }

        @Override
        public void itemCenterClick(View view){
            Toast.makeText(MainActivity.this, "center", Toast.LENGTH_SHORT);
        }
    };

}
