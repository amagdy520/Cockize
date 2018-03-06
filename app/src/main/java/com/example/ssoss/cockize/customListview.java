package com.example.ssoss.cockize;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ssoss on 21/02/2018.
 */

public class customListview extends ArrayAdapter<String> {

    private String[] foodname;
    private String[] des;
    private Integer[] image;
    private Activity context;
    public customListview(Activity context, String[] foodname,String[] des,Integer[] image ) {
        super(context, R.layout.food_ticket,foodname);

        this.context=context;
        this.foodname=foodname;
        this.des=des;
        this.image=image;
    }
        @NonNull
        @Override
        public View getView(final int position, @NonNull View convertView, @NonNull ViewGroup parent ){

           View r=convertView;
           ViewHolder viewHolder=null;
           if (r==null)
           {
               LayoutInflater layoutInflater=context.getLayoutInflater();
               r=layoutInflater.inflate(R.layout.food_ticket,null,true);
               viewHolder= new ViewHolder(r);
               r.setTag(viewHolder);

           }

           else{

               viewHolder= (ViewHolder) r.getTag();

           }
           viewHolder.ivw.setImageResource(image[position]);
           viewHolder.tvw1.setText(foodname[position]);
           viewHolder.tvw2.setText(des[position]);
            return r;
        }

        class ViewHolder
        {
           TextView tvw1;
           TextView tvw2;
           ImageView ivw;
           ViewHolder(View v){
               tvw1=(TextView) v.findViewById(R.id.t1);
               tvw2=(TextView) v.findViewById(R.id.t2);
               ivw=(ImageView) v.findViewById(R.id.i1);
           }

        }
    }

