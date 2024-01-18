package com.local;

public class TreeType {
    private String name;
    private String color;
    private String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(String canvas, int x, int y) {
        System.out.println("Dibujando en el lienzo: " + canvas + ", X: " + x + ", Y: " + y +
                ", Tipo: " + name + ", Color: " + color + ", Textura: " + texture);
    }
}