package com.example.districtservice.map_service;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.districtservice.R;
import com.ortiz.touchview.TouchImageView;

public class MapActivity extends AppCompatActivity {

    private TouchImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        imageView=findViewById(R.id.touchImageView);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        Bundle bundle = getIntent().getExtras();
        String zillaName = bundle.getString("key");

        if (bundle != null) {

            if (zillaName != null) {

                if (zillaName.equals("ঢাকা জেলা")) {
                    imageView.setImageResource(R.drawable.dhaka_district_map);
                } else if (zillaName.equals("গাজীপুর জেলা")) {
                    imageView.setImageResource(R.drawable.mapgazipur);
                } else if (zillaName.equals("কিশোরগঞ্জ জেলা")) {
                    imageView.setImageResource(R.drawable.kisorgonj_map);
                } else if (zillaName.equals("মানিকগঞ্জ জেলা")) {
                    imageView.setImageResource(R.drawable.manikgoinj_map);
                } else if (zillaName.equals("মুন্সিগঞ্জ জেলা")) {
                    imageView.setImageResource(R.drawable.mosigonj_map);
                } else if (zillaName.equals("নারায়ণগঞ্জ জেলা")) {
                    imageView.setImageResource(R.drawable.narayangonj_map);
                } else if (zillaName.equals("নরসিংদী জেলা")) {
                    imageView.setImageResource(R.drawable.norsindi_map);
                } else if (zillaName.equals("টাঙ্গাইল জেলা")) {
                    imageView.setImageResource(R.drawable.map_tangail);
                } else if (zillaName.equals("ফরিদপুর জেলা")) {
                    imageView.setImageResource(R.drawable.map_foridpur);
                } else if (zillaName.equals("মাদারীপুর জেলা")) {
                    imageView.setImageResource(R.drawable.map_madaripur);
                } else if (zillaName.equals("রাজবাড়ি জেলা")) {
                    imageView.setImageResource(R.drawable.rajbari_map);
                } else if (zillaName.equals("শরিয়তপুর জেলা")) {
                    imageView.setImageResource(R.drawable.map_soriyotpur);
                } else if (zillaName.equals("গোপালগঞ্জ জেলা")) {
                    imageView.setImageResource(R.drawable.gopalgong_map);
                } else if (zillaName.equals("চট্টগ্রাম জেলা")) {
                    imageView.setImageResource(R.drawable.map_chittagang);
                } else if (zillaName.equals("কক্সবাজার জেলা")) {
                    imageView.setImageResource(R.drawable.map_coxsbajar);
                } else if (zillaName.equals("খাগড়াছড়ি জেলা")) {
                    imageView.setImageResource(R.drawable.map_khagrasori);
                } else if (zillaName.equals("বান্দরবান জেলা")) {
                    imageView.setImageResource(R.drawable.map_bandarbon);
                } else if (zillaName.equals("রাঙ্গামাটি জেলা")) {
                    imageView.setImageResource(R.drawable.rangamati_map);
                } else if (zillaName.equals("লক্ষ্মীপুর জেলা")) {
                    imageView.setImageResource(R.drawable.lokkhipur_map);
                } else if (zillaName.equals("চাঁদপুর জেলা")) {
                    imageView.setImageResource(R.drawable.chandpur_map);
                } else if (zillaName.equals("ফেনী জেলা")) {
                    imageView.setImageResource(R.drawable.map_feni);
                } else if (zillaName.equals("ব্রাহ্মণবাড়িয়া")) {
                    imageView.setImageResource(R.drawable.map_brahmanbaria);
                } else if (zillaName.equals("নোয়াখালী জেলা")) {
                    imageView.setImageResource(R.drawable.map_noakhali);
                } else if (zillaName.equals("কুমিল্লা জেলা")) {
                    imageView.setImageResource(R.drawable.map_coxsbajar);
                } else if (zillaName.equals("রাজশাহী জেলা")) {
                    imageView.setImageResource(R.drawable.rajbari_map);
                } else if (zillaName.equals("নওগাঁ জেলা")) {
                    imageView.setImageResource(R.drawable.map_nouga);
                } else if (zillaName.equals("সিরাজগঞ্জ জেলা")) {
                    imageView.setImageResource(R.drawable.map_sirajgonj);
                } else if (zillaName.equals("পাবনা জেলা")) {
                    imageView.setImageResource(R.drawable.map_pabna);
                } else if (zillaName.equals("বগুড়া জেলা")) {
                    imageView.setImageResource(R.drawable.map_bogura);
                }
//                else if (zillaName.equals("জয়পুরহাট জেলা")) {
//                    imageView.setImageResource(R.drawable.joypurhat_district_map);
//                } else if (zillaName.equals("চাঁপাইনবাবগঞ্জ জেলা")) {
//                    imageView.setImageResource(R.drawable.chapainawabganj_district_map);
//                } else if (zillaName.equals("নাটোর জেলা")) {
//                    imageView.setImageResource(R.drawable.natore_district_map);
//                } else if (zillaName.equals("সিলেট জেলা")) {
//                    imageView.setImageResource(R.drawable.sylhet_district_map);
//                } else if (zillaName.equals("মৌলভীবাজার জেলা")) {
//                    imageView.setImageResource(R.drawable.moulvibazar_district_map);
//                } else if (zillaName.equals("হবিগঞ্জ জেলা")) {
//                    imageView.setImageResource(R.drawable.habiganj_district_map);
//                } else if (zillaName.equals("সুনামগঞ্জ জেলা")) {
//                    imageView.setImageResource(R.drawable.sunamganj_district_map);
//                } else if (zillaName.equals("ময়মনসিংহ জেলা")) {
//                    imageView.setImageResource(R.drawable.mymensingh_district_map);
//                } else if (zillaName.equals("শেরপুর জেলা")) {
//                    imageView.setImageResource(R.drawable.sherpur_district_map);
//                } else if (zillaName.equals("জামালপুর জেলা")) {
//                    imageView.setImageResource(R.drawable.jamalpur_district_map);
//                } else if (zillaName.equals("নেত্রকোণা জেলা")) {
//                    imageView.setImageResource(R.drawable.netrokona_district_map);
//                } else if (zillaName.equals("সাতক্ষীরা জেলা")) {
//                    imageView.setImageResource(R.drawable.satkhira_district_map);
//                } else if (zillaName.equals("কুষ্টিয়া জেলা")) {
//                    imageView.setImageResource(R.drawable.kushtia_district_map);
//                } else if (zillaName.equals("মেহেরপুর জেলা")) {
//                    imageView.setImageResource(R.drawable.meherpur_district_map);
//                } else if (zillaName.equals("ঝিনাইদহ জেলা")) {
//                    imageView.setImageResource(R.drawable.jhenaidah_district_map);
//                } else if (zillaName.equals("মাগুরা জেলা")) {
//                    imageView.setImageResource(R.drawable.magura_district_map);
//                } else if (zillaName.equals("চুয়াড়াঙ্গ জেলা")) {
//                    imageView.setImageResource(R.drawable.chuadanga_district_map);
//                } else if (zillaName.equals("মেহেদিপুর জেলা")) {
//                    imageView.setImageResource(R.drawable.meherpur_district_map);
//                } else if (zillaName.equals("বাগেরহাট জেলা")) {
//                    imageView.setImageResource(R.drawable.bagerhat_district_map);
//                } else if (zillaName.equals("ঝালকাঠি জেলা")) {
//                    imageView.setImageResource(R.drawable.jhalokati_district_map);
//                } else if (zillaName.equals("পটুয়াখালী জেলা")) {
//                    imageView.setImageResource(R.drawable.patukhali_district_map);
//                } else if (zillaName.equals("পিরোজপুর জেলা")) {
//                    imageView.setImageResource(R.drawable.pirojpur_district_map);
//                } else {
//                    // Default image or error handling code if district name is not recognized
//                }
            }
        }


    }
}