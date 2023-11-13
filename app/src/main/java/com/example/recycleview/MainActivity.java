package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ContactModel> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();
    }

    private void addData() {
        elements = new ArrayList<>();
        elements.add(new ContactModel(
                "irfi",
                "08612391283223",
                "Available",
                "#ff1"
        ));
        elements.add(new ContactModel(
                "rama",
                "0893274296487",
                "Available",
                "#ff0"
        ));
        elements.add(new ContactModel(
                "faiz",
                "0882693168712",
                "Available",
                "#0f1"
        ));
        elements.add(new ContactModel(
                "ilham",
                "0867813273628",
                "Available",
                "#f0f"
        ));

        ContactAdapter adapter = new ContactAdapter(elements, this, new ContactAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(ContactModel item) {
                detail(item);
            }
        });

        RecyclerView recyclerView = findViewById(R.id.rvContact);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private void detail(ContactModel item) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("contactModel", item);
        startActivity(intent);
    }
}