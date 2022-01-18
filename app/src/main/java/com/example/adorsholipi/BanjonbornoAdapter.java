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

public class BanjonbornoAdapter extends RecyclerView.Adapter<BanjonbornoAdapter.ViewHolder>  {

    BanjonbornoData[] banjonbornoData;
    Context context;
    public BanjonbornoAdapter(BanjonbornoData[] banjonbornoData,BanjonBorno activity) {

        this.banjonbornoData = banjonbornoData;
        this.context=activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.banjonborno_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
     final BanjonbornoData banjonbornoDatalist = banjonbornoData[position];
     holder.textViewBb.setText(banjonbornoDatalist.getBanjonWordName());
        holder.textViewB.setText(banjonbornoDatalist.getBletterName());
        holder.imageViewB.setImageResource(banjonbornoDatalist.getBletterImage());
   
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,banjonbornoDatalist.getBanjonWordName(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return banjonbornoData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageViewB;
        TextView textViewB;
        TextView textViewBb;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewB = itemView.findViewById(R.id.imageviewBn);
            textViewB = itemView.findViewById(R.id.textNameBl);
            textViewBb = itemView.findViewById(R.id.textNameBw);
        }
    }
}
