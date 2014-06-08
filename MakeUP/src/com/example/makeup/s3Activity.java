package com.example.makeup;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class s3Activity extends MainActivity {
	WebView webview2;
	@SuppressLint("SetJavaScriptEnabled")
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
			setContentView(R.layout.se3);
			webview2=(WebView) findViewById(R.id.web1);
			webview2.getSettings().setJavaScriptEnabled(true);
			webview2.getSettings().setBuiltInZoomControls(true);
			webview2.getSettings().setSupportZoom(true);
			webview2.loadUrl("http://m.shopping.naver.com/search/all_search.nhn?query=%EB%B9%84%EC%98%A4%ED%85%9C%EC%98%B4%EB%AF%80%20%ED%8F%BC%ED%81%B4%EB%A0%8C%EC%A7%95&cat_id=40005370&nv_mid=6229737717&frm=NVSCPRO");
			webview2.setWebViewClient(new cWebViewClient());
			}
		
		  private class cWebViewClient extends WebViewClient{
			  public boolean shouldOverrideUrlLoading(WebView view2, String url){
				  view2.loadUrl(url);
				return true;
			  }
			  }
		  }