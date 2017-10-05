package com.adityatalpade;

/**
 * Created by sunilnt on 05/10/17.
 */
public class Triangle implements Shape {

    private final String type;

    public Triangle(String type) {
        this.type = type;
    }

    @Override
    public void draw() {
        System.out.println("Triangle of type " + type);
    }
}
