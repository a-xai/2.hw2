package com.company;

public class Mantis extends Insects implements Printable {
    private int clawLength;
    private int height;

    public Mantis(int numberOfPaws, String color, int clawLength, int height) {
        super(numberOfPaws, color);
        this.clawLength = clawLength;
        this.height = height;
    }

    public int getClawLength() {
        return clawLength;
    }

    public void setClawLength(int clawLength) {
        this.clawLength = clawLength;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void print() {
        System.out.println(getClass().getSimpleName() + "'s claw length: " + clawLength + "sm;\nColor: " + getColor() + ";\nNumber of paws: " + getNumberOfPaws() +
                "; \nHeight: " + height + "sm.");
    }
}
