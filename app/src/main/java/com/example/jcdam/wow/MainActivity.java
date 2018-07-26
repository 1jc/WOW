package com.example.jcdam.wow;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import android.support.v7.widget.LinearLayoutManager;
import android.view.Window;
import android.widget.TextView;
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

    public void addListenerOnButton(){

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




