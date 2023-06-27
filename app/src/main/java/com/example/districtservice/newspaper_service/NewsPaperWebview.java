package com.example.districtservice.newspaper_service;

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

public class NewsPaperWebview extends AppCompatActivity {

    private WebView webView;
    private String districtUrls;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_paper_webview);

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
        urls.put("ঢাকা জেলা", "https://www.dhakatoday.com/");
        urls.put("গাজীপুর জেলা", "https://www.dailygazipuronline.com/");
        urls.put("কিশোরগঞ্জ জেলা", "https://kishoreganjnews.com/");
        urls.put("মানিকগঞ্জ জেলা", "https://www.manikgonjbarta.com/");
        urls.put("মুন্সিগঞ্জ জেলা", "https://munshigonj24.com/");
        urls.put("নারায়ণগঞ্জ জেলা", "https://www.narayanganjtimes.com/");
        urls.put("নরসিংদী জেলা", "https://www.narsingdipratidin.com/");
        urls.put("টাঙ্গাইল জেলা", "https://tangailpratidin.com/");
        urls.put("ফরিদপুর জেলা", "https://dailyfaridpurkantho.com/");
        urls.put("মাদারীপুর জেলা", "http://madaripurprotidin.com/");
        urls.put("রাজবাড়ি জেলা", "https://dailyamaderrajbari.com/");
        urls.put("শরিয়তপুর জেলা", "https://shariatpurpatrika.com/");
        urls.put("গোপালগঞ্জ জেলা", "https://dailygopalganj.com/");

        // Chittagong Division
        urls.put("চট্টগ্রাম জেলা", "https://ctgpratidin.com/");
        urls.put("কক্সবাজার জেলা", "https://www.dainikcoxsbazar.com/");
        urls.put("খাগড়াছড়ি জেলা", "https://www.dainikkhagrachari.com/");
        urls.put("বান্দরবান জেলা", "https://www.dainikbandarban.com/");
        urls.put("রাঙ্গামাটি জেলা", "https://dailyrangamati.com/");
        urls.put("লক্ষ্মীপুর জেলা", "https://dailylakshmipur.com/");
        urls.put("চাঁদপুর জেলা", "https://chandpurtimes.com/");
        urls.put("ফেনী জেলা", "https://fenirshongbad.com/");
        urls.put("ব্রাহ্মণবাড়িয়া", "https://brahmanbariatimes.com/");
        urls.put("নোয়াখালী জেলা", "https://dailynoakhalibarta.com/");
        urls.put("কুমিল্লা জেলা", "https://comillanews.com/");

        // Rajshahi Division
        urls.put("রাজশাহী জেলা", "https://rajshahinews24.com/");
        urls.put("নওগাঁ জেলা", "https://www.naogaondorpon.com/");
        urls.put("সিরাজগঞ্জ জেলা", "https://sirajganjprotidin.com/");
        urls.put("পাবনা জেলা", "https://www.pabnasamachar.com/");
        urls.put("বগুড়া জেলা", "https://www.dainikbogura.com/");
        urls.put("জয়পুরহাট জেলা", "https://joypurhatnews24.net/");
        urls.put("চাঁপাইনবাবগঞ্জ জেলা", "https://www.chapainawabgonj.com/");
        urls.put("নাটোর জেলা", "https://www.ajkernatore.com/");

        // Sylhet Division
        urls.put("সিলেট জেলা", "https://www.sylhetview24.news/");
        urls.put("মৌলভীবাজার জেলা", "https://dainikmoulvibazar.com/");
        urls.put("হবিগঞ্জ জেলা", "https://www.habiganjexpress.com/");
        urls.put("সুনামগঞ্জ জেলা", "https://sunamganjbarta.com/");

        // Mymensingh Division
        urls.put("ময়মনসিংহ জেলা", "https://www.mymensinghpratidin.com/");
        urls.put("শেরপুর জেলা", "https://sherpurtimes.com/");
        urls.put("জামালপুর জেলা", "https://www.dainikjamalpur.com/");
        urls.put("নেত্রকোণা জেলা", "https://netrokonajournal.com/tag/%E0%A6%A8%E0%A7%87%E0%A6%A4%E0%A7%8D%E0%A6%B0%E0%A6%AC%E0%A6%BE%E0%A6%B0%E0%A7%8D%E0%A6%A4%E0%A6%BE/");
        urls.put("কিশোরগঞ্জ জেলা", "https://kishoreganjnews.com/");

        // Barisal Division
        urls.put("বরিশাল জেলা", "https://barishalnews.com/");
        urls.put("পটুয়াখালী জেলা", "https://www.ajkerpatuakhali.com/");
        urls.put("পিরোজপুর জেলা", "https://www.pirojpursongbad.com/");
        urls.put("ভোলা জেলা", "https://www.bholanews.com/");
        urls.put("ঝালকাঠি জেলা", "https://surjaloknews.com/?cat=4");
        urls.put("বরগুনা জেলা", "https://www.bargunaonline.com/");

        // Khulna Division
        urls.put("খুলনা জেলা", "https://khulnanchal.com/");
        urls.put("বাগেরহাট জেলা", "http://bagerhat24.com/division/news");
        urls.put("চুয়াডাঙ্গা জেলা", "https://news.dailybanglanewspapers.com/category/district-news/chuadanga-district-newspapers/");
        urls.put("যশোর জেলা", "https://www.jagonews24.com/bangladesh/khulna/jessore");
        urls.put("মেহেরপুর জেলা", "https://www.meherpurnews.com/");
        urls.put("নড়াইল জেলা", "https://narailkantho.com/");
        urls.put("কুষ্টিয়া জেলা", "https://www.kushtianews.com/");
        urls.put("মাগুরা জেলা","https://maguraprotidin.com/");
        urls.put("ঝিনাইদহ জেলা", "https://jhc24.com/");
        urls.put("সাতক্ষীরা জেলা", "https://dainiksatkhira.com/");

        // Rangpur Division
        urls.put("রংপুর জেলা", "https://www.dainikrangpur.com/");
        urls.put("দিনাজপুর জেলা", "https://dinajpur24.com/");
        urls.put("নীলফামারী জেলা", "https://www.nilphamaribarta.com/");
        urls.put("গাইবান্ধা জেলা", "https://www.dainikgaibandha.com/");
        urls.put("ঠাকুরগাঁও জেলা", "https://www.dainikthakurgaon.com/");
        urls.put("কুড়িগ্রাম জেলা", "https://www.kurigrambarta.com/");
        urls.put("পঞ্চগড় জেলা", "https://www.dainikpanchagarh.com/");
        urls.put("লালমনিরহাট জেলা", "https://www.lalmonirhatbarta.com/");


        if (urls.containsKey(zillaNme)) {
            return urls.get(zillaNme);
        } else {

            Log.i("DistrictWebView", "District not found: " + zillaNme);
            return null;
        }

    }




}