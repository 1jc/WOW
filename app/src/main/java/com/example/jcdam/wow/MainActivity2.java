package com.example.jcdam.wow;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity2 extends AppCompatActivity {

    RecyclerView recyclerView;

    Context context;

    RecyclerView.Adapter recyclerView_Adapter;

    RecyclerView.LayoutManager recyclerViewLayoutManager;

    String[] numbers = {
            "ACDC Rock",
            "Adbrea Bocelli Classical",
            "Celine Dion Contemporary",
            "Toby Keith Country",
            "Willie Nelson Country",
            "PussyCat Dolls HipHop",
            "Santanta Latino Jazz",
            "Barry White Pop",
            "Led Zepplin Rock",
            "Nat Cole Jazz",
            "Shakira BellyDancing",
            "Hawaiian Polynesian",
            "Tahitian Polynesian",

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        context = getApplicationContext();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view1);

        //Change 2 to your choice because here 2 is the number of Grid layout Columns in each row.
        recyclerViewLayoutManager = new GridLayoutManager(context, 1);

        recyclerView.setLayoutManager(recyclerViewLayoutManager);

        recyclerView_Adapter = new RecyclerViewAdapter(context,numbers);

        recyclerView.setAdapter(recyclerView_Adapter);

    }
}


















