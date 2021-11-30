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

public class RAdapterVS extends RecyclerView.Adapter<RAdapterVS.ViewHolderVS> {

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
/*        TextView textView = holder.subTextView;
        textView.setText(subList.get(position));*/

        TextView textView = holder.subTextView;
        textView.setText(subListVS.get(position));

    }

    @Override
    public int getItemCount() {
        //int size = subList.size();
        return 11;
    }


}
