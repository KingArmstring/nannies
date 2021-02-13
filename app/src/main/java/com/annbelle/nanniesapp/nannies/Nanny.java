package com.annbelle.nanniesapp.nannies;

public class Nanny {

    private String name;
    private String story;
    private int imageRes;

    public Nanny(String name, String story, int imageRes) {
        this.name = name;
        this.story = story;
        this.imageRes = imageRes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public int getImageRes() {
        return imageRes;
    }

    public void setImageRes(int imageRes) {
        this.imageRes = imageRes;
    }
}
