package com.example.makeup;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;



public class s1Activity extends SecondActivity {
	WebView webview;
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
			setContentView(R.layout.se1);
			
			webview=(WebView) findViewById(R.id.web1);
			webview.getSettings().setJavaScriptEnabled(true);
			webview.getSettings().setBuiltInZoomControls(true);
			webview.getSettings().setSupportZoom(true);
			webview.loadUrl("http://m.shopping.naver.com/detail/detail.nhn?query=%EB%B9%84%EC%98%A4%ED%85%9C%EC%98%B4%EB%AF%80%20%EB%A1%9C%EC%85%98&cat_id=40005360&nv_mid=5422066208&frm=NVSCPRO");
			webview.setWebViewClient(new aWebViewClient());
			}
		 
		  private class aWebViewClient extends WebViewClient{
			  public boolean shouldOverrideUrlLoading(WebView view, String url){
				  view.loadUrl(url);
				return true;
			  }
			  }
		  }