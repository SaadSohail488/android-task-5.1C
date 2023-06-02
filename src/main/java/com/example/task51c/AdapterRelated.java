package com.example.task51c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRelated extends RecyclerView.Adapter<AdapterRelated.ViewHolder> {

    private ArrayList<NewsModel> list = new ArrayList<>();

    // Method to submit a new list of NewsModels to the adapter
    public void submitList(ArrayList<NewsModel> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    // ViewHolder class to hold the views for each item in the RecyclerView
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView image;
        private final TextView title;
        private final TextView detail;

        public ViewHolder(@NonNull View view) {
            super(view);
            // Initialize the views in the ViewHolder
            image = view.findViewById(R.id.image);
            title = view.findViewById(R.id.title);
            detail = view.findViewById(R.id.detail);
        }

        // Method to bind the data from a NewsModel to the views in the ViewHolder
        public void bind(NewsModel newsModel) {
            Context context = itemView.getContext();
            // Set the image drawable using the imageDrawable property of the NewsModel
            image.setImageDrawable(context.getDrawable(newsModel.getImageDrawable()));
            // Set the title text using the title property of the NewsModel
            title.setText(newsModel.getTitle());
            // Set the detail text using the story property of the NewsModel
            detail.setText(newsModel.getStory());
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the layout for each item in the RecyclerView
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.related_new_layout, parent, false);
        // Create a new ViewHolder with the inflated view
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Bind the data from the NewsModel at the specified position to the ViewHolder
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        // Return the number of items in the list
        return list.size();
    }
}
