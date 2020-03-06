package com.google.perpustakaandigital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class moveDetail extends AppCompatActivity {

    public static final String EXTRA_PHOTO = "extra_photo";
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_DETAIL = "extra_detail";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView photox = findViewById(R.id.img_item_photo);
        TextView namex = findViewById(R.id.tv_item_name);
        TextView detailx = findViewById(R.id.tv_item_detail);

        Glide.with(this).load(getIntent().getIntExtra(EXTRA_PHOTO,0)).into(photox);
        namex.setText(getIntent().getStringExtra(EXTRA_NAME));
        detailx.setText(getIntent().getStringExtra(EXTRA_DETAIL));
    }
}
