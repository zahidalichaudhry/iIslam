package com.itpvt.iislam.Activities.Adapters;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.itpvt.iislam.Activities.NamazFzail;
import com.itpvt.iislam.Activities.PojoClass.AzkarWazaifPojo;

import com.itpvt.iislam.R;

import java.util.ArrayList;

public class AzkarAdapter extends RecyclerView.Adapter<AzkarAdapter.MyViewHolder>{
    ArrayList<AzkarWazaifPojo> arrayList= new ArrayList<>();
    Activity activity;

    public AzkarAdapter(ArrayList<AzkarWazaifPojo> arrayList, Activity activity) {
        this.arrayList = arrayList;
        this.activity = activity;
    }

    @NonNull
    @Override
    public AzkarAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.masnoon_dua_item,viewGroup,false);
        return new AzkarAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AzkarAdapter.MyViewHolder myViewHolder,final int i) {
        myViewHolder.Title.setText(arrayList.get(i).getTitle());
        myViewHolder.Title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity,NamazFzail.class);
                intent.putExtra("Title",arrayList.get(i).getTitle());
                intent.putExtra("TitleUrdu",arrayList.get(i).getTitleUdru());
                intent.putExtra("Arbi",arrayList.get(i).getArbi());



                activity.startActivity(intent);
            }
        });

    }



    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    public static class MyViewHolder extends  RecyclerView.ViewHolder
    {
        TextView Title;
        public MyViewHolder(View itemView) {
            super(itemView);
            Title=(TextView)itemView.findViewById(R.id.Title);

//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    new AlertDialog.Builder(itemView.getContext())
//                            .setTitle("Hala")
//                            .setMessage(currentPair.second)
//                            .show();
//                }
//            });
//        }
        }
    }
}
