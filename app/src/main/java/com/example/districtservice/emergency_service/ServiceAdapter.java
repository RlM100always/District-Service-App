package com.example.districtservice.emergency_service;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.districtservice.R;

public class ServiceAdapter extends RecyclerView.Adapter<ServiceAdapter.MyViewHolder> {
    Context context;
    String[]police_info ;
    int []images ;

    public ServiceAdapter(Context context, String[] divisionsName, int[] images) {
        this.context = context;
        this.police_info = divisionsName;
        this.images = images;
    }

    @NonNull
    @Override
    public ServiceAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.service_layout_design,parent,false);

        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ServiceAdapter.MyViewHolder holder, int position) {
        holder.name_image.setImageResource(images[position]);
        holder.police_info.setText(police_info[position]);
    }

    @Override
    public int getItemCount() {

        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView police_info;
        private ImageView name_image;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            police_info = itemView.findViewById(R.id.policeInfo);
            name_image = itemView.findViewById(R.id.policeImageId);

        }
    }
}
