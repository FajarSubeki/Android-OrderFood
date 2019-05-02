package com.example.orderfood.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.orderfood.Interface.ItemClickListener;
import com.example.orderfood.R;

public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView txtMenuName;
    public ImageView imageView;

    private ItemClickListener itemClickListener2;

    public MenuViewHolder(View itemView) {
        super(itemView);

        txtMenuName = itemView.findViewById(R.id.menu_name);
        imageView = itemView.findViewById(R.id.menu_image);

        itemView.setOnClickListener(this);
    }

    public void setItemClickListener2(ItemClickListener itemClickListener2) {
        this.itemClickListener2 = itemClickListener2;
    }

    @Override
    public void onClick(View view) {
        itemClickListener2.onClick(view, getAdapterPosition(), false);
    }
}
