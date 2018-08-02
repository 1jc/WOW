package com.example.jcdam.wow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;

    RelativeLayout relativeLayout;

    RecyclerView recyclerView;

    Context context;

    RecyclerView.Adapter recyclerView_Adapter;

    RecyclerView.LayoutManager recyclerViewLayoutManager;

    String[] buttons = {
            "",
            "",

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
         Toast.makeText(MainActivity.this, "You have clicked on setting action menu.", Toast.LENGTH_SHORT).show();
     }
        if(item.getItemId()==R.id.action_about_us) {
            Toast.makeText(MainActivity.this, "This application made by Joette Damo which consists of menus and navigation.", Toast.LENGTH_SHORT).show();
        }
                return super.onOptionsItemSelected(item);

        }




   @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        context = getApplicationContext();


        addListenerOnButton();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view1);

        //Change 2 to your choice because here 2 is the number of Grid layout Columns in each row.
        recyclerViewLayoutManager = new GridLayoutManager(context, 2);

        recyclerView.setLayoutManager(recyclerViewLayoutManager);

        recyclerView_Adapter = new RecyclerViewAdapter(context, buttons);

        recyclerView.setAdapter(recyclerView_Adapter);


    }

    public void addListenerOnButton() {

        final Context context = this;


     Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, MainActivity2.class);
                startActivity(intent);

                Context context = getApplicationContext();
                CharSequence text = "Hello toast!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }

        });

    }

}






