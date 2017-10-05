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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("center = " + center);
    }
}
