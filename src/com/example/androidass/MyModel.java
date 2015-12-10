package com.example.androidass;

import android.content.Context;

import com.orm.SugarRecord;

public class MyModel extends SugarRecord<MyModel>{
	int dage;
	String wname;
	String password;
	String isSex;
	Context mContext;
	public  MyModel(){
		
	}
	
	public MyModel(int dage, String wname, String password, String isSex,
			Context mContext) {
		super();
		this.dage = dage;
		this.wname = wname;
		this.password = password;
		this.isSex = isSex;
		this.mContext = mContext;
	}

	
}
