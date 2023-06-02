package com.example.task51c;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DetailFragment extends Fragment {

    private View view;
    private RecyclerView relatedNewsRecyclerView;
    private AdapterRelated adapter;
    private int args;
    private ImageView image;
    private TextView title;
    private TextView detail;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_detail, container, false);

        // Retrieve the list of news items from DataList
        ArrayList<NewsModel> list = new DataList().getList();

        // Get the ID passed as an argument to the fragment
        args = getArguments() != null ? getArguments().getInt("id") : 0;

        // Find the views in the fragment layout
        relatedNewsRecyclerView = view.findViewById(R.id.relatedNews);
        image = view.findViewById(R.id.image);
        title = view.findViewById(R.id.title);
        detail = view.findViewById(R.id.detail);

        int newsIndex = -1;
        // Find the index of the news item with the matching ID
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == args) {
                newsIndex = i;
                break;
            }
        }

        if (newsIndex != -1) {
            // If a matching news item is found, display its details in the views
            NewsModel model = list.get(newsIndex);
            image.setImageDrawable(requireContext().getDrawable(model.getImageDrawable()));
            title.setText(model.getTitle());
            detail.setText(model.getStory());
        }

        adapter = new AdapterRelated();

        // Set up the RecyclerView with a LinearLayoutManager and the adapter
        relatedNewsRecyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        relatedNewsRecyclerView.setAdapter(adapter);

        // Submit the list of news items to the adapter
        adapter.submitList(list);

        return view;
    }
}
