package com.guesswho.app.ui;


import com.guesswho.app.R;
import com.guesswho.app.util.UIManager;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public class SplashActivity extends BaseActivity {
	 private static final int SHOWMAIN = 0 ;
     private Handler handler = new Handler(){
    	 public void handleMessage(Message msg) {
    	 UIManager.switcher(SplashActivity.this, MainActivity.class);
    	 };
     };
	@Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.splash);
        handler.sendEmptyMessageDelayed(SHOWMAIN, 4000);
    }
}
