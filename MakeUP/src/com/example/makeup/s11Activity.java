package com.example.makeup;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class s11Activity extends MainActivity {
	WebView webview01;
	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
			setContentView(R.layout.se11);
			
			webview01=(WebView) findViewById(R.id.web1);
			webview01.getSettings().setJavaScriptEnabled(true);
			webview01.getSettings().setBuiltInZoomControls(true);
			webview01.getSettings().setSupportZoom(true);
			webview01.loadUrl("http://m.shopping.naver.com/detail/detail.nhn?query=%EB%B9%84%EC%98%A4%ED%85%9C%EC%98%B4%EB%AF%80%20%EB%A1%9C%EC%85%98&cat_id=40005360&nv_mid=6464057455&frm=NVSCPRO");
			webview01.setWebViewClient(new aWebViewClient());
			}
		  private class aWebViewClient extends WebViewClient{
			  public boolean shouldOverrideUrlLoading(WebView view, String url){
				  view.loadUrl(url);
				return true;
			  }
			  }
		  }