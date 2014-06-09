package com.example.makeup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class four1Activity extends MainActivity {
		protected void onCreate(Bundle savedInstanceState){
			super.onCreate(savedInstanceState);
				setContentView(R.layout.four1);
			
				Button btnReturn = (Button) findViewById(R.id.back001);
				btnReturn.setOnClickListener(new View.OnClickListener() {
					public void onClick(View arg0) {
					finish();
				}
			});

				
	}
}

