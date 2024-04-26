package org.cgmlti.dominios.java.ejercicio4;

import java.time.LocalDateTime;

public class Prueba {
    public static void main(String[] args) {
        //instanciar un ejemplar

        //crear una instancia de vheiculo
        Vehiculo vehiculo1 = new Vehiculo(123123123L, false, 9);
        System.out.println(vehiculo1);


        //crae un objeto viaje
        Viaje v = new Viaje();
        v.calcularDuracionViaje(LocalDateTime.of(2024,  4, 26, 22, 30, 0), LocalDateTime.of(2024,  4, 28, 23, 30, 0)); 

        //invocacion de la sobrecarga
        System.out.println("Duracion en dias del viaje: " + v.calcularDuracionViaje());


        //de cada tipo de vehiculo
        Camion c1 = new Camion();
        c1.estaDisponible = true;

        //establecer el viaje del camion
        c1.elTalViajeQueHioElCamion = v;

        CamionRemolque cr1 = new CamionRemolque();
        cr1.capacidadCargaExtra = 9;
        cr1.capacidadCarga = 10;

        //invocar el metodo creado
        Integer totalCarga = cr1.calcularTotalCarga();

        System.out.println("El viaje del camion " + "tiene fecha de inicio: " + c1.elTalViajeQueHioElCamion.fechaInicio + ", y fecha fin: " + c1.elTalViajeQueHioElCamion.fechaFin + " total carga: " + totalCarga);
    }
}