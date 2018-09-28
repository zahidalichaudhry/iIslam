package com.itpvt.iislam.Activities.Adapters;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.itpvt.iislam.Activities.PojoClass.DuaQuraniPojo;
import com.itpvt.iislam.R;

import java.util.ArrayList;

public class QuranDuaAdapter extends RecyclerView.Adapter<QuranDuaAdapter.MyViewHolder>
{
    ArrayList<DuaQuraniPojo> arrayList= new ArrayList<>();
    Activity activity;

    public QuranDuaAdapter(ArrayList<DuaQuraniPojo> arrayList, Activity activity)
    {
        this.arrayList = arrayList;
        this.activity = activity;
    }

    @NonNull
    @Override
    public QuranDuaAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.quran_dua_item,viewGroup,false);
        return new QuranDuaAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuranDuaAdapter.MyViewHolder myViewHolder, int i) {
        myViewHolder.arbi.setText(arrayList.get(i).getArbi());
        myViewHolder.urdu.setText(arrayList.get(i).getUrdu());
        myViewHolder.english.setText(arrayList.get(i).getEnglish());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    public static class MyViewHolder extends  RecyclerView.ViewHolder
    {
        TextView arbi,urdu,english;
        public MyViewHolder(View itemView) {
            super(itemView);
            arbi=(TextView)itemView.findViewById(R.id.arbi);
            urdu=(TextView)itemView.findViewById(R.id.urdu);
            english=(TextView)itemView.findViewById(R.id.english);

        }
    }
}
