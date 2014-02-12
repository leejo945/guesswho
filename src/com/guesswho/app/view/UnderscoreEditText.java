package com.guesswho.app.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.EditText;

public class UnderscoreEditText extends EditText {
	private static final int SEGMENT_CNT = 9;
	private static final int GAP = 10;
	private static final int DI = 1;
	private Paint paint;
	private int gmw;
	private int gmh;
	private int sp;

	public UnderscoreEditText(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public UnderscoreEditText(Context context, AttributeSet attrs) {
		super(context, attrs);
		paint = new Paint();
		paint.setColor(Color.WHITE);
		paint.setAntiAlias(true);
	}

	public UnderscoreEditText(Context context) {
		super(context);
	}

	protected void onDraw(Canvas canvas) {
		// view大小（和canvas有区别）
		gmw = getMeasuredWidth();
		gmh = getMeasuredHeight();
		Log.e("view", gmw + "----" + gmh);
		// （view实际宽度-所有缺口的个数）/要分为几段1
		sp = (gmw - GAP * (SEGMENT_CNT - 1)) / SEGMENT_CNT;
		for (int i = 0; i < SEGMENT_CNT; i++) {
			canvas.drawLine((sp + GAP) * i, gmh - DI, sp * (i + 1) + GAP * i,
					gmh - DI, paint);
		}

		super.onDraw(canvas);
	}
}
