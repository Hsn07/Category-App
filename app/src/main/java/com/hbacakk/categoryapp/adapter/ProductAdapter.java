package com.hbacakk.categoryapp.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hbacakk.categoryapp.R;
import com.hbacakk.categoryapp.model.Product;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder>{

    ArrayList<Product> productArrayList;
    Activity activity;

    public ProductAdapter(ArrayList<Product> productArrayList, Activity activity) {
        this.productArrayList = productArrayList;
        this.activity = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.row_product,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.setData(productArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return productArrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView textProductName;
        ImageView imageProduct;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textProductName=itemView.findViewById(R.id.textProductName);
            imageProduct=itemView.findViewById(R.id.imageProduct);

        }
        public void setData(Product product){
            textProductName.setText(product.getName());
            imageProduct.setImageResource(product.getProductImage());
        }
    }
}
