package com.zyablik.fifthapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class myAdapter extends RecyclerView.Adapter<myAdapter.VHolder> {
    private List<String> items;
    public myAdapter(List<String> items){
        this.items = items;
    }

    @NonNull
    @Override
    public myAdapter.VHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate
                (R.layout.my_list_item,parent,false);
        return new VHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myAdapter.VHolder holder, int position) {
        String item = items.get(position);
        holder.textView.setText(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
    static class VHolder extends RecyclerView.ViewHolder{
        TextView textView;
        VHolder(View view){
            super(view);
            textView = view.findViewById(R.id.iText);
        }
    }
}
