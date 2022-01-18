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



public class FruitsAdapter extends RecyclerView.Adapter<FruitsAdapter.ViewHolder> {

    FruitsData[] fruitsData;
    Context context;
    public FruitsAdapter(FruitsData[] fruitsData,Fruits activity) {
        this.fruitsData = fruitsData;
        this.context = activity;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.fol_iten_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final FruitsData fruitsDatalist = fruitsData[position];
        holder.textViewfol.setText(fruitsDatalist.getFolname());
        holder.textViewfoll.setText(fruitsDatalist.getFolnameE());
        holder.imageViewfoll.setImageResource(fruitsDatalist.getFolimage());


       holder.itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(context,fruitsDatalist.getFolnameE(),Toast.LENGTH_SHORT).show();
           }
       });

    }

    @Override
    public int getItemCount() {
        return fruitsData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        TextView textViewfol;
        TextView textViewfoll;
        ImageView imageViewfoll;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewfol = itemView.findViewById(R.id.textNamefol);
            textViewfoll =  itemView.findViewById(R.id.textNamfoll);
           imageViewfoll = itemView.findViewById(R.id.imageviewFol);

        }
    }
}
