package com.example.makeup;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class s33Activity extends MainActivity {
	WebView webview03;
	@SuppressLint("SetJavaScriptEnabled")
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
			setContentView(R.layout.se33);
			webview03=(WebView) findViewById(R.id.web1);
			webview03.getSettings().setJavaScriptEnabled(true);
			webview03.getSettings().setBuiltInZoomControls(true);
			webview03.getSettings().setSupportZoom(true);
			webview03.loadUrl("http://m.shopping.naver.com/detail/detail.nhn?query=%EB%B9%84%EC%98%A4%ED%85%9C%20%ED%8F%BC%ED%81%B4%EB%A0%8C%EC%A7%95&cat_id=40005413&nv_mid=5395643740&frm=NVSCPRO");
			webview03.setWebViewClient(new cWebViewClient());
			}
		
		  private class cWebViewClient extends WebViewClient{
			  public boolean shouldOverrideUrlLoading(WebView view2, String url){
				  view2.loadUrl(url);
				return true;
			  }
			  }
		  }