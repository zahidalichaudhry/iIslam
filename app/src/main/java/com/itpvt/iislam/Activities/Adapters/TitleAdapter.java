package com.itpvt.iislam.Activities.Adapters;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.itpvt.iislam.Activities.MasnoonDuaDetails;
import com.itpvt.iislam.Activities.Masnoon_dua_list;
import com.itpvt.iislam.Activities.PojoClass.DuaQuraniPojo;
import com.itpvt.iislam.Activities.PojoClass.MasnoonDuaPoji;
import com.itpvt.iislam.R;

import java.util.ArrayList;

public class TitleAdapter extends RecyclerView.Adapter<TitleAdapter.MyViewHolder>
{
    ArrayList<MasnoonDuaPoji> arrayList= new ArrayList<>();
    Activity activity;

    public TitleAdapter(ArrayList<MasnoonDuaPoji> arrayList, Activity activity)
    {
        this.arrayList = arrayList;
        this.activity = activity;
    }

    @NonNull
    @Override
    public TitleAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.masnoon_dua_item,viewGroup,false);
        return new TitleAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TitleAdapter.MyViewHolder myViewHolder, final int i) {
        myViewHolder.Title.setText(arrayList.get(i).getTitle());
        myViewHolder.Title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity,MasnoonDuaDetails.class);
                intent.putExtra("Title",arrayList.get(i).getTitle());
                intent.putExtra("Arbi",arrayList.get(i).getArbi());
                intent.putExtra("Urdu",arrayList.get(i).getUrdu());
                intent.putExtra("English",arrayList.get(i).getEnglish());
                intent.putExtra("Ref",arrayList.get(i).getRefrence());
                intent.putExtra("RefLink",arrayList.get(i).getRefrenceLink());
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

        }
    }
}

