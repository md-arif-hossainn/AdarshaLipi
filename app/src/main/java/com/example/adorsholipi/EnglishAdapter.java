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

public class EnglishAdapter extends RecyclerView.Adapter<EnglishAdapter.ViewHolder> {

    EnglishData[] englishData;
    Context context;
    public EnglishAdapter(EnglishData[] englishData,EnglishBornomala activity) {
        this.englishData=englishData;
        this.context = activity;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.englishbornomala_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final EnglishData englishDatalist = englishData[position];
        holder.letterTextE.setText(englishDatalist.getLetterneme());
        holder.letterTextEw.setText(englishDatalist.getLetterwordname());
        holder.letterimage.setImageResource(englishDatalist.getLetterphoto());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,englishDatalist.getLetterwordname(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return englishData.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView letterimage;
        TextView letterTextE;
        TextView letterTextEw;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        letterimage = itemView.findViewById(R.id.imageviewEn);
        letterTextE = itemView.findViewById(R.id.textNameEL);
        letterTextEw = itemView.findViewById(R.id.textNameEB);


    }
}

}
