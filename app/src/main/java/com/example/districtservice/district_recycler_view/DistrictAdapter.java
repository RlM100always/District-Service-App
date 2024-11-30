package com.example.districtservice.district_recycler_view;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.districtservice.DistrictPage;
import com.example.districtservice.R;

public class DistrictAdapter extends RecyclerView.Adapter<DistrictAdapter.MyViewHolder> {

    Context context;
    String[]districtName ;
    int []images;

    public DistrictAdapter(Context context, String[] districtName, int[] images) {
        this.context = context;
        this.districtName = districtName;
        this.images = images;
    }

    @NonNull
    @Override
    public DistrictAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.district_layout_design,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DistrictAdapter.MyViewHolder holder, int position) {
        holder.name_image.setImageResource(images[position]);
        holder.name_district.setText(districtName[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView name_district;
        private ImageView name_image;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name_district = itemView.findViewById(R.id.titleId1);
            name_image = itemView.findViewById(R.id.imageId1);

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
           int position = getAdapterPosition();
           String zillaName = districtName [position];
           int size=districtName.length;

           Intent intent = new Intent(context, DistrictPage.class);
           intent.putExtra("selectedItem1",zillaName);
           context.startActivity(intent);


        }
    }
}