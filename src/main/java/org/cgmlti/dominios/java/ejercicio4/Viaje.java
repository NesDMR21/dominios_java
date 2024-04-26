package org.cgmlti.dominios.java.ejercicio4;

import java.time.Duration;
import java.time.LocalDateTime;

public class Viaje {
    LocalDateTime fechaInicio;
    LocalDateTime fechaFin;

    //crear un metodo que imprima
    //la duracion del viaje
    //dada la fecha de inicio y fin
    //ingresados como inputs                                                                    

    public void calcularDuracionViaje(
        LocalDateTime fechaInicio,
        LocalDateTime fechaFin
    )
    {
        //asignar las fechas parametro
        //a los atributos del objeto
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        Duration diferencia = Duration.between(fechaInicio, fechaFin);
        System.out.println("duracion del viaje : dias-" + diferencia.toDays() + " horas-" + diferencia.toHours());
    }

    //sobrecarga del metodo calcularDuracionViaje
    public long calcularDuracionViaje(){
        Duration diferencia = Duration.between(fechaInicio, fechaFin);
        return diferencia.toDays();
    }
}
