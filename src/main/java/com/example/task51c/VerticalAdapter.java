package com.example.task51c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VerticalAdapter extends RecyclerView.Adapter<VerticalAdapter.ViewHolder> {

    private ArrayList<NewsModel> list;
    private OnClickListener onClickListener;

    public VerticalAdapter(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
        this.list = new ArrayList<>();
    }

    public void submitList(ArrayList<NewsModel> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Inflate the layout for the vertical RecyclerView item
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.new_layout_one, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // Bind the news item to the ViewHolder
        holder.bind(list.get(position), onClickListener);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public interface OnClickListener {
        void onItemClick(int id);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView title;
        private TextView detail;

        public ViewHolder(View view) {
            super(view);
            image = view.findViewById(R.id.image);
            title = view.findViewById(R.id.title);
            detail = view.findViewById(R.id.detail);
        }

        public void bind(final NewsModel newsModel, final OnClickListener onClickListener) {
            // Set the image for the news item
            image.setImageDrawable(itemView.getContext().getDrawable(newsModel.getImageDrawable()));

            // Set the title and detail text for the news item
            title.setText(newsModel.getTitle());
            detail.setText(newsModel.getStory());

            // Set click listener for the item view
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onClickListener.onItemClick(newsModel.getId());
                }
            });
        }
    }
}