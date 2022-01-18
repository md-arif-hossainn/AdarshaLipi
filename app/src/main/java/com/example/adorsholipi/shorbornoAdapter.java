package com.example.adorsholipi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

public class shorbornoAdapter extends RecyclerView.Adapter<shorbornoAdapter.ViewHolder> {

    shorbornoData[] shorbornodata;
    Context context;

    public shorbornoAdapter(shorbornoData[] shorbornodata,shorborno activity) {
     this.shorbornodata = shorbornodata;
     this.context = activity;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.shorborno_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
     final shorbornoData datalist = shorbornodata[position];
    holder.textViewName.setText(datalist.getShorbornoWordName());
        holder.textViewDate.setText(datalist.getLetterName());
        holder.ImageView.setImageResource(datalist.getLetterImage());


     holder.itemView.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

             Toast.makeText(context,datalist.getLetterName(),Toast.LENGTH_SHORT).show();
         }
     });
    }

    @Override
    public int getItemCount() {
        return shorbornodata.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView ImageView;
        TextView textViewName;
        TextView textViewDate;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ImageView= itemView.findViewById(R.id.imageviewSh);
            textViewName= itemView.findViewById(R.id.textNameL);
            textViewDate= itemView.findViewById(R.id.textdateP);

        }
    }
}
