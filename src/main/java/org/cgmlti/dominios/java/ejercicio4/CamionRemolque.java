package org.cgmlti.dominios.java.ejercicio4;

public class CamionRemolque extends Vehiculo{
    Integer capacidadCargaExtra;
    String descripcion;

    Viaje elTalViajeQuHizoElCamion;

    //crear un metodo que permita
    //calcular el total de carga maxima
    //soportado en los camiones
    //declaracion de metodo

    public Integer calcularTotalCarga(){
        Integer totalCarga = capacidadCarga + capacidadCargaExtra;
        return totalCarga;
    }
}