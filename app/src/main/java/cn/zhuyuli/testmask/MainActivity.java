package cn.zhuyuli.testmask;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private MaskProgressDialog maskProgressDialog;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.showMask).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                maskProgressDialog = new MaskProgressDialog(MainActivity.this,
                        R.style.MaskProgressDialog);
                maskProgressDialog.setContentView(R.layout.mask_progress_dialog);
              //  maskProgressDialog.getWindow().getAttributes().gravity = Gravity.BOTTOM;
                imageView= (ImageView) maskProgressDialog.findViewById(R.id.imageView2);

                maskProgressDialog.setCancelable(true);
                maskProgressDialog.setCanceledOnTouchOutside(true);
                maskProgressDialog.show();
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        maskProgressDialog.dismiss();
                    }
                });
            }
        });
    }
}
