package com.example.districtservice.division_recycler_view;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.districtservice.district_recycler_view.DistrictActivity;
import com.example.districtservice.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivissionAdapter extends RecyclerView.Adapter<DivissionAdapter.MyViewHolder> {

    private Context context;

    private List<DivissionItem> divission_item;

    public DivissionAdapter(Context context, ArrayList<DivissionItem> itemList) {
       this.context=context;
       divission_item=itemList;
    }


    @NonNull
    @Override
    public DivissionAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.divissinon_layout_design, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DivissionAdapter.MyViewHolder holder, int position) {
         DivissionItem item = divission_item.get(position);
        holder.name_image.setImageResource(item.getImage());
        holder.name_divission.setText(item.getDivision());

       
    }

    @Override
    public int getItemCount() {
        return divission_item.size();
    }
    public void filterList(List<DivissionItem>filterlist){
        divission_item=filterlist;
        notifyDataSetChanged();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView name_divission;
        private ImageView name_image;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name_divission = itemView.findViewById(R.id.titleId);
            name_image = itemView.findViewById(R.id.imageId);
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            DivissionItem item=divission_item.get(position);
            String name=item.getDivision();
            System.out.println(name);
            //Log.i("value", "onClick: "+name);

            Intent intent = new Intent(context, DistrictActivity.class);
            intent.putExtra("selectedItem", name);
            context.startActivity(intent);
        }
    }
}
