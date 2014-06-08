package com.example.makeup;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class Ofthree1Activity extends MainActivity {
		protected void onCreate(Bundle savedInstanceState){
			super.onCreate(savedInstanceState);
				setContentView(R.layout.three1);
			
				Button btnReturn = (Button) findViewById(R.id.back001);
				btnReturn.setOnClickListener(new View.OnClickListener() {
					public void onClick(View arg0) {
					finish();
				}
			});
				Button menu5=(Button) findViewById(R.id.button001);
				menu5.setOnClickListener(new View.OnClickListener() {
					public void onClick(View arg0) {
						Intent intent5 = new Intent(getApplicationContext(),s22Activity.class);
						startActivity(intent5);
					}
				});
	}
}

