package com.example.task51c;

public class NewsModel {
    private int id;
    private int imageDrawable;
    private String title;
    private String story;

    public NewsModel(int id, int imageDrawable, String title, String story) {
        this.id = id;
        this.imageDrawable = imageDrawable;
        this.title = title;
        this.story = story;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImageDrawable() {
        return imageDrawable;
    }

    public void setImageDrawable(int imageDrawable) {
        this.imageDrawable = imageDrawable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }
}
