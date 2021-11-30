package com.example.nextsubject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RAdapter extends RecyclerView.Adapter<RAdapter.ViewHolder> {

    public RAdapter() {

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ConstraintLayout row;
        public TextView subTextView, locTextView;

        public ViewHolder(View itemView) {
            super(itemView);

            row = (ConstraintLayout) itemView.findViewById(R.id.a_row);
            subTextView = (TextView) itemView.findViewById(R.id.sub_text);
        }
    }

    ArrayList<String> subList;

    public RAdapter(Context c) {
        subList = new ArrayList<String>();
        subList.add("Hello");
        subList.add("How are you");
        subList.add("Gooood!");
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.row, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TextView textView = holder.subTextView;
        textView.setText(subList.get(position));
    }

    @Override
    public int getItemCount() {
        return 0;
    }


}
