package com.example.machinetest;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageView banner;
    GridView imagesGV;
    String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        banner = findViewById(R.id.Banner);
        imagesGV = findViewById(R.id.idGVimages);
        url = "https://www.pexels.com/photo/green-and-brown-coconut-trees-under-clear-blue-sky-2486168/";

        ArrayList<ImageModel> ImageModelArrayList = new ArrayList<ImageModel>();
        ImageModelArrayList.add(new ImageModel("Item1", R.drawable.image_logo1));
        ImageModelArrayList.add(new ImageModel("Item2", R.drawable.image_logo2));
        ImageModelArrayList.add(new ImageModel("Item3", R.drawable.image_logo3));
        ImageModelArrayList.add(new ImageModel("Item4", R.drawable.image_logo4));
        ImageModelArrayList.add(new ImageModel("Item5", R.drawable.image_logo5));
        ImageModelArrayList.add(new ImageModel("Item6", R.drawable.image_logo6));
        ImageModelArrayList.add(new ImageModel("Item7", R.drawable.image_logo7));
        ImageModelArrayList.add(new ImageModel("Item8", R.drawable.image_logo3));
        ImageModelArrayList.add(new ImageModel("Item9", R.drawable.image_logo2));
        ImageModelArrayList.add(new ImageModel("Item10", R.drawable.image_logo1));
        ImageModelArrayList.add(new ImageModel("Item11", R.drawable.image_logo6));
        ImageModelArrayList.add(new ImageModel("Item12", R.drawable.image_logo5));
        ImageModelArrayList.add(new ImageModel("Item13", R.drawable.image_logo4));
        ImageModelArrayList.add(new ImageModel("Item14", R.drawable.image_logo7));
        ImageAdapter adapter = new ImageAdapter(this, ImageModelArrayList);
        imagesGV.setAdapter(adapter);
    }
}