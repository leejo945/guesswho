package com.guesswho.app.ui;

import com.guesswho.app.R;

import android.os.Bundle;
import android.view.View;

public class HelpActivity extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.help);
	}
	public void onClick(View v){
		switch (v.getId()) {
		case R.id.help_menu:
			finish();
			break;

		 
		}
	}
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		//super.onBackPressed();
	}
}
