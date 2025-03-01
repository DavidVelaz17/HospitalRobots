package org.hospital;

import java.util.*;

public class Cirujano extends Robot{
    private SensorOxigeno sensorOxigeno=new SensorOxigeno();
    private String nombreCirujano;
    private Date fecha;
    public void CirugiaAsistida(){
        int oxigeno= sensorOxigeno.ReportarOxigenacion();
        fecha = new Date();
        System.out.println("Inicia cirugía asistida\nDoctor(a) asignado(a) "+
                CirujanoAsignado()+"\nFecha: "+fecha);
        if(oxigeno>=90 && oxigeno<=92){
            System.out.println("Niveles de oxígeno muy bajos, aumentar los niveles de oxigenación");
        } else if (oxigeno>92 && oxigeno<95) {
            System.out.println("Niveles de oxígeno bajos, aumentar los niveles de oxigenación");
        }else{
            System.out.println("Niveles óptimos de oxígeno");
        }
    }
//TODO para un cleaner code sería factible mover la lógica a otro método
//TODO Verificar si no afecta en el diagrma de clases los métodos de lógica
    public boolean Exitoso(){
        /*
        TODO utilizar una variable tiempo para
        verificar que si el paciente ha pasado
        más de cierto tiempo sin buena oxigenación
        la operación fué fallida retornando un false
        */
        return true;
    }

    public String CirujanoAsignado(){
        Random random = new Random();
        List<String> doctores =
                Arrays.asList("Otto Octavius",
                        "John Doe", "Jane Doe", "Clara Smith",
                        "Dwayne Johnson","Susan Storm", "Edward Nigma");
        nombreCirujano = doctores.get(random.nextInt(doctores.size())); //Función de orden superior
        return nombreCirujano;
    }

    class BypassCoronario extends Cirujano{
        private int numeroBypass;
        public boolean RealizarAnastomosis(){
            System.out.println("Robot asistente de cirugía realiza anastomosis");
            return true;
        }
    }

    class ReparacionDeValvulaMitral extends Cirujano{
        private float anchuraDeValvulaMitral;
        public void ReparacionDeValvulaMitral(){}
        public void ReparacionDeEstenosis(){}
    }

    class Tumorectomia extends Cirujano{
        private String tipo;
        private float tamaño;
        public void ExtraccionDeCancer(){}
    }
}
