package com.example.nextsubject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RAdapterSS extends RecyclerView.Adapter<RAdapterSS.ViewHolderSS> {

    public static int page; //0 - view subjects, 1 - set schedule, 2 - schedule


    public class ViewHolderSS extends RecyclerView.ViewHolder {
        public ConstraintLayout addCell;
        public EditText locEdtText;
        public Spinner subSpinner;

        public ViewHolderSS(View itemView) {
            super(itemView);

            addCell = (ConstraintLayout) itemView.findViewById(R.id.an_add_cell);

            locEdtText = (EditText) itemView.findViewById(R.id.locTextIn);

            subSpinner = (Spinner) itemView.findViewById(R.id.subSpin);
        }
    }

    public ArrayList<String> subListSC;
    int arrSize = 0;

    public RAdapterSS(Context c) {
        subListSC = new ArrayList<String>();
        subListSC.add("1");
        subListSC.add("2");
        subListSC.add("3");
        subListSC.add("4");
        subListSC.add("5");
        subListSC.add("6");
        subListSC.add("7");
        subListSC.add("8");
        subListSC.add("9");
        subListSC.add("10");
        subListSC.add("11");
        subListSC.add("12");

        arrSize = subListSC.size();
    }

    @NonNull
    @Override
    public RAdapterSS.ViewHolderSS onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.add_cell, parent, false);

        RAdapterSS.ViewHolderSS viewHolderSS = new RAdapterSS.ViewHolderSS(view);
        return viewHolderSS;
    }

    @Override
    public void onBindViewHolder(@NonNull RAdapterSS.ViewHolderSS holder, int position) {
/*        TextView textView = holder.subTextView;
        textView.setText(subList.get(position));*/

        Spinner spinner = holder.subSpinner;
        EditText editText = holder.locEdtText;

    }

    @Override
    public int getItemCount() {
        //int size = subList.size();
        return 12;
    }


}