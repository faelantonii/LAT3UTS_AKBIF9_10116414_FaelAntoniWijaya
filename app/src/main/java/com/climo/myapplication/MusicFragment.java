package com.climo.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Vector;

public class MusicFragment extends Fragment {

    RecyclerView recyclerView;
    Vector<YouTubeVideos> youtubeVideo = new Vector<YouTubeVideos>();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_music, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.music_recycle);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(this.getContext()));

        youtubeVideo.add( new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/KfXvjxbRhZk\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideo.add( new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/TZLfifgQa3g\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideo.add( new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/rLm_aSP369M\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideo.add( new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/QKcxhQZxvdw\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideo.add( new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/BPNTC7uZYrI\" frameborder=\"0\" allowfullscreen></iframe>") );

        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideo);

        recyclerView.setAdapter(videoAdapter);

        return view;
    }
}


