package com.itpvt.iislam.Activities.Adapters;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.itpvt.iislam.Activities.PojoClass.DuaQuraniPojo;
import com.itpvt.iislam.R;

import java.util.ArrayList;

public class QuranDuaAdapter extends RecyclerView.Adapter<QuranDuaAdapter.MyViewHolder>
{
    ArrayList<DuaQuraniPojo> arrayList= new ArrayList<>();
    Activity activity;
//    Boolean urdutrans=false,englishtrans=false;

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
    public void onBindViewHolder(@NonNull final QuranDuaAdapter.MyViewHolder myViewHolder, final int i) {


        myViewHolder.arbi.setText(arrayList.get(i).getArbi());
        myViewHolder.urdu.setText(arrayList.get(i).getUrdu());
        myViewHolder.english.setText(arrayList.get(i).getEnglish());
//        myViewHolder.transenglish.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (!englishtrans)
//                {
//                    myViewHolder.english.setVisibility(View.VISIBLE);
//                    englishtrans=true;
//                    notifyItemChanged(i);
//                }
//                if (englishtrans)
//                {
//                    myViewHolder.english.setVisibility(View.GONE);
//                    englishtrans=false;
//                    notifyItemChanged(i);
//                }
//            }
//        });
//        myViewHolder.trnasurdu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (!urdutrans)
//                {
//                    myViewHolder.urdu.setVisibility(View.VISIBLE);
//                    urdutrans=true;
//                }
//                if (urdutrans)
//                {
//                    myViewHolder.urdu.setVisibility(View.GONE);
//                    urdutrans=false;
//                }
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    public static class MyViewHolder extends  RecyclerView.ViewHolder
    {
        TextView arbi,urdu,english;
        Button trnasurdu,transenglish;
        public MyViewHolder(View itemView) {
            super(itemView);
            arbi=(TextView)itemView.findViewById(R.id.arbi);
            urdu=(TextView)itemView.findViewById(R.id.urdu);
            english=(TextView)itemView.findViewById(R.id.english);
//            trnasurdu=(Button)itemView.findViewById(R.id.transurdu);
//            transenglish=(Button)itemView.findViewById(R.id.transEnglish);
        }
    }
}
