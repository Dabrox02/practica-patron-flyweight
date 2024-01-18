package com.local;

public class Tree {
    private int x;
    private int y;
    private TreeType type;

    // El arbol se compone de partes extrinsecas, no intrinsecas.
    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(String canvas) {
        type.draw(canvas, x, y);
    }
}
