package com.example.nextsubject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static com.example.nextsubject.MainActivity.subList;

public class RAdapter extends RecyclerView.Adapter<RAdapter.ViewHolder> {

    public static int page; //0 - view subjects, 1 - set schedule, 2 - schedule

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ConstraintLayout row, addCell, cell, col;
        public TextView subTextView, cSubTextView, cLocTextView;
        public EditText locEdtText;
        public Spinner subSpinner;

        public ViewHolder(View itemView) {
            super(itemView);

            row = (ConstraintLayout) itemView.findViewById(R.id.a_row);
            addCell = (ConstraintLayout) itemView.findViewById(R.id.an_add_cell);
            cell = (ConstraintLayout) itemView.findViewById(R.id.a_cell);
            col = (ConstraintLayout) itemView.findViewById(R.id.a_col);

            subTextView = (TextView) itemView.findViewById(R.id.sub_text);
            cSubTextView = (TextView) itemView.findViewById(R.id.cSubText);
            cLocTextView = (TextView) itemView.findViewById(R.id.cLocText);

            locEdtText = (EditText) itemView.findViewById(R.id.locTextIn);

            subSpinner = (Spinner) itemView.findViewById(R.id.subSpin);
        }
    }

    //

    public ArrayAdapter<String> adapter;

    public RAdapter(Context c) {
//        subList = new ArrayList<String>();
        //subList.add("None");

        adapter =
                new ArrayAdapter<String>(c, android.R.layout.simple_spinner_dropdown_item, subList);
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
                spinner.setAdapter(adapter);

/*                ArrayAdapter<String> adapter =
                        new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, subList);*/




/*                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, subList);
                arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(arrayAdapter);
                spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        string tutorialsName = parent.getItemAtPosition(position).toString();
                        Toast.makeText(parent.getContext(), "Selected: " + tutorialsName,          Toast.LENGTH_LONG).show();
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });*/

                EditText editText = holder.locEdtText;
                break;

            case 2:
                TextView textViewSub = holder.cSubTextView;
                textViewSub.setText(position);

                TextView textViewLoc = holder.cLocTextView;
                textViewLoc.setText(position);
        }
    }

    @Override
    public int getItemCount() {
        int ret = 10;

        if (page == 0)
            ret = subList.size();
        //int size = subList.size();
        return ret;
    }


}

/*public class RAdapterVS extends RecyclerView.Adapter<RAdapterVS.ViewHolderVS> {

    public static int page; //0 - view subjects, 1 - set schedule, 2 - schedule


    public class ViewHolderVS extends RecyclerView.ViewHolder {
        public ConstraintLayout row;
        public TextView subTextView;

        public ViewHolderVS(View itemView) {
            super(itemView);

            row = (ConstraintLayout) itemView.findViewById(R.id.a_row);

            subTextView = (TextView) itemView.findViewById(R.id.sub_text);
        }
    }

    public ArrayList<String> subListVS;
    int arrSize = 0;

    public RAdapterVS(Context c) {
        subListVS = new ArrayList<String>();
        subListVS.add("1");
        subListVS.add("2");
        subListVS.add("3");
        subListVS.add("4");
        subListVS.add("5");
        subListVS.add("6");
        subListVS.add("7");
        subListVS.add("8");
        subListVS.add("9");
        subListVS.add("10");
        subListVS.add("11");
        subListVS.add("12");

        arrSize = subListVS.size();
    }

    @NonNull
    @Override
    public ViewHolderVS onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.row, parent, false);

        ViewHolderVS viewHolderVS = new ViewHolderVS(view);
        return viewHolderVS;
    }

    @Override
    public void onBindViewHolder(@NonNull RAdapterVS.ViewHolderVS holder, int position) {
*//*        TextView textView = holder.subTextView;
        textView.setText(subList.get(position));*//*

        TextView textView = holder.subTextView;
        textView.setText(subListVS.get(position));

    }

    @Override
    public int getItemCount() {
        //int size = subList.size();
        return 11;
    }


}*/
