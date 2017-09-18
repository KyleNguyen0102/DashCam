package vn.car.base;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by kylenguyen on 9/18/17.
 */

public abstract class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initContentView();
        initViews();
        initAction();
    }

    protected abstract void initContentView();

    protected abstract void initViews();

    protected abstract void initAction();

}
