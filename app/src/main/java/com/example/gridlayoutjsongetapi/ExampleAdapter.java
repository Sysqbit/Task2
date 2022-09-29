package com.example.gridlayoutjsongetapi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {
    private Context mContext;
    private ArrayList<ExmapleItem> mExampleList;

    public ExampleAdapter(Context context,ArrayList<ExmapleItem> exampleList){
        mContext =context;
        mExampleList=exampleList;


    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.custom_layout,parent,false);
        return new ExampleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        ExmapleItem currentItem = mExampleList.get(position);
        String Name= currentItem.getmName();
        String Code= currentItem.getCode();
        String Price=currentItem.getmPrice();

        holder.mName.setText(Name);
        holder.mCode.setText("code: "+ Code);
        holder.mPrice.setText("price: "+Price);






    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }

    public class ExampleViewHolder extends RecyclerView.ViewHolder{
        public TextView mName;
        public TextView mCode;
        public TextView mPrice;


        public ExampleViewHolder(View itemView) {
            super(itemView);
            mName = itemView.findViewById(R.id.textview1);
            mCode = itemView.findViewById(R.id.textview2);
            mPrice = itemView.findViewById(R.id.textview3);

        }
    }
}
