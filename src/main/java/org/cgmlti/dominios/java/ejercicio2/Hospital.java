package org.cgmlti.dominios.java.ejercicio2;

import java.util.List;
import java.util.ArrayList;

public class Hospital {

    String nombre;
    String direccion;
    Long telefono;

    //Lista de Medicos:
    //tambien es un atributo 
    //de los objetos hospital

    List<Medico> listaMedicos = 
                new ArrayList<Medico>(); 

    List<SalaHospital> listaSalas = 
                new ArrayList<SalaHospital>();

    List<Paciente> Paciente = 
                new ArrayList<Paciente>();

}
