package com.example.samvel_homework_lesson_10;

import java.util.ArrayList;
import java.util.List;

public class ListItem {
    private int imageLink;
    private String heading;
    private String description;
    private String category;
    private int categoryImage;

    public ListItem(String heading, int imageLink, String description, String category, int categoryImage) {
        this.heading = heading;
        this.imageLink = imageLink;
        this.description = description;
        this.category = category;
        this.categoryImage = categoryImage;
    }

    public static List<ListItem> getListItems() {
        ArrayList<ListItem> listOfItems = new ArrayList<>();
        listOfItems.add(new ListItem("Heading 1", R.drawable.grid_image_1,"This is the first article","Restaurants",R.drawable.restaurant_icon));
        listOfItems.add(new ListItem("Heading 2", R.drawable.grid_image_2,"This is the second article","Restaurants",R.drawable.restaurant_icon));
        listOfItems.add(new ListItem("Heading 3", R.drawable.grid_image_3,"This is the third article","Restaurants",R.drawable.restaurant_icon));
        listOfItems.add(new ListItem("Heading 4", R.drawable.grid_image_4,"This is the fourth article","Restaurants",R.drawable.restaurant_icon));
        listOfItems.add(new ListItem("Heading 5", R.drawable.grid_image_5,"This is the fifth article","Restaurants",R.drawable.restaurant_icon));
        listOfItems.add(new ListItem("Heading 6", R.drawable.grid_image_6,"This is the sixth article","Restaurants",R.drawable.restaurant_icon));
        return listOfItems;
    }

    public String getDescription() {
        return description;
    }

    public String getHeading() {
        return heading;
    }

    public int getImageLink() {
        return imageLink;
    }

    public String getCategory() {
        return category;
    }

    public int getCategoryImage() {
        return categoryImage;
    }
}