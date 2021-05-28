package com.techelevator;

public class RectangleWall extends Wall {

    private final int length;

    private final int height;

    public RectangleWall(String name, String color, int length, int height) {
        super(name, color);
        this.length = length;
        this.height = height;
    }
    public RectangleWall(String name, String color, int sideLength) {
        super(name, color,sideLength);

        this.length = sideLength;
        this.height = sideLength;
    }
    public int getArea() {
        int area = length * height;
        return area;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public String toString() {
        return this.getName() +" ("+ this.length + "x"+ height+") rectangle";
    }
}
