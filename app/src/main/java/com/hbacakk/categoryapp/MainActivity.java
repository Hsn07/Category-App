package com.hbacakk.categoryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.hbacakk.categoryapp.adapter.CategoryAdapter;
import com.hbacakk.categoryapp.model.Category;
import com.hbacakk.categoryapp.model.Product;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewCategory;
    ArrayList<Category> categoryArrayList;
    CategoryAdapter categoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /***************************************************/
        recyclerViewCategory=findViewById(R.id.recyclerViewCategory);
        categoryArrayList=new ArrayList<>();
        categoryAdapter=new CategoryAdapter(categoryArrayList,this);

        recyclerViewCategory.setAdapter(categoryAdapter);

        setCategoryData();
        /***************************************************/
    }

    private void setCategoryData() {
        Category fashion=new Category("Fashion",R.drawable.fashion);
        ArrayList<Product> productArrayList=new ArrayList<>();
        productArrayList.add(new Product("Latest",R.drawable.latest));
        productArrayList.add(new Product("Men",R.drawable.men));
        productArrayList.add(new Product("Women",R.drawable.women));
        productArrayList.add(new Product("Kids",R.drawable.kids));
        fashion.setProductArrayList(productArrayList);

        Category beauty=new Category("Beauty",R.drawable.beauty);
        ArrayList<Product> beautyproductArrayList=new ArrayList<>();
        beautyproductArrayList.add(new Product("Skincare",R.drawable.skincare));
        beautyproductArrayList.add(new Product("Haircare",R.drawable.haircare));
        beautyproductArrayList.add(new Product("Fragrance",R.drawable.fragrance));
        beautyproductArrayList.add(new Product("Makeup",R.drawable.makeup));
        beauty.setProductArrayList(beautyproductArrayList);

        Category appliances=new Category("Appliances",R.drawable.group);
        ArrayList<Product> appliancesproductArrayList=new ArrayList<>();
        appliancesproductArrayList.add(new Product("Television",R.drawable.tv));
        appliancesproductArrayList.add(new Product("Washing",R.drawable.washingmachines));
        appliancesproductArrayList.add(new Product("Refrigera",R.drawable.refrigerator));
        appliancesproductArrayList.add(new Product("Kitchen",R.drawable.kitchen));
        appliances.setProductArrayList(appliancesproductArrayList);

        Category furnitures=new Category("Furnitures",R.drawable.furnitures);
        ArrayList<Product> furnituresproductArrayList=new ArrayList<>();
        furnituresproductArrayList.add(new Product("Sofa Set",R.drawable.sofa));
        furnituresproductArrayList.add(new Product("Dining Set",R.drawable.diningset));
        furnituresproductArrayList.add(new Product("Laptop Table",R.drawable.laptoptable));
        furnituresproductArrayList.add(new Product("Wardrobe",R.drawable.wardrobe));
        furnitures.setProductArrayList(furnituresproductArrayList);



        categoryArrayList.add(fashion);
        categoryArrayList.add(beauty);
        categoryArrayList.add(appliances);
        categoryArrayList.add(furnitures);

        categoryAdapter.notifyDataSetChanged();
    }
}