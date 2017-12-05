package com.android.launcher3;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class ToggleWeightWatcher extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getApplication(),"我是Lnucher3",Toast.LENGTH_LONG).show();
    }
}
