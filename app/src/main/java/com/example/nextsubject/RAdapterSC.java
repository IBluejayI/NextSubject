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

public class RAdapterSC extends RecyclerView.Adapter<RAdapterSC.ViewHolderSC> {

    public static int page; //0 - view subjects, 1 - set schedule, 2 - schedule


    public class ViewHolderSC extends RecyclerView.ViewHolder {
        public ConstraintLayout cell;
        public TextView cSubTextView, cLocTextView;


        public ViewHolderSC(View itemView) {
            super(itemView);

            cell = (ConstraintLayout) itemView.findViewById(R.id.a_cell);

            cSubTextView = (TextView) itemView.findViewById(R.id.cSubText);
            cLocTextView = (TextView) itemView.findViewById(R.id.cLocText);
        }
    }

    public ArrayList<String> subListSC;
    int arrSize = 0;

    public RAdapterSC(Context c) {
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
    public RAdapterSC.ViewHolderSC onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.cell, parent, false);

        RAdapterSC.ViewHolderSC viewHolderSC = new RAdapterSC.ViewHolderSC(view);
        return viewHolderSC;
    }

    @Override
    public void onBindViewHolder(@NonNull RAdapterSC.ViewHolderSC holder, int position) {
/*        TextView textView = holder.subTextView;
        textView.setText(subList.get(position));*/

        TextView textViewSub = holder.cSubTextView;
        textViewSub.setText(subListSC.get(position));

        TextView textViewLoc = holder.cLocTextView;
        textViewLoc.setText(subListSC.get(position));

    }

    @Override
    public int getItemCount() {
        //int size = subList.size();
        return 12;
    }


}
