package com.anderfred.SportOrNot.model;

public class Recipe {
    private String name;
    private int id;
    private long rating;
    private String image;

    public Recipe() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", rating=" + rating +
                ", image='" + image + '\'' +
                '}';
    }
}
