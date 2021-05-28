package com.techelevator;

abstract public class Wall extends PaintCalculator {
   private final String color;
   private final String name;

    public Wall(String name, String color) {
        this.color = color;
        this.name = name;
    }
    public Wall(String name, String color, int sideLength) {
        this.color = color;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public abstract int getArea();
}
