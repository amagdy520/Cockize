package com.example.ssoss.cockize;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class r1 extends AppCompatActivity {

    int position = 0;

    ImageView img;
    TextView txt1, txt2, txt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r1);
        position = getIntent().getExtras().getInt("position");

        img = (ImageView) findViewById(R.id.imageView2);
        txt1 = (TextView) findViewById(R.id.textView);
        txt2 = (TextView) findViewById(R.id.textView2);
        txt3 = (TextView) findViewById(R.id.textView3);

        String[] foodName = getResources().getStringArray(R.array.foodName);
        String[] foodTime = getResources().getStringArray(R.array.foodTime);
        String[] foodDisc = getResources().getStringArray(R.array.foodDisc);


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


        switch (position){
            case 0:
                img.setImageResource(image[0]);
                txt1.setText(foodName[0]);
                txt2.setText(foodTime[0]);
                txt3.setText(foodDisc[0]);
                break;
            case 1:
                img.setImageResource(image[1]);
                txt1.setText(foodName[1]);
                txt2.setText(foodTime[1]);
                txt3.setText(foodDisc[1]);
                break;
            case 2:
                img.setImageResource(image[2]);
                txt1.setText(foodName[2]);
                txt2.setText(foodTime[2]);
                txt3.setText(foodDisc[2]);
                break;
            case 3:
                img.setImageResource(image[3]);
                txt1.setText(foodName[3]);
                txt2.setText(foodTime[3]);
                txt3.setText(foodDisc[3]);
                break;
            case 4:
                img.setImageResource(image[4]);
                txt1.setText(foodName[4]);
                txt2.setText(foodTime[4]);
                txt3.setText(foodDisc[4]);
                break;
            case 5:
                img.setImageResource(image[5]);
                txt1.setText(foodName[5]);
                txt2.setText(foodTime[5]);
                txt3.setText(foodDisc[5]);
                break;
            case 6:
                img.setImageResource(image[6]);
                txt1.setText(foodName[6]);
                txt2.setText(foodTime[6]);
                txt3.setText(foodDisc[6]);
                break;
            case 7:
                img.setImageResource(image[7]);
                txt1.setText(foodName[7]);
                txt2.setText(foodTime[7]);
                txt3.setText(foodDisc[7]);
                break;
            case 8:
                img.setImageResource(image[8]);
                txt1.setText(foodName[8]);
                txt2.setText(foodTime[8]);
                txt3.setText(foodDisc[8]);
                break;
            case 9:
                img.setImageResource(image[9]);
                txt1.setText(foodName[9]);
                txt2.setText(foodTime[9]);
                txt3.setText(foodDisc[9]);
                break;
        }
    }

}
