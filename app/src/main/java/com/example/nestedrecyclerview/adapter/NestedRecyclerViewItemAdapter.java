package com.example.nestedrecyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.nestedrecyclerview.R;
import com.example.nestedrecyclerview.model.HorizontalMember;
import com.example.nestedrecyclerview.model.Member;

import java.util.List;

public class NestedRecyclerViewItemAdapter extends RecyclerView.Adapter<NestedRecyclerViewItemAdapter.NestedRecyclerViewHolder> {

    private Context context;
    List<HorizontalMember> mRecyclerMember;

    public NestedRecyclerViewItemAdapter(Context context, List<HorizontalMember> mRecyclerMember) {
        this.context = context;
        this.mRecyclerMember = mRecyclerMember;
    }

    @NonNull
    @Override
    public NestedRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new NestedRecyclerViewHolder(LayoutInflater.from(context).inflate(R.layout.nested_recyclerview_items_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final NestedRecyclerViewHolder holder, final int position) {
        setDataIntoFields(position,holder);
    }

    private void setDataIntoFields(int position, NestedRecyclerViewHolder holder) {

        holder.textViewHorizontalViewItems.setText(mRecyclerMember.get(position).getText());
        Glide.with(context).load(mRecyclerMember.get(position).getImage()).into(holder.imageViewHorizontalViewItems);
    }

    @Override
    public int getItemCount() {
        return mRecyclerMember.size();
    }


    public class NestedRecyclerViewHolder extends RecyclerView.ViewHolder {

         ImageView imageViewHorizontalViewItems;
         TextView textViewHorizontalViewItems;


        public NestedRecyclerViewHolder(View itemView) {
            super(itemView);
            imageViewHorizontalViewItems = itemView.findViewById(R.id.ivHorizontal);
            textViewHorizontalViewItems = itemView.findViewById(R.id.tvHorizontal);
        }
    }
}

