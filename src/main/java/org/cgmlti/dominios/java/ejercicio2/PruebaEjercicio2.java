package org.cgmlti.dominios.java.ejercicio2;

public class PruebaEjercicio2 {

public static void main(String[] args){
    //Crear 2 instancias de cada Entidad
    //Instancia 2 veces cada Entidad 
    //Crear 2 objetos de cada Entidad 
    //1. Nombre de la clase a Integrar 
    //2. nombre del objeto(identificador)
    //3. operador de asignacion 
    //4. palabra(referencia) new
    //5. otra vez, el nombre de la clase 
    //6. parantesis(Constructor)
    Hospital hospital1 = new Hospital();
    Hospital h1 = new Hospital();

    //acceder a los atributos del objeto:
    //operador .
    //1. identificador del objeto
    //2. el punto
    //3. el atributo a trabajar 
    //4. el operador de asiganacion 
    //5. el valor a asignar al atributo
    hospital1.direccion = "Caracas con 52";
    h1.nombre = "San Rafael";
    h1.telefono = 3204201591L;

    //crear 3 Medicos:
    Medico medico1 = new Medico();
    medico1.nombre = "Cristian Ricardo";
    medico1.cedula = 35675345678L;
    medico1.especialidad = "CARDIOLOGIA";

    Medico medico2 = new Medico();
    medico2.nombre = "Nestor Montenegro";
    medico2.cedula = 1021663769L;
    medico2.especialidad = "DERMATOLOGIA";
    
    Medico medico3 = new Medico();
    medico3.nombre = "Juan";
    medico3.cedula = 32324423L;
    medico3.especialidad = "UROLOGO";

    //crear 2 salas
    SalaHospital sala1 = new SalaHospital();
    sala1.numero = 300;
    sala1.cantidadCamas = 5;

    SalaHospital sala2 =new SalaHospital();
    sala2.numero = 301;
    sala2.cantidadCamas = 5;

    //crear paciente
    Paciente paciente1 = new Paciente();
    paciente1.nombre = "pedro";
    paciente1.cedula = 32313664L;
    paciente1.direccion = "calle 52";


    //añadir medicos al hospital 
    hospital1.listaMedicos.add(medico1);
    hospital1.listaMedicos.add(medico2);
    hospital1.listaMedicos.add(medico3);
    hospital1.listaSalas.add(sala1);
    hospital1.listaSalas.add(sala2);

    //recorrer la lista de medicos 
    //del hospital1;
    for( Medico medicoRecorrer : hospital1.listaMedicos){
        System.out.println("Medico:" + medicoRecorrer.cedula);
    }

    for( SalaHospital salaRecorrer : hospital1.listaSalas){
        System.out.println("SalaHospital:" + salaRecorrer.numero);
    }
}
}
