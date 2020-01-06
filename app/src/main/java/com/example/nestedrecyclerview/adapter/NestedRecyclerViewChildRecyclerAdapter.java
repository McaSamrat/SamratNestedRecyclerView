package com.example.nestedrecyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nestedrecyclerview.R;
import com.example.nestedrecyclerview.model.Member;
import com.example.nestedrecyclerview.model.MyTeamList;

import java.util.List;

public class NestedRecyclerViewChildRecyclerAdapter extends RecyclerView.Adapter<NestedRecyclerViewChildRecyclerAdapter.NestedRecyclerViewChildViewHolderViewHolder> {

    private Context context;
    List<MyTeamList> nestedTeamList;
    List<Member> nestedMembers;

    public NestedRecyclerViewChildRecyclerAdapter(Context context, List<Member> nestedTeamList) {
        this.context = context;
        this.nestedMembers = nestedTeamList;
    }

    @NonNull
    @Override
    public NestedRecyclerViewChildRecyclerAdapter.NestedRecyclerViewChildViewHolderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NestedRecyclerViewChildViewHolderViewHolder(LayoutInflater.from(context).inflate(R.layout.nested_recyclerview_childrecycler_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull NestedRecyclerViewChildRecyclerAdapter.NestedRecyclerViewChildViewHolderViewHolder holder, int position) {
        Member myMembers = nestedMembers.get(position);
        setDataIntoViews(holder,position,myMembers.getFlag());
    }

    private void setDataIntoViews(NestedRecyclerViewChildViewHolderViewHolder holder, int position, String flag) {
        if (flag.equalsIgnoreCase("texts")){
            holder.mSingleTextView.setText(nestedMembers.get(position).getText());
        }

    }


    @Override
    public int getItemCount() {
        return nestedMembers.size();
    }

    public class NestedRecyclerViewChildViewHolderViewHolder extends RecyclerView.ViewHolder {

        TextView mSingleTextView;
        ImageView mSingleImageView;
        ImageView mImageViewRecyclerItems;
        TextView mTextViewRecyclerItems;
        VideoView mVideoView;
        RecyclerView mChildRecyclerView;

        public NestedRecyclerViewChildViewHolderViewHolder(@NonNull View itemView) {
            super(itemView);
            mSingleTextView = itemView.findViewById(R.id.singleTextView);
            mSingleImageView = itemView.findViewById(R.id.singleImageView);
            mImageViewRecyclerItems = itemView.findViewById(R.id.imageViewRecyclerItem);
            mTextViewRecyclerItems = itemView.findViewById(R.id.textViewRecyclerItems);
            mVideoView = itemView.findViewById(R.id.videoView);
            mChildRecyclerView = itemView.findViewById(R.id.childRecyclerView);
        }
    }
}
