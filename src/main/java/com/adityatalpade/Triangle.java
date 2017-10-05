package com.adityatalpade;

import java.util.List;

/**
 * Created by sunilnt on 27/09/17.
 */
public class Triangle implements Shape {

    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void draw() {
        for (Point point : points) {
            System.out.println("point = " + point);
        }
    }
}
