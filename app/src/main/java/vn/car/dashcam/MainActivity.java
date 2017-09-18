package vn.car.dashcam;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import vn.car.base.BaseActivity;
import vn.car.connectivity.ConnectivityActivity;

public class MainActivity extends BaseActivity {

    private Button mDemoRecordVideoBtn;

    private Button mDemoMapBtn;

    private Button mDemoConnectivityBtn;

    @Override
    protected void initContentView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void initViews() {
        mDemoRecordVideoBtn = findViewById(R.id.demoRecordVideoBtn);
        mDemoMapBtn = findViewById(R.id.demoMapBtn);
        mDemoConnectivityBtn = findViewById(R.id.demoConnectivityBtn);
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

        mDemoConnectivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ConnectivityActivity.class));
                Toast.makeText(MainActivity.this, "Demo Connectivity", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
