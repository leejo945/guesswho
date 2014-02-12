package com.guesswho.app.ui;

import com.guesswho.app.R;
import com.guesswho.app.util.ConstantManager;
import com.guesswho.app.util.ToastManager;
import com.guesswho.app.view.UnderscoreEditText;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PlayActivity extends BaseActivity {

	 
	private UnderscoreEditText mInputEt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.play);
		// 根据不同的值显示不同的界面
		int ui = getIntent().getIntExtra("ui", -1);
		switch (ui) {
		case -1: {
			ToastManager.show(this, R.string.toast_ui_error);
			break;
		}

		case ConstantManager.PLAY: {
			findViewById(R.id.input_ll0).setVisibility(View.VISIBLE);
			findViewById(R.id.play_menu_bt).setVisibility(View.VISIBLE);
			findViewById(R.id.play_ok_bt).setVisibility(View.VISIBLE);
			findViewById(R.id.play_skip_bt).setVisibility(View.VISIBLE);
			 ((TextView) findViewById(R.id.input_tv0)).setText(R.string.fill_in_your_name);
			break;
		}
		case ConstantManager.MULTIPLAY: {
			findViewById(R.id.input_ll0).setVisibility(View.VISIBLE);
			findViewById(R.id.input_ll1).setVisibility(View.VISIBLE);
			findViewById(R.id.input_ll2).setVisibility(View.VISIBLE);
			findViewById(R.id.input_ll3).setVisibility(View.VISIBLE);
			 ((TextView) findViewById(R.id.input_tv0)).setText(R.string.st1);
			 ((TextView) findViewById(R.id.input_tv1)).setText(R.string.nd2);
			 ((TextView) findViewById(R.id.input_tv2)).setText(R.string.rd3);
			 ((TextView) findViewById(R.id.input_tv3)).setText(R.string.th4);
			 
			findViewById(R.id.play_menu_bt).setVisibility(View.VISIBLE);
			findViewById(R.id.play_ok_bt).setVisibility(View.VISIBLE);
			break;
		}
		case ConstantManager.OPTIONS: {
            findViewById(R.id.play_input_ll).setBackgroundResource(R.drawable.bg_bottom);
         	findViewById(R.id.play_menu_bt).setVisibility(View.VISIBLE);
			break;
		}
		case ConstantManager.SCORES: {

			break;
		}
		default:
			break;
		}
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.play_menu_bt: {
			finish();
			break;
		}

		case R.id.play_ok_bt: {
			break;
		}

		case R.id.play_skip_bt: {
			break;
		}
		}
	}
}
