package com.adityatalpade;

/**
 * Created by sunilnt on 05/10/17.
 */
public class Circle implements Shape {

    private Point center;

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("center = " + center);
    }
}
