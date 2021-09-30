package com.example.android2_tuan4;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.File;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    private List<Plant> plants;
    private Context context;

    public ItemAdapter(List<Plant> plants, Context context) {
        this.plants = plants;
        this.context = context;
    }

    @NonNull
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(this.context);
        View employeeView = inflater.inflate(R.layout.fragment_plant_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(employeeView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ViewHolder holder, int position) {
        Plant plant = this.plants.get(position);

        holder.txtName.setText(plant.getName());
        holder.txtPrice.setText(Double.toString(plant.getPrice()));

    }

    @Override
    public int getItemCount() {
        return this.plants.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txtName;
        private TextView txtPrice;
        private ImageView imgImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txtName);
            txtPrice = itemView.findViewById(R.id.txtPrice);
            imgImage = itemView.findViewById(R.id.imgItem);
        }
    }
}
