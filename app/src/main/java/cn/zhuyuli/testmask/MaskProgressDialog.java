package cn.zhuyuli.testmask;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;


public class MaskProgressDialog extends Dialog {
	private long lastClickTime;

	public MaskProgressDialog(Context context) {
		super(context);
	}

	public MaskProgressDialog(Context context, int theme) {
		super(context, theme);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		WindowManager manager = getWindow().getWindowManager();
		Display display = manager.getDefaultDisplay();
		WindowManager.LayoutParams params = getWindow().getAttributes();
		params.width=display.getWidth(); //设置dialog的宽度为当前手机屏幕的宽度
		params.height=display.getHeight();
		getWindow().setAttributes(params);

	}
	/*@Override
	public boolean onTouchEvent(MotionEvent event) {
		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
			long currentTime = Calendar.getInstance().getTimeInMillis();
			if (currentTime - lastClickTime < 1000) {
				return true;
			}
			lastClickTime = currentTime;
			this.dismiss();
			break;
		}
		return super.onTouchEvent(event);
	}*/

}
