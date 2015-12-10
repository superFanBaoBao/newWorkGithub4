package com.example.androidass;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity implements OnClickListener {
	EditText editext_1, editext_2;
	Button qbuttoe;
	private String destart;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		editext_1 = (EditText) findViewById(R.id.editext_1);
		editext_2 = (EditText) findViewById(R.id.editext_2);
		qbuttoe = (Button) findViewById(R.id.qbuttoe);
		qbuttoe.setOnClickListener(this);
		MyModel model=new MyModel(19, "HHAH", "122121", "1", MainActivity.this);
		
		model.save();
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.qbuttoe:
			oncheck();
			break;
		}
	}

	private void oncheck() {
		if ((!TextUtils.isEmpty(editext_1.getText().toString().trim()))
				&& (!TextUtils.isEmpty(editext_2.getText().toString().trim()))) {
			try {
				// destart = AESCipher.encrypt(editext_1.getText().toString()
				// .trim(), editext_2.getText().toString().trim());
				destart = AESHelper.decrypt(editext_1.getText().toString()
						.trim(), editext_2.getText().toString().trim());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
