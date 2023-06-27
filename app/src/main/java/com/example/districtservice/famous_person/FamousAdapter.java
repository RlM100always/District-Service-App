package com.example.districtservice.famous_person;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.districtservice.R;


public class FamousAdapter extends RecyclerView.Adapter<FamousAdapter.MyViewHolder> {
    Context context;
    String []description ;
    int []images;
    public FamousAdapter(Context famousPerson, String[] description, int[] images) {
        context=famousPerson;
        this.description=description;
        this.images=images;
    }


    @NonNull
    @Override
    public FamousAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.design_layout_famous_person,parent,false);

        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull FamousAdapter.MyViewHolder holder, int position) {
        holder.imageView.setImageResource(images[position]);
        holder.textView.setText(description[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        private ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.info);
            imageView = itemView.findViewById(R.id.image);

        }
    }
}
