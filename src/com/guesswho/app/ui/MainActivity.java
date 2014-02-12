package com.guesswho.app.ui;

import java.util.HashMap;
import java.util.Map;

import com.guesswho.app.R;
import com.guesswho.app.R.layout;
import com.guesswho.app.R.menu;
import com.guesswho.app.util.ConstantManager;
import com.guesswho.app.util.UIManager;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class MainActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.main_play: {
			Map<String, Object> extras = new HashMap<String, Object>();
			extras.put("ui", ConstantManager.PLAY);
			UIManager.switcher(this, PlayActivity.class, extras);
			break;
		}
		case R.id.main_multiplay: {
			Map<String, Object> extras = new HashMap<String, Object>();
			extras.put("ui", ConstantManager.MULTIPLAY);
			UIManager.switcher(this, PlayActivity.class, extras);
			break;
		}
		case R.id.main_options: {
			Map<String, Object> extras = new HashMap<String, Object>();
			extras.put("ui", ConstantManager.OPTIONS);
			UIManager.switcher(this, PlayActivity.class, extras);
			break;
		}
		case R.id.main_scores: {
			Map<String, Object> extras = new HashMap<String, Object>();
			extras.put("ui", ConstantManager.SCORES);
			UIManager.switcher(this, PlayActivity.class, extras);
			break;
		}
		case R.id.main_fanuse: {
			UIManager.switcher(this, PlayActivity.class);
			break;
		}
		case R.id.main_exit: {
			UIManager.switcher(this, PlayActivity.class);
			break;
		}
		case R.id.main_help_iv: {
			UIManager.switcher(this, HelpActivity.class);
			break;
		}

		}
	}

//	@Override
//	public void onBackPressed() {
//		// TODO Auto-generated method stub
//		// super.onBackPressed();
//	}
}
