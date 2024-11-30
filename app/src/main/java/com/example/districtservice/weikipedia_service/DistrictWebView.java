package com.example.districtservice.weikipedia_service;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.districtservice.R;

import java.util.HashMap;
import java.util.Map;

public class DistrictWebView extends AppCompatActivity {

    private WebView webView;
    private String districtUrls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_district_web_view);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        Bundle bundle = getIntent().getExtras();
        String zillaName = bundle.getString("key");


        String districtUrl=createDistrictUrls(zillaName);
         //Log.i("key",districtUrl);

        if (districtUrl != null) {
            loadWebView(districtUrl);
        }
    }

    private void loadWebView(String url) {
      //  Log.i("key","I want to go");

        webView = findViewById(R.id.webViewId);
        webView.loadUrl(url);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

    }


    @Override
    public void onBackPressed() {
        // Go back in WebView if possible
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }

    private String createDistrictUrls(String zillaNme) {
        Map<String, String> urls = new HashMap<>();

        // Dhaka Division
        urls.put("ঢাকা জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%A2%E0%A6%BE%E0%A6%95%E0%A6%BE_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("গাজীপুর জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%97%E0%A6%BE%E0%A6%9C%E0%A7%80%E0%A6%AA%E0%A7%81%E0%A6%B0_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("কিশোরগঞ্জ জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%95%E0%A6%BF%E0%A6%B6%E0%A7%8B%E0%A6%B0%E0%A6%97%E0%A6%9E%E0%A7%8D%E0%A6%9C_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("মানিকগঞ্জ জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%AE%E0%A6%BE%E0%A6%A8%E0%A6%BF%E0%A6%95%E0%A6%97%E0%A6%9E%E0%A7%8D%E0%A6%9C_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("মুন্সিগঞ্জ জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%AE%E0%A7%81%E0%A6%A8%E0%A7%8D%E0%A6%B8%E0%A7%80%E0%A6%97%E0%A6%9E%E0%A7%8D%E0%A6%9C_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("নারায়ণগঞ্জ জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%A8%E0%A6%BE%E0%A6%B0%E0%A6%BE%E0%A6%AF%E0%A6%BC%E0%A6%A3%E0%A6%97%E0%A6%9E%E0%A7%8D%E0%A6%9C_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("নরসিংদী জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%A8%E0%A6%B0%E0%A6%B8%E0%A6%BF%E0%A6%82%E0%A6%A6%E0%A7%80_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("টাঙ্গাইল জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%9F%E0%A6%BE%E0%A6%99%E0%A7%8D%E0%A6%97%E0%A6%BE%E0%A6%87%E0%A6%B2_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("ফরিদপুর জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%AB%E0%A6%B0%E0%A6%BF%E0%A6%A6%E0%A6%AA%E0%A7%81%E0%A6%B0_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("মাদারীপুর জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%AE%E0%A6%BE%E0%A6%A6%E0%A6%BE%E0%A6%B0%E0%A7%80%E0%A6%AA%E0%A7%81%E0%A6%B0_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("রাজবাড়ি জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%B0%E0%A6%BE%E0%A6%9C%E0%A6%AC%E0%A6%BE%E0%A6%A1%E0%A6%BC%E0%A7%80_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE ");
        urls.put("শরিয়তপুর জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%B6%E0%A6%B0%E0%A7%80%E0%A6%AF%E0%A6%BC%E0%A6%A4%E0%A6%AA%E0%A7%81%E0%A6%B0_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("গোপালগঞ্জ জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%97%E0%A7%8B%E0%A6%AA%E0%A6%BE%E0%A6%B2%E0%A6%97%E0%A6%9E%E0%A7%8D%E0%A6%9C_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");

        // Chittagong Division
        urls.put("চট্টগ্রাম জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%9A%E0%A6%9F%E0%A7%8D%E0%A6%9F%E0%A6%97%E0%A7%8D%E0%A6%B0%E0%A6%BE%E0%A6%AE_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("কক্সবাজার জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%95%E0%A6%95%E0%A7%8D%E0%A6%B8%E0%A6%AC%E0%A6%BE%E0%A6%9C%E0%A6%BE%E0%A6%B0_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("খাগড়াছড়ি জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%96%E0%A6%BE%E0%A6%97%E0%A6%A1%E0%A6%BC%E0%A6%BE%E0%A6%9B%E0%A6%A1%E0%A6%BC%E0%A6%BF_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("বান্দরবান জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%AC%E0%A6%BE%E0%A6%A8%E0%A7%8D%E0%A6%A6%E0%A6%B0%E0%A6%AC%E0%A6%BE%E0%A6%A8_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("রাঙ্গামাটি জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%B0%E0%A6%BE%E0%A6%99%E0%A7%8D%E0%A6%97%E0%A6%BE%E0%A6%AE%E0%A6%BE%E0%A6%9F%E0%A6%BF_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("লক্ষ্মীপুর জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%B2%E0%A6%95%E0%A7%8D%E0%A6%B7%E0%A7%8D%E0%A6%AE%E0%A7%80%E0%A6%AA%E0%A7%81%E0%A6%B0_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("চাঁদপুর জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%9A%E0%A6%BE%E0%A6%81%E0%A6%A6%E0%A6%AA%E0%A7%81%E0%A6%B0_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("ফেনী জেলা", " https://bn.wikipedia.org/wiki/%E0%A6%AB%E0%A7%87%E0%A6%A8%E0%A7%80_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("ব্রাহ্মণবাড়িয়া", "https://bn.wikipedia.org/wiki/%E0%A6%AC%E0%A7%8D%E0%A6%B0%E0%A6%BE%E0%A6%B9%E0%A7%8D%E0%A6%AE%E0%A6%A3%E0%A6%AC%E0%A6%BE%E0%A6%A1%E0%A6%BC%E0%A6%BF%E0%A6%AF%E0%A6%BC%E0%A6%BE_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("নোয়াখালী জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%A8%E0%A7%8B%E0%A6%AF%E0%A6%BC%E0%A6%BE%E0%A6%96%E0%A6%BE%E0%A6%B2%E0%A7%80_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("কুমিল্লা জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%95%E0%A7%81%E0%A6%AE%E0%A6%BF%E0%A6%B2%E0%A7%8D%E0%A6%B2%E0%A6%BE_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");

        // Rajshahi Division
        urls.put("রাজশাহী জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%B0%E0%A6%BE%E0%A6%9C%E0%A6%B6%E0%A6%BE%E0%A6%B9%E0%A7%80_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE ");
        urls.put("নওগাঁ জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%A8%E0%A6%93%E0%A6%97%E0%A6%BE%E0%A6%81_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE ");
        urls.put("সিরাজগঞ্জ জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%B8%E0%A6%BF%E0%A6%B0%E0%A6%BE%E0%A6%9C%E0%A6%97%E0%A6%9E%E0%A7%8D%E0%A6%9C_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE ");
        urls.put("পাবনা জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%AA%E0%A6%BE%E0%A6%AC%E0%A6%A8%E0%A6%BE_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE ");
        urls.put("বগুড়া জেলা", " https://bn.wikipedia.org/wiki/%E0%A6%AC%E0%A6%97%E0%A7%81%E0%A6%A1%E0%A6%BC%E0%A6%BE_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("জয়পুরহাট জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%9C%E0%A6%AF%E0%A6%BC%E0%A6%AA%E0%A7%81%E0%A6%B0%E0%A6%B9%E0%A6%BE%E0%A6%9F_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE ");
        urls.put("চাঁপাইনবাবগঞ্জ জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%9A%E0%A6%BE%E0%A6%81%E0%A6%AA%E0%A6%BE%E0%A6%87%E0%A6%A8%E0%A6%AC%E0%A6%BE%E0%A6%AC%E0%A6%97%E0%A6%9E%E0%A7%8D%E0%A6%9C_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE ");
        urls.put("নাটোর জেলা", " https://bn.wikipedia.org/wiki/%E0%A6%A8%E0%A6%BE%E0%A6%9F%E0%A7%8B%E0%A6%B0_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");

        // Sylhet Division
        urls.put("সিলেট জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%B8%E0%A6%BF%E0%A6%B2%E0%A7%87%E0%A6%9F_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("মৌলভীবাজার জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%AE%E0%A7%8C%E0%A6%B2%E0%A6%AD%E0%A7%80%E0%A6%AC%E0%A6%BE%E0%A6%9C%E0%A6%BE%E0%A6%B0_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE ");
        urls.put("হবিগঞ্জ জেলা", " https://bn.wikipedia.org/wiki/%E0%A6%B9%E0%A6%AC%E0%A6%BF%E0%A6%97%E0%A6%9E%E0%A7%8D%E0%A6%9C_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("সুনামগঞ্জ জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%B8%E0%A7%81%E0%A6%A8%E0%A6%BE%E0%A6%AE%E0%A6%97%E0%A6%9E%E0%A7%8D%E0%A6%9C_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");

        // Mymensingh Division
        urls.put("ময়মনসিংহ জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%AE%E0%A6%AF%E0%A6%BC%E0%A6%AE%E0%A6%A8%E0%A6%B8%E0%A6%BF%E0%A6%82%E0%A6%B9_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("শেরপুর জেলা", " https://bn.wikipedia.org/wiki/%E0%A6%B6%E0%A7%87%E0%A6%B0%E0%A6%AA%E0%A7%81%E0%A6%B0_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("জামালপুর জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%9C%E0%A6%BE%E0%A6%AE%E0%A6%BE%E0%A6%B2%E0%A6%AA%E0%A7%81%E0%A6%B0_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE ");
        urls.put("নেত্রকোণা জেলা", " https://bn.wikipedia.org/wiki/%E0%A6%A8%E0%A7%87%E0%A6%A4%E0%A7%8D%E0%A6%B0%E0%A6%95%E0%A7%8B%E0%A6%A3%E0%A6%BE_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("কিশোরগঞ্জ জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%95%E0%A6%BF%E0%A6%B6%E0%A7%8B%E0%A6%B0%E0%A6%97%E0%A6%9E%E0%A7%8D%E0%A6%9C_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");

        // Barisal Division
        urls.put("বরিশাল জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%AC%E0%A6%B0%E0%A6%BF%E0%A6%B6%E0%A6%BE%E0%A6%B2_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("পটুয়াখালী জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%AA%E0%A6%9F%E0%A7%81%E0%A6%AF%E0%A6%BC%E0%A6%BE%E0%A6%96%E0%A6%BE%E0%A6%B2%E0%A7%80_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("পিরোজপুর জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%AA%E0%A6%BF%E0%A6%B0%E0%A7%8B%E0%A6%9C%E0%A6%AA%E0%A7%81%E0%A6%B0_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("ভোলা জেলা", " https://bn.wikipedia.org/wiki/%E0%A6%AD%E0%A7%8B%E0%A6%B2%E0%A6%BE_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("ঝালকাঠি জেলা", " https://bn.wikipedia.org/wiki/%E0%A6%9D%E0%A6%BE%E0%A6%B2%E0%A6%95%E0%A6%BE%E0%A6%A0%E0%A6%BF_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("বরগুনা জেলা", " https://bn.wikipedia.org/wiki/%E0%A6%AC%E0%A6%B0%E0%A6%97%E0%A7%81%E0%A6%A8%E0%A6%BE_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");

        // Khulna Division
        urls.put("খুলনা জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%96%E0%A7%81%E0%A6%B2%E0%A6%A8%E0%A6%BE_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("বাগেরহাট জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%AC%E0%A6%BE%E0%A6%97%E0%A7%87%E0%A6%B0%E0%A6%B9%E0%A6%BE%E0%A6%9F_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("চুয়াডাঙ্গা জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%9A%E0%A7%81%E0%A6%AF%E0%A6%BC%E0%A6%BE%E0%A6%A1%E0%A6%BE%E0%A6%99%E0%A7%8D%E0%A6%97%E0%A6%BE_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE ");
        urls.put("যশোর জেলা", " https://bn.wikipedia.org/wiki/%E0%A6%AF%E0%A6%B6%E0%A7%8B%E0%A6%B0_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("মেহেরপুর জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%AE%E0%A7%87%E0%A6%B9%E0%A7%87%E0%A6%B0%E0%A6%AA%E0%A7%81%E0%A6%B0_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE ");
        urls.put("নড়াইল জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%A8%E0%A6%A1%E0%A6%BC%E0%A6%BE%E0%A6%87%E0%A6%B2_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("কুষ্টিয়া জেলা", " https://bn.wikipedia.org/wiki/%E0%A6%95%E0%A7%81%E0%A6%B7%E0%A7%8D%E0%A6%9F%E0%A6%BF%E0%A6%AF%E0%A6%BC%E0%A6%BE_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("মাগুরা জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%AE%E0%A6%BE%E0%A6%97%E0%A7%81%E0%A6%B0%E0%A6%BE_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE ");
        urls.put("ঝিনাইদহ জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%9D%E0%A6%BF%E0%A6%A8%E0%A6%BE%E0%A6%87%E0%A6%A6%E0%A6%B9_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("সাতক্ষীরা জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%B8%E0%A6%BE%E0%A6%A4%E0%A6%95%E0%A7%8D%E0%A6%B7%E0%A7%80%E0%A6%B0%E0%A6%BE_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE ");

        // Rangpur Division
        urls.put("রংপুর জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%B0%E0%A6%82%E0%A6%AA%E0%A7%81%E0%A6%B0_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE ");
        urls.put("দিনাজপুর জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%A6%E0%A6%BF%E0%A6%A8%E0%A6%BE%E0%A6%9C%E0%A6%AA%E0%A7%81%E0%A6%B0_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE ");
        urls.put("নীলফামারী জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%A8%E0%A7%80%E0%A6%B2%E0%A6%AB%E0%A6%BE%E0%A6%AE%E0%A6%BE%E0%A6%B0%E0%A7%80_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("গাইবান্ধা জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%97%E0%A6%BE%E0%A6%87%E0%A6%AC%E0%A6%BE%E0%A6%A8%E0%A7%8D%E0%A6%A7%E0%A6%BE_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE ");
        urls.put("ঠাকুরগাঁও জেলা", " https://bn.wikipedia.org/wiki/%E0%A6%A0%E0%A6%BE%E0%A6%95%E0%A7%81%E0%A6%B0%E0%A6%97%E0%A6%BE%E0%A6%81%E0%A6%93_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("কুড়িগ্রাম জেলা", " https://bn.wikipedia.org/wiki/%E0%A6%95%E0%A7%81%E0%A6%A1%E0%A6%BC%E0%A6%BF%E0%A6%97%E0%A7%8D%E0%A6%B0%E0%A6%BE%E0%A6%AE_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE");
        urls.put("পঞ্চগড় জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%AA%E0%A6%9E%E0%A7%8D%E0%A6%9A%E0%A6%97%E0%A6%A1%E0%A6%BC_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE ");
        urls.put("লালমনিরহাট জেলা", "https://bn.wikipedia.org/wiki/%E0%A6%B2%E0%A6%BE%E0%A6%B2%E0%A6%AE%E0%A6%A8%E0%A6%BF%E0%A6%B0%E0%A6%B9%E0%A6%BE%E0%A6%9F_%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE ");


        if(urls.containsKey(zillaNme)){
            return urls.get(zillaNme);
        }else{

            Log.i("DistrictWebView", "District not found: " + zillaNme);
            return null;
        }


    }


}
