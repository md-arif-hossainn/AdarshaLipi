package com.example.adorsholipi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class flowerAdepter extends RecyclerView.Adapter<flowerAdepter.ViewHolder> {


    flowerData[] flowerdata;
    Context context;
    public flowerAdepter(flowerData[] flowerdata,Flower activity) {

        this.flowerdata = flowerdata;
        this.context = activity;



    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.ful_item_list,parent,false);
       ViewHolder viewHolder = new ViewHolder(view);
       return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        final flowerData flowerDatalist = flowerdata[position];
        holder.fultextt.setText(flowerDatalist.getFulEnglishname());
        holder.fultext.setText(flowerDatalist.getFulname());
        holder.fulimage.setImageResource(flowerDatalist.getFulImage());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,flowerDatalist.getFulEnglishname(),Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {

        return flowerdata.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


         TextView fultext;
        TextView fultextt;
        ImageView fulimage;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            fultext = itemView.findViewById(R.id.textNameFuL);
            fultextt = itemView.findViewById(R.id.textNameFUl);
            fulimage = itemView.findViewById(R.id.imageviewFul);

        }
    }
}
