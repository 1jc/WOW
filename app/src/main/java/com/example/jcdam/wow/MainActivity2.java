package com.example.jcdam.wow;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    RecyclerView recyclerView;

    Context context;

    RecyclerView.Adapter recyclerView_Adapter;

    RecyclerView.LayoutManager recyclerViewLayoutManager;

    String[] numbers = {
            "",
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
public boolean onCreateOptionsMenu(Menu menu) {
    MenuInflater mMenuInflater = getMenuInflater();
    mMenuInflater.inflate(R.menu.my_menu, menu);
    return true;
}

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==R.id.action_setting) {
            Toast.makeText(MainActivity2.this, "You have clicked on setting action menu.", Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId()==R.id.action_about_us) {
            Toast.makeText(MainActivity2.this, "This application made by Joette Damo which consists of menus and navigation.", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);

    }



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


















