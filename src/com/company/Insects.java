package com.company;

public class Insects {
    private int numberOfPaws;
    private String color;

    public Insects(int numberOfPaws, String color) {
        this.numberOfPaws = numberOfPaws;
        this.color = color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public void setNumberOfPaws(int numberOfPaws) {
        this.numberOfPaws = numberOfPaws;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
