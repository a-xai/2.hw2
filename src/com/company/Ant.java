package com.company;

public class Ant extends Insects implements Printable {
    private String name;
    private int length;

    public Ant(int numberOfPaws, String color, String name, int length) {
        super(numberOfPaws, color);
        this.length = length;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void print() {
        System.out.println(getClass().getSimpleName() + "'s name: " + name + ";\nColor: " + getColor() + ";\nNumber of paws: " + getNumberOfPaws() +
                "; \nLength: " + length + "mm.");
    }
}
