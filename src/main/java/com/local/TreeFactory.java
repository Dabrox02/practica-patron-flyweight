package com.local;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static Map<String, TreeType> treeTypes = new HashMap<>(); // mapa de objetos treetype, cuya llave un string 

    public static TreeType getTreeType(String name, String color, String texture) {
        TreeType type = treeTypes.get(name + color + texture); // busca en el mapa el objeto si existe
        if (type == null) {
            type = new TreeType(name, color, texture); // si el arbol no existe en mapa lo crea
            treeTypes.put(name + color + texture, type); // Usar nombre color y textura para identificar eel arbol
        }
        return type;
    }
}
