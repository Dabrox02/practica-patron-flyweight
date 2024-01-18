package com.local;

public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();

        forest.plantTree(1, 2, "Pino", "Verde", "Rugoso");
        forest.plantTree(3, 4, "Roble", "Marrón", "Liso");
        forest.plantTree(5, 6, "Pino", "Verde", "Rugoso");

        forest.draw("MiCanvas");
    }
}