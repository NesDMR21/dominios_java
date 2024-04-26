package org.cgmlti.dominios.java.paises;

import java.util.ArrayList;
import java.util.List;

public class Ciudad {
    String nombre;

    public Ciudad() {
    }

    public Ciudad(String nombre) {
        this.nombre = nombre;
    }

    
    List<Ruta> listaRutas = new ArrayList<Ruta>();

}
