package com.example.recycleviewex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Product> listProduct = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        ProductAdapter adapter = new ProductAdapter(this,listProduct);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
        RecyclerView rvProduct = findViewById(R.id.rvProduct);
        rvProduct.setLayoutManager(layoutManager);
        rvProduct.setAdapter(adapter);
    }

    private void initData() {
        listProduct.add(new Product("Product1","500 0000", R.drawable.p1));
        listProduct.add(new Product("Product2","600 0000", R.drawable.p2));
        listProduct.add(new Product("Product3","700 0000", R.drawable.p3));
        listProduct.add(new Product("Product4","800 0000", R.drawable.p4));
        listProduct.add(new Product("Product5","100 0000", R.drawable.p5));
        listProduct.add(new Product("Product6","300 0000", R.drawable.p6));
    }
}