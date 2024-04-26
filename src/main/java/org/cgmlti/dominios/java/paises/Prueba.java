package org.cgmlti.dominios.java.paises;

public class Prueba {
    public static void main(String[] args) {

        //ciudades
        Ciudad ciudad1 = new Ciudad("Bogota");
        Ciudad ciudad2 = new Ciudad("Medellin");
        Ciudad ciudad3 = new Ciudad("Ibague");

        //pais
        Pais pais = new Pais("Colombia");
        pais.listaCiudades.add(ciudad1);
        pais.listaCiudades.add(ciudad2);
        pais.listaCiudades.add(ciudad3);
        //rutas
        Ruta ruta1 = new Ruta(55);
        Ruta ruta2 = new Ruta(43);
        Ruta ruta3 = new Ruta(84);

        //agregar rutas a las ciudades
        ciudad1.listaRutas.add(ruta1);
        ciudad2.listaRutas.add(ruta2);
        ciudad3.listaRutas.add(ruta3);

        for(Ciudad ciudadRecorrer : pais.listaCiudades){
            System.out.println("Pais: " + pais.nombre);
            System.out.println("Ciudad: " + ciudadRecorrer.nombre);
            for(Ruta rutas : ciudadRecorrer.listaRutas){
                System.out.println("Ruta: " + rutas.numero);
            }
            System.out.println("--------------------");
    }

}
}