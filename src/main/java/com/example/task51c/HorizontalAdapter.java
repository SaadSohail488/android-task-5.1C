package com.example.task51c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.ViewHolder> {

    private ArrayList<NewsModel> list;
    private OnClickListener onClickListener;

    public HorizontalAdapter(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
        this.list = new ArrayList<>();
    }

    public void submitList(ArrayList<NewsModel> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    public interface OnClickListener {
        void onItemClick(int itemId);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;

        public ViewHolder(@NonNull View view) {
            super(view);
            image = view.findViewById(R.id.image);
        }

        public void bind(final NewsModel newsModel, final OnClickListener onClickListener) {
            // Set the image for the news item
            image.setImageDrawable(itemView.getContext().getDrawable(newsModel.getImageDrawable()));

            // Set click listener for the item view
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onClickListener.onItemClick(newsModel.getId());
                }
            });
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the layout for the horizontal RecyclerView item
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.new_layout_one, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Bind the news item to the ViewHolder
        holder.bind(list.get(position), onClickListener);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
