package com.adityatalpade;

/**
 * Created by sunilnt on 05/10/17.
 */
public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {

        return x;
    }

    @Override
    public String toString() {
        return String.format("x: %s, y: %s", this.x, this.y);
    }
}
