package com.example.districtservice.division_recycler_view;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.SearchView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.districtservice.R;

import java.util.ArrayList;
import java.util.List;

public class DivissionActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<DivissionItem> filteredList;
    private ArrayList<DivissionItem> itemList;
    private DivissionAdapter adapter;
    private EditText editText;
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divission);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("District Service");
        actionBar.setSubtitle("Welcome to our app");
        actionBar.setLogo(R.drawable.baseline_brightness_7_24);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

        recyclerView = findViewById(R.id.recyclerviewId);
        // searchView = findViewById(R.id.search_bar_id);
        editText = findViewById(R.id.edit_text_id);

        itemList = new ArrayList<>();
        itemList.add(new DivissionItem(R.drawable.dhakadivission, "Dhaka Division"));
        itemList.add(new DivissionItem(R.drawable.chitagongdivission, "Chittagong Division"));
        itemList.add(new DivissionItem(R.drawable.rajshahidivission, "Rajshahi Division"));
        itemList.add(new DivissionItem(R.drawable.sylhetdivission, "Sylhet Division"));
        itemList.add(new DivissionItem(R.drawable.mymynshingdivission, "Mymensingh Division"));
        itemList.add(new DivissionItem(R.drawable.barisaldivission, "Barisal Division"));
        itemList.add(new DivissionItem(R.drawable.rangpurdivission, "Rangpur Division"));
        itemList.add(new DivissionItem(R.drawable.khulnadivission, "Khulna Division"));

        adapter = new DivissionAdapter(DivissionActivity.this, itemList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        filteredList = new ArrayList<>(itemList);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });

    }

    private void filter(String text){
        List<DivissionItem> filterList= new ArrayList<>();
        for(DivissionItem obj : itemList ){
            if(obj.getDivision().toLowerCase().contains(text.toLowerCase())){
                filterList.add(obj);
            }
        }
        adapter.filterList(filterList);
    }
}
