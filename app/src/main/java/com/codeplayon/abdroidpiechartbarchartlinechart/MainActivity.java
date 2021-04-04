package com.codeplayon.abdroidpiechartbarchartlinechart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button SimpleBar , StackedBar, GroupBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FindViewById();
    }

    public void FindViewById(){
        SimpleBar=findViewById(R.id.SimpleBar);
        StackedBar=findViewById(R.id.StackedBar);
        GroupBar=findViewById(R.id.GroupBar);

        SimpleBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        StackedBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Intent intent = new Intent(MainActivity.this,StackeBarChart.class);
                startActivity(intent);
            }
        });

        GroupBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,GroupBarChart.class);
                startActivity(intent);
            }
        });
    }
}

