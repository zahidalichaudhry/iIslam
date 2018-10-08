package com.itpvt.iislam.Activities.Adapters;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.itpvt.iislam.Activities.NamazFzailBaad;
import com.itpvt.iislam.Activities.PojoClass.AzkarAdapterBaadPojo;
import com.itpvt.iislam.R;

import java.util.ArrayList;

/**
 * Created by Hassan on 10/4/2018.
 */

public class AzkarAdapterBaad extends RecyclerView.Adapter<AzkarAdapter.MyViewHolder> {

    ArrayList<AzkarAdapterBaadPojo> arrayList = new ArrayList<>();
    Activity activity;

    public AzkarAdapterBaad(ArrayList<AzkarAdapterBaadPojo> arrayList, Activity activity) {
        this.arrayList = arrayList;
        this.activity = activity;
    }

    @NonNull
    @Override
    public AzkarAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.masnoon_dua_item, viewGroup, false);
        return new AzkarAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AzkarAdapter.MyViewHolder myViewHolder,final  int i) {
        myViewHolder.Title.setText(arrayList.get(i).getTitle());
        myViewHolder.Title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, NamazFzailBaad.class);
                intent.putExtra("Title", arrayList.get(i).getTitle());
                intent.putExtra("TitleUrdu", arrayList.get(i).getTitleUdru());
                intent.putExtra("Arbi", arrayList.get(i).getArbi());


                activity.startActivity(intent);
            }
        });

    }


    @Override
    public int getItemCount() {
        {
            return arrayList.size();
        }
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView Title;

        public MyViewHolder(View itemView) {
            super(itemView);
            Title = (TextView) itemView.findViewById(R.id.Title);

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
