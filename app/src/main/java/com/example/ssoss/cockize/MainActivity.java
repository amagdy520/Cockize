package com.example.ssoss.cockize;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView lst;
    String[] foodname=
            {
                    "Rosy Rhubarb-Meringue Cake ",
                    "Cranberry Bread",
                    "Marshmallow Fudge",
                    "Chocolate-Caramel Truffles",
                    "Chocolate Heart Cupcakes" ,
                    "Vanilla Bundt Cake",
                    "Chocolate Bundt Cake",
                    "Lemon Cake",
                    "Strawberry Cake",
                    "Strawberry Cream Cake"
            };
    String[] des=
            {
                    "Cook Time 4 hours 30 mins",
                    "Cook Time 1 hour 30 mins",
                    "Cook Time 2 hours 20 mins",
                    "Cook Time 4 hours 45 mins" ,
                    "Cook Time 3 hours" ,
                    "Cook Time 4 hours 15 mins",
                    "Cook Time 1 hours 15 mins",
                    "Cook Time 45 mins",
                    "Cook Time 1 hours",
                    "Cook Time 55 mins"
            };
    Integer[] image=
            {
                    R.drawable.r1,
                    R.drawable.r2,
                    R.drawable.r3,
                    R.drawable.r4,
                    R.drawable.r5,
                    R.drawable.r6,
                    R.drawable.r7,
                    R.drawable.r8,
                    R.drawable.r9,
                    R.drawable.r10
            };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lst= (ListView)findViewById(R.id.listview);

        customListview customListview=new customListview(this,foodname,des,image);
        lst.setAdapter(customListview);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,r1.class);
                intent.putExtra("position",i);
                startActivity(intent);
            }
        });
    }


}

