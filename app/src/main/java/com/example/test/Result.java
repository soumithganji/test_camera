package com.example.test;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bitmap imageBitmap = (Bitmap) getIntent().getBundleExtra("imagedata").get("data");
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageBitmap(imageBitmap);

    }

}
