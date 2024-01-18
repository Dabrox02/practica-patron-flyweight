package com.local;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, String color, String texture) {
        TreeType type = TreeFactory.getTreeType(name, color, texture); // Obtiene un  treetype, validando si esta o no en el mapa
        Tree tree = new Tree(x, y, type); // Instancia el objeto concreto el cual requiere parametros mutables como X y Y
        trees.add(tree);
    }

    public void draw(String canvas) {
        for (Tree tree : trees) {
            tree.draw(canvas);
        }
    }
}
