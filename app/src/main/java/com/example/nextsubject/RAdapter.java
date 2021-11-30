package com.example.nextsubject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RAdapter extends RecyclerView.Adapter<RAdapter.ViewHolder> {

    public static int page; //0 - view subjects, 1 - set schedule, 2 - schedule

    public RAdapter() {

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ConstraintLayout row, addCell, cell;
        public TextView subTextView, cSubTextView, cLocTextView;
        public EditText locEdtText;
        public Spinner subSpinner;

        public ViewHolder(View itemView) {
            super(itemView);

            row = (ConstraintLayout) itemView.findViewById(R.id.a_row);
            addCell = (ConstraintLayout) itemView.findViewById(R.id.an_add_cell);
            cell = (ConstraintLayout) itemView.findViewById(R.id.a_cell);

            subTextView = (TextView) itemView.findViewById(R.id.sub_text);
            cSubTextView = (TextView) itemView.findViewById(R.id.cSubText);
            cLocTextView = (TextView) itemView.findViewById(R.id.cLocText);

            locEdtText = (EditText) itemView.findViewById(R.id.locTextIn);

            subSpinner = (Spinner) itemView.findViewById(R.id.subSpin);
        }
    }

    public ArrayList<String> subList;
    int arrSize = 0;

    public RAdapter(Context c) {
        subList = new ArrayList<String>();
        subList.add("1");
        subList.add("2");
        subList.add("3");
        subList.add("4");
        subList.add("5");
        subList.add("6");
        subList.add("7");
        subList.add("8");
        subList.add("9");
        subList.add("10");
        subList.add("11");
        subList.add("12");

        arrSize = subList.size();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.row, parent, false);

        switch (page){
            case 1: view = inflater.inflate(R.layout.add_cell, parent, false);
            break;

            case 2: view = inflater.inflate(R.layout.cell, parent, false);
            break;
        }

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
/*        TextView textView = holder.subTextView;
        textView.setText(subList.get(position));*/

        switch (page){
            case 0:
                TextView textView = holder.subTextView;
                textView.setText(subList.get(position));
                break;

            case 1:
                Spinner spinner = holder.subSpinner;
                EditText editText = holder.locEdtText;
                break;

            case 2:
                TextView textViewSub = holder.cSubTextView;
                textViewSub.setText(subList.get(position));

                TextView textViewLoc = holder.cLocTextView;
                textViewLoc.setText(subList.get(position));
        }
    }

    @Override
    public int getItemCount() {
        //int size = subList.size();
        return 12;
    }


}
