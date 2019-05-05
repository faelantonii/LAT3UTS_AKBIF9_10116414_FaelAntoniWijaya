package com.climo.myapplication.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.climo.myapplication.Model.DailyActivityModel;
import com.climo.myapplication.Model.GalleryActivityModel;
import com.climo.myapplication.R;

import java.util.List;

public class MainRecycleAdapter extends RecyclerView.Adapter<MainRecycleAdapter.myViewHolder> {

    Context mContext;
    List<DailyActivityModel> mDataDaily;

    public MainRecycleAdapter(Context mContext, List<DailyActivityModel> mDataDaily) {
        this.mContext = mContext;
        this.mDataDaily = mDataDaily;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_daily, viewGroup,false);
        myViewHolder vHolder = new myViewHolder(v);

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder myViewHolder, int i) {

        myViewHolder.tv_kegiatan.setText(mDataDaily.get(i).getAktifitas());
        myViewHolder.img_kegiatan.setImageResource(mDataDaily.get(i).getImg());

    }

    @Override
    public int getItemCount() {
        return mDataDaily.size();
    }

    public static class myViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_kegiatan;
        private ImageView img_kegiatan;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            img_kegiatan = (ImageView) itemView.findViewById(R.id.img_kegiatan);
            tv_kegiatan = (TextView) itemView.findViewById(R.id.tv_kegiatan);
        }
    }


}