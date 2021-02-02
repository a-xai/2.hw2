package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Ant");
        createObject("Mantis");
        createObject("Butterfly");
    }

    public static Insects createObject(String className) {
        switch (className) {
            case "Ant":
                System.out.println("_______________________");
                Ant ant = new Ant(6, "brown", "Jack", 5);
                ant.print();
                System.out.println("_______________________");
                return ant;
            case "Mantis":
                Mantis mantis = new Mantis(8, "green", 3, 10);
                mantis.print();
                System.out.println("_______________________");
                return mantis;
            case "Butterfly":
                Butterfly butterfly = new Butterfly(6, "rainbow", "non-venomous monarch", 15);
                butterfly.print();
                System.out.println("_______________________");
                return butterfly;
            default:
                return null;
        }
    }
}
