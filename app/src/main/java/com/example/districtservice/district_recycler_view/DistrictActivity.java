package com.example.districtservice.district_recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.districtservice.R;

public class DistrictActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    public DistrictAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_district);




        Bundle bundle=getIntent().getExtras();
        String divissionName = bundle.getString("selectedItem");

        if(bundle != null){

            if(divissionName.equals("Dhaka Division")){
                activeDhakaDivissionDistrict();
            }else if(divissionName.equals("Chittagong Division")){
                activeChittagongDivissionDistrict();
            }
            else if(divissionName.equals("Rajshahi Division")){
                activeRajshahiDivissionDistrict();
            }
            else if(divissionName.equals("Sylhet Division")){
                activeSylhetDivissionDistrict();
            }
            else if(divissionName.equals("Mymensingh Division")){
                 activeMaymensinghDivissionDistrict();
            }
            else if(divissionName.equals("Barisal Division")){
                activeBarisalDivissionDistrict();
            }
            else if(divissionName.equals("Rangpur Division")){
                activeRangpurDivissionDistrict();
            }else if(divissionName.equals("Khulna Division")){
                activeKhulanDivissionDistrict();
            }

        }


    }

    public void activeDhakaDivissionDistrict(){
        recyclerView=findViewById(R.id.recyclerviewId);
        String []districtName;
        districtName=getResources().getStringArray(R.array.dhaka_district_name);
        int []images= {
                R.drawable.dhakadistrict, R.drawable.gazipur, R.drawable.kisorgong,
                R.drawable.manikgonj, R.drawable.monsigonj, R.drawable.narayanganj,
                R.drawable.norsindi, R.drawable.tangail,R.drawable.foridpur,R.drawable.madaripur,
                R.drawable.rajbari,R.drawable.shariatpur,R.drawable.gopalgonj

        };
        adapter=new DistrictAdapter(DistrictActivity.this,districtName,images);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    public void activeChittagongDivissionDistrict(){

        recyclerView=findViewById(R.id.recyclerviewId);
        String []districtName;
        districtName=getResources().getStringArray(R.array.chittagong_district_name);
        int []images= {
                R.drawable.chittagongzila, R.drawable.coxsbajar, R.drawable.khagracori,
                R.drawable.bandarbanzilla, R.drawable.rangamati, R.drawable.lokkhipur,
                R.drawable.chandpur, R.drawable.fenei,R.drawable.brammonbaria,R.drawable.noakhali,
                R.drawable.comilla

        };
        adapter=new DistrictAdapter(DistrictActivity.this,districtName,images);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    public void activeRajshahiDivissionDistrict(){
        recyclerView=findViewById(R.id.recyclerviewId);
        String []districtName;
        districtName=getResources().getStringArray(R.array.rajshahi_district_name);
        int []images= {
                R.drawable.rajshahizilla, R.drawable.nouga, R.drawable.sirajgong,
                R.drawable.paban, R.drawable.bogura, R.drawable.joypurhat,
                R.drawable.capainobabgong, R.drawable.nator
        };
        adapter=new DistrictAdapter(DistrictActivity.this,districtName,images);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    public void activeSylhetDivissionDistrict(){
        recyclerView=findViewById(R.id.recyclerviewId);
        String []districtName;
        districtName=getResources().getStringArray(R.array.sylhet_district_name);
        int []images= {
                R.drawable.sylhetzilla, R.drawable.moulovibazar, R.drawable.hobigong,
                R.drawable.sonamgonj
        };
        adapter=new DistrictAdapter(DistrictActivity.this,districtName,images);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void activeMaymensinghDivissionDistrict(){
        recyclerView=findViewById(R.id.recyclerviewId);
        String []districtName;
        districtName=getResources().getStringArray(R.array.mymensingh_district_name);
        int []images= {
                R.drawable.maymonsingh, R.drawable.sherpur, R.drawable.netrokona,
                R.drawable.jamalpur

        };
        adapter=new DistrictAdapter(DistrictActivity.this,districtName,images);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    public void activeRangpurDivissionDistrict(){
        recyclerView=findViewById(R.id.recyclerviewId);
        String []districtName;
        districtName=getResources().getStringArray(R.array.rangpur_district_name);
        int []images= {
                R.drawable.rangpurzilla, R.drawable.dinajpur, R.drawable.gaibandha,
                R.drawable.kurigram, R.drawable.lalmonirhat, R.drawable.nilphamari,
                R.drawable.ponchogor
        };
        adapter=new DistrictAdapter(DistrictActivity.this,districtName,images);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    public void activeKhulanDivissionDistrict(){
        recyclerView=findViewById(R.id.recyclerviewId);
        String []districtName;
        districtName=getResources().getStringArray(R.array.khulna_district_name);
        int []images= {
                R.drawable.khulna, R.drawable.bagherhat, R.drawable.chuadanga,
                R.drawable.jesshore, R.drawable.meherpur, R.drawable.norial,
                R.drawable.kostia, R.drawable.magura,R.drawable.jhenaidaha,R.drawable.satkhira,

        };
        adapter=new DistrictAdapter(DistrictActivity.this,districtName,images);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    public void activeBarisalDivissionDistrict(){

        recyclerView=findViewById(R.id.recyclerviewId);
        String []districtName;
        districtName=getResources().getStringArray(R.array.barisal_district_name);
        int []images= {
                R.drawable.barisalzilla, R.drawable.potuakhali, R.drawable.pirojpur,
                R.drawable.vola, R.drawable.jhalokhati, R.drawable.borgona,

        };
        adapter=new DistrictAdapter(DistrictActivity.this,districtName,images);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }







}