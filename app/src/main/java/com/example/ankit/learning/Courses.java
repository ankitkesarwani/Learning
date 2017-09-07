package com.example.ankit.learning;

/**
 * Created by Ankit on 8/3/2017.
 */

public class Courses {

    public String name;
    public String image;

    public Courses() {

    }

    public Courses(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
