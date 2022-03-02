package com.hbacakk.categoryapp.adapter;

import android.app.Activity;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hbacakk.categoryapp.R;
import com.hbacakk.categoryapp.model.Category;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder>{

    ArrayList<Category> categoryArrayList;
    Activity activity;

    public CategoryAdapter(ArrayList<Category> categoryArrayList, Activity activity) {
        this.categoryArrayList = categoryArrayList;
        this.activity = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.row_category,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.setData(categoryArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return categoryArrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        RecyclerView recyclerViewProduct;
        TextView textCategoryName,textAll;
        ImageView imageCategory;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerViewProduct=itemView.findViewById(R.id.recyclerViewProduct);
            textAll=itemView.findViewById(R.id.textAll);
            textCategoryName=itemView.findViewById(R.id.textCategoryName);
            imageCategory=itemView.findViewById(R.id.imageCategory);
        }
        void setData(Category category){
            textCategoryName.setText(category.getName());
            imageCategory.setImageResource(category.getCategoryImage());
            recyclerViewProduct.setAdapter(new ProductAdapter(category.getProductArrayList(),activity));
        }
    }
}
