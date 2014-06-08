package com.example.makeup;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class s2Activity extends MainActivity {
	WebView webview1;
	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
			setContentView(R.layout.se2);
			
			webview1=(WebView) findViewById(R.id.web1);
			webview1.getSettings().setJavaScriptEnabled(true);
			webview1.getSettings().setBuiltInZoomControls(true);
			webview1.getSettings().setSupportZoom(true);
			webview1.loadUrl("http://m.shopping.naver.com/detail/detail.nhn?query=%EB%B9%84%EC%98%A4%ED%85%9C%EC%98%B4%EB%AF%80%20%EC%8A%A4%ED%82%A8&cat_id=40005367&nv_mid=5580226898&frm=NVSCPRO");
			webview1.setWebViewClient(new bWebViewClient());
			}
		
		  private class bWebViewClient extends WebViewClient{
			  public boolean shouldOverrideUrlLoading(WebView view1, String url){
				  view1.loadUrl(url);
				return true;
			  }
			  }
		  }