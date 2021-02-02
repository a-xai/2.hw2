package com.company;

public class Butterfly extends Insects implements Printable {
    private String type;
    private int widthOfSpreadWings;

    public Butterfly(int numberOfPaws, String color, String type, int widthOfSpreadWings) {
        super(numberOfPaws, color);
        this.type = type;
        this.widthOfSpreadWings = widthOfSpreadWings;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWidthOfSpreadWings() {
        return widthOfSpreadWings;
    }

    public void setWidthOfSpreadWings(int widthOfSpreadWings) {
        this.widthOfSpreadWings = widthOfSpreadWings;
    }

    @Override
    public void print() {
        System.out.println(getClass().getSimpleName() + "'s type: " + type + ";\nColor: " + getColor() + ";\nNumber of paws: " + getNumberOfPaws() +
                "; \nWidth of spread wings : " + widthOfSpreadWings + "sm.");

    }
}
