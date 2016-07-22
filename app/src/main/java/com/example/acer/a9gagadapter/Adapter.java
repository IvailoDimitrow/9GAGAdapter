package com.example.acer.a9gagadapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Acer on 22.7.2016 г..
 */
public class Adapter extends   RecyclerView.Adapter<Adapter.Holder>  {
    List<Data> things;
    public Adapter(List<Data> things){
        this.things = things;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main, parent, false);
        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        Data starter = things.get(position);
        holder.text.setText(starter.text);
        holder.image.setImageResource(starter.image);
    }

    @Override
    public int getItemCount() {
        return things.size();
    }

    class Holder extends RecyclerView.ViewHolder{
        TextView text;
        ImageView image;
        public Holder(View itemView) {
            super(itemView);
            text = (TextView) itemView.findViewById(R.id.textView);
            image = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }
}
