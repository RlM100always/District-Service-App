package com.example.districtservice.documentary_video_service;

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

public class DocumentaryWebView extends AppCompatActivity {


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
        urls.put("ঢাকা জেলা", "https://youtu.be/41Pa82bjHR0");
        urls.put("গাজীপুর জেলা", "https://youtu.be/yrX7Wp7t6LI");
        urls.put("কিশোরগঞ্জ জেলা", "https://youtu.be/RxkHMkt80SA");
        urls.put("মানিকগঞ্জ জেলা", "https://youtu.be/UcJoTBqOXDA");
        urls.put("মুন্সিগঞ্জ জেলা", "https://youtu.be/XTCUAZ3eA7w");
        urls.put("নারায়ণগঞ্জ জেলা", "https://youtu.be/IqxdKvdS_bY");
        urls.put("নরসিংদী জেলা", "https://youtu.be/HBHh08q6Rgc");
        urls.put("টাঙ্গাইল জেলা", "https://youtu.be/kjDqrOJl6zY");
        urls.put("ফরিদপুর জেলা", "https://youtu.be/zJnxaebDdPM");
        urls.put("মাদারীপুর জেলা", "https://youtu.be/tozRx1PKsGQ");
        urls.put("রাজবাড়ি জেলা", "https://youtu.be/wLBQ_m8eou4");
        urls.put("শরিয়তপুর জেলা", "https://youtu.be/h5sq52obA6Q");
        urls.put("গোপালগঞ্জ জেলা", "https://youtu.be/GTuJT4KJ5aE");

        // Chittagong Division
        urls.put("চট্টগ্রাম জেলা", "https://youtu.be/hXEwdcDPQq0");
        urls.put("কক্সবাজার জেলা", "https://youtu.be/T4gSrcpdfaU");
        urls.put("খাগড়াছড়ি জেলা", "https://youtu.be/pjhbwQfks1U");
        urls.put("বান্দরবান জেলা", "https://youtu.be/iQbVjqSYBPw");
        urls.put("রাঙ্গামাটি জেলা", "https://youtu.be/wxy_xpDT8ms");
        urls.put("লক্ষ্মীপুর জেলা", "https://youtu.be/OE_RbfAoYW4");
        urls.put("চাঁদপুর জেলা", "https://youtu.be/g3BDzF4nNK4");
        urls.put("ফেনী জেলা", "https://youtu.be/BWzwnu2xXjw");
        urls.put("ব্রাহ্মণবাড়িয়া", "https://youtu.be/tLMVJVBWv94");
        urls.put("নোয়াখালী জেলা", "https://youtu.be/LoDNhX4Ai-g");
        urls.put("কুমিল্লা জেলা", "https://youtu.be/ji4iEmGDPdQ");

        // Rajshahi Division
        urls.put("রাজশাহী জেলা", "https://youtu.be/LaaDUCuKjXI");
        urls.put("নওগাঁ জেলা", "https://youtu.be/gNTIn25u_B0");
        urls.put("সিরাজগঞ্জ জেলা", "https://youtu.be/dBIHvk9BZEw");
        urls.put("পাবনা জেলা", "https://youtu.be/zseN8Re7UTM");
        urls.put("বগুড়া জেলা", "https://youtu.be/QkNGKV8NsRY");
        urls.put("জয়পুরহাট জেলা", "https://youtu.be/7KZ0nfUk6O0");
        urls.put("চাঁপাইনবাবগঞ্জ জেলা", "https://youtu.be/DY0ZmaXi36Q");
        urls.put("নাটোর জেলা", "https://youtu.be/5tnp5NoUkKw");

        // Sylhet Division
        urls.put("সিলেট জেলা", "https://youtu.be/ugsK6SJUHPk");
        urls.put("মৌলভীবাজার জেলা", "https://youtu.be/cA-5mW3WA88");
        urls.put("হবিগঞ্জ জেলা", "https://youtu.be/d8wsPVjr1a0");
        urls.put("সুনামগঞ্জ জেলা", "https://youtu.be/RSJO6habil0");

        // Mymensingh Division
        urls.put("ময়মনসিংহ জেলা", "https://youtu.be/nLMu-2p51Vc");
        urls.put("শেরপুর জেলা", "https://youtu.be/AHeo_VVgyIw");
        urls.put("জামালপুর জেলা", "https://youtu.be/SAGf9lGx-yE");
        urls.put("নেত্রকোণা জেলা", "https://youtu.be/00R_cUqRq0I");
        urls.put("কিশোরগঞ্জ জেলা", "https://youtu.be/qf9wpoqtzfI");

        // Barisal Division
        urls.put("বরিশাল জেলা", "https://youtu.be/8M5QYir7Ccs");
        urls.put("পটুয়াখালী জেলা", "https://youtu.be/ARkqnnZucx4");
        urls.put("পিরোজপুর জেলা","https://youtu.be/tofQf8yB8Hs");
        urls.put("ভোলা জেলা", "https://youtu.be/9FwBHtKHpgs");
        urls.put("ঝালকাঠি জেলা", "https://youtu.be/y2df6AKp8rU");
        urls.put("বরগুনা জেলা", "https://youtu.be/zbCs9yLKhgc");

        // Khulna Division
        urls.put("খুলনা জেলা", "https://youtu.be/HPjqiKcrQOI");
        urls.put("বাগেরহাট জেলা", "https://youtu.be/Fd82MiwupDo");
        urls.put("চুয়াডাঙ্গা জেলা", "https://youtu.be/eukNs2jtBwk");
        urls.put("যশোর জেলা", "https://youtu.be/6WlkCNBZpWU");
        urls.put("মেহেরপুর জেলা", "https://youtu.be/dd3g9h5dtNQ");
        urls.put("নড়াইল জেলা", "https://youtu.be/Ld3_d4fvcYY");
        urls.put("কুষ্টিয়া জেলা", "https://youtu.be/SnSdV-CYzMs");
        urls.put("মাগুরা জেলা", "https://youtu.be/04Vu_5VZH6Q");
        urls.put("ঝিনাইদহ জেলা", "https://youtu.be/r38DgVoaVS0");
        urls.put("সাতক্ষীরা জেলা", "https://youtu.be/oNf7ufXpnGQ");

        // Rangpur Division
        urls.put("রংপুর জেলা", "https://youtu.be/lMmuzCQTtR8");
        urls.put("দিনাজপুর জেলা", "https://youtu.be/14j7sbABwq4");
        urls.put("নীলফামারী জেলা", "https://youtu.be/HHW3ZrTeh0k");
        urls.put("গাইবান্ধা জেলা", "https://youtu.be/kQiSrE68xPk");
        urls.put("ঠাকুরগাঁও জেলা", "https://youtu.be/2z1GunbSiTc");
        urls.put("কুড়িগ্রাম জেলা", "https://youtu.be/xKRgVPtSpac");
        urls.put("পঞ্চগড় জেলা", "https://youtu.be/gn9FxWo6nGI");
        urls.put("লালমনিরহাট জেলা", "https://youtu.be/EuaFgaIWF4o");


        if(urls.containsKey(zillaNme)){
            return urls.get(zillaNme);
        }else{

            Log.i("DistrictWebView", "District not found: " + zillaNme);
            return null;
        }


    }
}