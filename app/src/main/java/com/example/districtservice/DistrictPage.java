package com.example.districtservice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.districtservice.documentary_video_service.DocumentaryWebView;
import com.example.districtservice.emergency_service.ServiceActivity;
import com.example.districtservice.famous_person.FamousPerson;
import com.example.districtservice.map_service.MapActivity;
import com.example.districtservice.newspaper_service.NewsPaperWebview;
import com.example.districtservice.weikipedia_service.DistrictWebView;

public class DistrictPage extends AppCompatActivity implements View.OnClickListener  {

    private CardView wikipedia,news,bloodDonner,map,emergencyService,famousperson,documentaryvideo;
    private String zillaName;
    private int size;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_district_page);

        wikipedia=findViewById(R.id.weikipedia);
        news=findViewById(R.id.newsPaper);
        bloodDonner=findViewById(R.id.famousperson);
        map=findViewById(R.id.map);
        documentaryvideo=findViewById(R.id.documentaryVideo);
        emergencyService=findViewById(R.id.emergencyService);

        wikipedia.setOnClickListener(this);
        news.setOnClickListener(this);
        bloodDonner.setOnClickListener(this);
        map.setOnClickListener(this);
        emergencyService.setOnClickListener(this);
        documentaryvideo.setOnClickListener(this);



        Bundle bundle=getIntent().getExtras();
        zillaName=bundle.getString("selectedItem1"); //gajipur
        size = getIntent().getIntExtra("selectedItem1",0 );




    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.weikipedia){
            Intent intent=new Intent(DistrictPage.this, DistrictWebView.class);
            intent.putExtra("key",zillaName);
            startActivity(intent);
        }
        if(v.getId()==R.id.emergencyService){
            Intent intent1 = new Intent(DistrictPage.this, ServiceActivity.class);
            intent1.putExtra("key",zillaName);
            startActivity(intent1);
        }
        else if(v.getId()==R.id.famousperson){
            Intent intent1 = new Intent(DistrictPage.this, FamousPerson.class);
            intent1.putExtra("key",zillaName);
            startActivity(intent1);
        }
        else if(v.getId()==R.id.newsPaper){
              Intent intent= new Intent(this, NewsPaperWebview.class);
              intent.putExtra("key",zillaName);
              startActivity(intent);
        }
        else if(v.getId()==R.id.map){
            Intent intent= new Intent(this, MapActivity.class);
            intent.putExtra("key",zillaName);
            startActivity(intent);
        }
        else if(v.getId()==R.id.documentaryVideo){
            Intent intent= new Intent(this, DocumentaryWebView.class);
            intent.putExtra("key",zillaName);
            startActivity(intent);
        }

    }
}