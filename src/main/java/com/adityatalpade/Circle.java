package com.adityatalpade;

/**
 * Created by sunilnt on 05/10/17.
 */
public class Circle implements Shape {

    private Point pointA;

    public Circle(Point pointA) {
        this.pointA = pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    @Override
    public void draw() {
        System.out.println("pointA = " + pointA);
    }
}
