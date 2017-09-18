package vn.car.dashcam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import vn.car.dashcam.base.BaseActivity;

public class MainActivity extends BaseActivity {

    private Button mDemoRecordVideoBtn;

    private Button mDemoMapBtn;

    @Override
    protected void initContentView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void initViews() {
        mDemoRecordVideoBtn = findViewById(R.id.demoRecordVideoBtn);
        mDemoMapBtn = findViewById(R.id.demoMapBtn);
    }

    @Override
    protected void initAction() {
        mDemoRecordVideoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Demo Record Video", Toast.LENGTH_SHORT).show();
            }
        });

        mDemoMapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Demo Map", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
