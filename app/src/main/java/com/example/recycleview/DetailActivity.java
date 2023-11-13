package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView tvNameDetail, tvHpDetail, tvStatusDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvNameDetail = findViewById(R.id.tvNameDetail);
        tvHpDetail = findViewById(R.id.tvHpDetail);
        tvStatusDetail = findViewById(R.id.tvStatusDetail);

        ContactModel element = (ContactModel) getIntent().getSerializableExtra("ContactModel");
        tvNameDetail.setText(element.getName());
        tvNameDetail.setTextColor(Color.parseColor(element.getColor()));
        tvHpDetail.setText(element.getNumber());
        tvStatusDetail.setText(element.getStatus());
    }
}