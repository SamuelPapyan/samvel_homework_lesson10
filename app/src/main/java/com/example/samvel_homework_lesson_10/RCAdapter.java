package com.example.samvel_homework_lesson_10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

public class RCAdapter extends RecyclerView.Adapter<MyViewHolder>{

    public List<ListItem> items = Collections.emptyList();

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item,parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position){
        holder.initData(items.get(position));
    }

    @Override
    public int getItemCount(){
        return items.size();
    }

    public void setItems(List<ListItem> items){
        this.items = items;
        notifyDataSetChanged();
    }
}

class MyViewHolder extends RecyclerView.ViewHolder{
    public MyViewHolder(@NonNull View itemView){
        super(itemView);
    }
    void initData(ListItem listItem){
        AppCompatTextView heading = itemView.findViewById(R.id.appCompatTextView);
        AppCompatTextView description = itemView.findViewById(R.id.appCompatTextView2);
        AppCompatTextView category = itemView.findViewById(R.id.appCompatTextView3);
        AppCompatImageView contentImage = itemView.findViewById(R.id.appCompatImageView);

        heading.setText(listItem.getHeading());
        description.setText(listItem.getDescription());
        category.setText(listItem.getCategory());
        contentImage.setImageResource(listItem.getImageLink());
        category.setCompoundDrawablesWithIntrinsicBounds(listItem.getCategoryImage(),0,0,0);
    }
}