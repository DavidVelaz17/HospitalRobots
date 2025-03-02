package org.hospital.model;

import java.util.*;

public class Cirujano extends Robot {
    private SensorOxigeno sensorOxigeno = new SensorOxigeno();
    private String nombreCirujano;
    private Date fecha;

    public void CirugiaAsistida() {
        int oxigeno = sensorOxigeno.ReportarOxigenacion();
        fecha = new Date();
        String mensajeOxigenación =
                oxigeno <= 92 ?
                        "Niveles de oxígeno muy bajos, aumentar los niveles de oxigenación" :
                        oxigeno < 95 ?
                                "Niveles de oxígeno bajos, aumentar los niveles de oxigenación" :
                                "Niveles óptimos de oxígeno";
        System.out.println("Inicia cirugía asistida\nDoctor(a) asignado(a) " +
                CirujanoAsignado() + "\nFecha: " + fecha);
        System.out.println(mensajeOxigenación);
        System.out.println(Exitoso() ? "Operación Exitosa" : "Operación Fallida");

    }

    public boolean Exitoso() {
        int tiempo;
        Random tiempoRandom = new Random();
        tiempo = tiempoRandom.nextInt(5);
        if (tiempo < 3) return true;
        else return false;
    }

    public String CirujanoAsignado() {
        Random random = new Random();
        List<String> doctores =
                Arrays.asList("Otto Octavius",
                        "John Doe", "Jane Doe", "Clara Smith",
                        "Dwayne Johnson", "Susan Storm", "Edward Nigma");
        nombreCirujano = doctores.get(random.nextInt(doctores.size())); //Función de orden superior
        return nombreCirujano;
    }

    public class BypassCoronario extends Cirujano {
        private int numeroBypass;

        public boolean RealizarAnastomosis() {
            numeroBypass = new Random().nextInt(10);
            System.out.println("Robot asistente de bypass coronario: " + numeroBypass
                    + "\nInicia anastomosis");
            return true;
        }
    }

    public class ReparacionDeValvulaMitral extends Cirujano {
        private float anchuraDeValvulaMitral;

        public void ReparacionDeValvulaMitral() {
            anchuraDeValvulaMitral = new Random().nextFloat(2F);
            System.out.println("Robot asistente de reparación " +
                    "de valvula mitral inicia reparación de valvula mitral");
        }

        public void ReparacionDeEstenosis() {
            System.out.println("Robot asistente de reparación" +
                    " de valvula mitral inicia reparación de estenosis");
        }
    }

    public class Tumorectomia extends Cirujano {
        private String tipo;
        private float tamaño;

        public void ExtraccionDeCancer() {
            List<String> tipos = Arrays.asList("cerebral", "tejido blando", "cáncer de mama", "óseo", "piel");
            tamaño = new Random().nextFloat(2F);
            tipo = tipos.get(new Random().nextInt(tipos.size()));
            System.out.println("Robot asistende de tumorectomia" +
                    "inicia extracción de cancer de " + tipo + " de tamaño " + tamaño);
        }
    }
}
