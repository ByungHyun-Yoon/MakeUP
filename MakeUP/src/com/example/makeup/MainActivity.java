package com.example.makeup;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.ToggleButton;

public class MainActivity extends Activity {
	
	
	MediaPlayer mp;
	protected void onCreate(Bundle savedInstanceState) {
		setTitle("cafe.naver.com/since201109");
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final RelativeLayout llll =(RelativeLayout) findViewById(R.id.nn);
		final RelativeLayout lllll =(RelativeLayout) findViewById(R.id.mm);
		final RelativeLayout ll =(RelativeLayout) findViewById(R.id.RelativeLayout2);
		final RelativeLayout lll =(RelativeLayout) findViewById(R.id.RelativeLayout3);
		ImageButton ib1=(ImageButton) findViewById(R.id.imageButton1);
		ImageButton ib2=(ImageButton) findViewById(R.id.imageButton2);
		Button ib3=(Button) findViewById(R.id.button5);
		Button ib4=(Button) findViewById(R.id.button6);
	
		ib1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				ll.setVisibility(android.view.View.VISIBLE);
			}
		});
		ib2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				lll.setVisibility(android.view.View.VISIBLE);
			}
		});
		ib3.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				llll.setVisibility(android.view.View.VISIBLE);
			}
		});
		ib4.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				lllll.setVisibility(android.view.View.VISIBLE);
			}
		});
	
		
		Button bo=(Button) findViewById(R.id.button1);
		bo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				ll.setVisibility(android.view.View.INVISIBLE);
			}
		});
		Button boo=(Button) findViewById(R.id.Button01);
		boo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				lll.setVisibility(android.view.View.INVISIBLE);
			}
		});
		Button booo=(Button) findViewById(R.id.button7);
		booo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				llll.setVisibility(android.view.View.INVISIBLE);
			}
		});
		Button boooo=(Button) findViewById(R.id.Button07);
		boooo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				lllll.setVisibility(android.view.View.INVISIBLE);
			}
		});
		
		//·Î¼Ç Ã¢
		Button menu1=(Button) findViewById(R.id.menu1);
		menu1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
				startActivity(intent);
			}
		});
		
		Button menu11=(Button) findViewById(R.id.Button12);
		menu11.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Intent intent0 = new Intent(getApplicationContext(),Second1Activity.class);
				startActivity(intent0);
			}
		});
		//½ºÅ²Ã¢
		Button menu2=(Button) findViewById(R.id.menu2);
		menu2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Intent intent1 = new Intent(getApplicationContext(),threeActivity.class);
				startActivity(intent1);
			}
		});
		Button menu22=(Button) findViewById(R.id.Button10);
		menu22.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Intent intent11 = new Intent(getApplicationContext(),Ofthree1Activity.class);
				startActivity(intent11);
			}
		});
		//Æû
		Button menu3=(Button) findViewById(R.id.menu3);
		menu3.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Intent intent2 = new Intent(getApplicationContext(),fourActivity.class);
				startActivity(intent2);
			}
		});
		Button menu33=(Button) findViewById(R.id.Button11);
		menu33.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Intent intent22 = new Intent(getApplicationContext(),four1Activity.class);
				startActivity(intent22);
			}
		});
		//¾Ä±â
		Button menu4=(Button) findViewById(R.id.menu4);
		menu4.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Intent intent4 = new Intent(getApplicationContext(),fiActivity.class);
				startActivity(intent4);
			}
		});
		Button menu44=(Button) findViewById(R.id.Button13);
		menu44.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Intent intent44 = new Intent(getApplicationContext(),fi1Activity.class);
				startActivity(intent44);
			}
		});
		
		///////////////////////////////À½¾Ç
		
		//ToggleButton a = (ToggleButton) findViewById (R.id.toggleButton1);
		//CompoundButton.OnCheckedChangeListener oc = new CompoundButton.OnCheckedChangeListener() {
		//	public void onCheckedChanged(CompoundButton ButtonView, boolean isChecked) {
		//		if(isChecked){
		//		mp = MediaPlayer.create(getApplicationContext(), R.raw.st);
		//		mp.setLooping(true);
		//		mp.start();
		//		}
		//		else{
		//			mp.stop();
		//		}
		//	}
		//};
		//a.setOnCheckedChangeListener(oc);
	}
}