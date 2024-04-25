package org.cgmlti.dominios.java.ejercicio2;

public class PruebaEjercicio2 {
    public static void main(String[] args) {
        //Crear 2 instancias de cada entidad
        //Instancias 2 veces cada entidad
        //Crear 2 objetos de cada entidad        //1. Nombre de la clase a Instanciar
        //2.Nombre del objeto(identificador)
        //3. operador de asignacion
        //4. palabra(referiencia) new
        //5. otra vez el nombe de la clase
        //6. parentecis(constructor)
        Hospital hospital1 = new Hospital();
        Hospital h1 = new Hospital();

        //acceder a los atrivutos del objeto:
        //operador (.)
        //1. identificadoir del objeto 
        //2. el punto
        //3. el atributo a trabajar
        //4. el operador de asignacion
        //5. el valor a asignar al atributo
        hospital1.direccion = "Caracas con 52";
        h1.nombre = "San Rafael";
        h1.telefono = 3523542353453L;

        //crear 3 medicos
        Medico medico1 = new Medico();
    
        medico1.nombre = "Juan";
        medico1.cedula = 521634152312L;
        medico1.especialidad = "Cardiologia";

        Medico medico2 = new Medico();

        medico2.nombre = "Roberto";
        medico2.cedula = 52163242312L;
        medico2.especialidad = "Urologia";

        Medico medico3 = new Medico();

        medico3.nombre = "Felipe";
        medico3.cedula = 5216231232312L;
        medico3.especialidad = "Pediatria";
        
        //añadir medicos al hospital
        hospital1.listaMedicos.add(medico1);
        hospital1.listaMedicos.add(medico2);

        //añadir 2 salas
        SalaHospital sala1 = new SalaHospital();
        sala1.numero = 1;
        sala1.cantidadCamas = 4;
        SalaHospital sala2 = new SalaHospital();
        sala2.numero = 2;
        sala2.cantidadCamas = 4;

        //añadir salas al hospital
        hospital1.listaSala.add(sala1);
        hospital1.listaSala.add(sala2);
        //recorrer la lista de medicos
        //del hospital 1;
        for(Medico medicoRecorrer : hospital1.listaMedicos){
            System.out.println("Medico: " + medicoRecorrer.cedula);
        }

        for(SalaHospital salaRecorrer : hospital1.listaSala){
            System.out.println("Sala: " + salaRecorrer.numero);
        }

    }

}
