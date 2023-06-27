package com.example.districtservice.famous_person;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.districtservice.R;

public class FamousPerson extends AppCompatActivity {

    private RecyclerView recyclerView;
    private String[] description;
    private FamousAdapter adapter;
    private int[] images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famous_person);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String zillaname = bundle.getString("key");
        //    Log.i("key", "onCreate: " + zillaname);

            if (zillaname != null) {
                if (zillaname.equals("ঢাকা জেলা") || zillaname.equals("গাজীপুর জেলা") || zillaname.equals("কিশোরগঞ্জ জেলা") || zillaname.equals("মানিকগঞ্জ জেলা") ||
                        zillaname.equals("মুন্সিগঞ্জ জেলা") || zillaname.equals("নারায়ণগঞ্জ জেলা") || zillaname.equals("নরসিংদী জেলা") || zillaname.equals("টাঙ্গাইল জেলা") ||
                        zillaname.equals("ফরিদপুর জেলা") || zillaname.equals("মাদারীপুর জেলা") || zillaname.equals("শরিয়তপুর জেলা") || zillaname.equals("রাজবাড়ি জেলা") ||
                        zillaname.equals("গোপালগঞ্জ জেলা")) {
                 //   Log.i("key", "onCreate: " + zillaname);
                        dhakaDivisionService();
                } else if (zillaname.equals("চট্টগ্রাম জেলা") || zillaname.equals("কক্সবাজার জেলা") || zillaname.equals("খাগড়াছড়ি জেলা") || zillaname.equals("বান্দরবান জেলা") ||
                        zillaname.equals("রাঙ্গামাটি জেলা") || zillaname.equals("লক্ষ্মীপুর জেলা") || zillaname.equals("চাঁদপুর জেলা") || zillaname.equals("ফেনী জেলা") ||
                        zillaname.equals("ব্রাহ্মণবাড়িয়া") || zillaname.equals("নোয়াখালী জেলা") || zillaname.equals("কুমিল্লা জেলা")) {
                    // chittagongDivisionService();
                } else if (zillaname.equals("রাজশাহী জেলা") || zillaname.equals("নওগাঁ জেলা") || zillaname.equals("সিরাজগঞ্জ জেলা") || zillaname.equals("পাবনা জেলা") ||
                        zillaname.equals("বগুড়া জেলা") || zillaname.equals("জয়পুরহাট জেলা") || zillaname.equals("চাঁপাইনবাবগঞ্জ জেলা") || zillaname.equals("নাটোর জেলা")) {
                    // rajshahiDivisionService();
                } else if (zillaname.equals("সিলেট জেলা") || zillaname.equals("মৌলভীবাজার জেলা") || zillaname.equals("হবিগঞ্জ জেলা") || zillaname.equals("সুনামগঞ্জ জেলা")) {
                    // sylhetDivisioService();
                } else if (zillaname.equals("ময়মনসিংহ জেলা") || zillaname.equals("শেরপুর জেলা") || zillaname.equals("জামালপুর জেলা") || zillaname.equals("নেত্রকোণা জেলা")) {
                    // mymensinghDivision();
                } else if (zillaname.equals("বরিশাল জেলা") || zillaname.equals("পটুয়াখালী জেলা") || zillaname.equals("পিরোজপুর জেলা") || zillaname.equals("ভোলা জেলা") ||
                        zillaname.equals("ঝালকাঠি জেলা") || zillaname.equals("বরগুনা জেলা")) {
                    // barisalDivision();
                } else if (zillaname.equals("খুলনা জেলা") || zillaname.equals("বাগেরহাট জেলা") || zillaname.equals("চুয়াডাঙ্গা জেলা") || zillaname.equals("যশোর জেলা") ||
                        zillaname.equals("মেহেরপুর জেলা") || zillaname.equals("নড়াইল জেলা") || zillaname.equals("কুষ্টিয়া জেলা") || zillaname.equals("মাগুরা জেলা") ||
                        zillaname.equals("ঝিনাইদহ জেলা") || zillaname.equals("সাতক্ষীরা জেলা")) {
                    // khulnaDivision();
                } else if (zillaname.equals("রংপুর জেলা") || zillaname.equals("দিনাজপুর জেলা") || zillaname.equals("গাইবান্ধা জেলা") || zillaname.equals("ঠাকুরগাঁও জেলা") ||
                        zillaname.equals("পঞ্চগড় জেলা")) {
                    // rangpurDivision();
                } else {
                    // Invalid division name
                    //Log.i("key", "Invalid division name");
                }
            }
        }
    }

    public void dhakaDivisionService() {
        recyclerView = findViewById(R.id.recyclerviewId);

        images = new int[]{
                R.drawable.shekh_hasina, R.drawable.asraful, R.drawable.sakib, R.drawable.nazrul, R.drawable.shohidul,
                R.drawable.shamsor

        };
        description = getResources().getStringArray(R.array.dhakadivision_famous_person);
        adapter = new FamousAdapter(FamousPerson.this, description, images);
        recyclerView.setAdapter(adapter);
        Log.i("key", "onCreate: Rakib" );
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
