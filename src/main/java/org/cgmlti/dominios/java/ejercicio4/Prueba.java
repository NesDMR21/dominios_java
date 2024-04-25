package org.cgmlti.dominios.java.ejercicio4;

import java.time.LocalDateTime;

public class Prueba {
    public static void main(String[] args) {
        //instanciar un ejemplar

        //crae un objeto viaje
        Viaje v = new Viaje();
        v.fechaInicio = LocalDateTime.of(2024,  4, 26, 22, 30, 0);
        v.fechaFin = LocalDateTime.of(2024,  4, 28, 6, 30, 0);


        //de cada tipo de vehiculo
        Camion c1 = new Camion();
        c1.estaDisponible = true;

        //establecer el viaje del camion
        c1.elTalViajeQueHioElCamion = v;

        CamionRemolque cr1 = new CamionRemolque();
        cr1.capacidadCargaExtra = 9;

        System.out.println("El viaje del camion " + "tiene fecha de inicio: " + c1.elTalViajeQueHioElCamion.fechaInicio + ", y fecha fin: " + c1.elTalViajeQueHioElCamion.fechaFin);
    }
}
