package com.climo.myapplication.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.climo.myapplication.Model.GalleryActivityModel;
import com.climo.myapplication.R;

import java.util.List;

public class RecylerViewAdapterGallery extends RecyclerView.Adapter<RecylerViewAdapterGallery.myViewHolder> {
    private Context mContext;
    private List<GalleryActivityModel> mData;

    public RecylerViewAdapterGallery(Context mContext, List<GalleryActivityModel> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View v;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        v = mInflater.inflate(R.layout.cardview_item_gallery,viewGroup,false);

        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder myViewHolder, int i) {

        myViewHolder.tv_book_title.setText(mData.get(i).getTitle());
        myViewHolder.img_photo.setImageResource((mData.get(i)).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class myViewHolder extends RecyclerView.ViewHolder {

        TextView tv_book_title;
        ImageView img_photo;


        public myViewHolder(View view){
            super(view);
            tv_book_title = (TextView) view.findViewById(R.id.image_title);
            img_photo = (ImageView) view.findViewById(R.id.img_photo);
        }
    }
}
