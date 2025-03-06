package org.hospital.model;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Representa un robot cirujano que extiende de un robot y está asociado con un sensor de oxígeno
 * de igual manera contiene tres clases internas
 */
public class Cirujano extends Robot {
    private SensorOxigeno sensorOxigeno = new SensorOxigeno();
    private String nombreCirujano;
    private Date fecha;

    /**
     * Realiza una cirugía asistida, supervisando los niveles de oxigenación del paciente
     * y generando un informe con el estado de la operación.
     * <br/>
     * El estado de oxigenación se clasifica de la siguiente forma:<br/>
     * - Niveles muy bajos de oxígeno (<= 92%): "Aumentar los niveles de oxigenación".<br/>
     * - Niveles bajos de oxígeno (< 95%): "Aumentar los niveles de oxigenación".<br/>
     * - Niveles óptimos de oxígeno: "Niveles óptimos de oxígeno".
     * <br/>
     * El resultado de la operación puede ser exitoso o fallido dependiendo de un cálculo aleatorio.
     * <br/>
     *
     * @return Un mensaje con el nombre del cirujano asignado, la fecha de la operación,
     * el estado de oxigenación y el resultado de la operación.
     */
    public String CirugiaAsistida() {
        int oxigeno = sensorOxigeno.ReportarOxigenacion();
        fecha = new Date();

        String mensajeOxigenacion = (oxigeno <= 92)
                ? "Niveles de oxígeno muy bajos, aumentar los niveles de oxigenación."
                : (oxigeno < 95)
                ? "Niveles de oxígeno bajos, aumentar los niveles de oxigenación."
                : "Niveles óptimos de oxígeno.";

        String resultadoOperacion = Exitoso() ? "Operación Exitosa." : "Operación Fallida.";

        return String.format(
                "=== Cirugía Asistida ===\n" +
                        "Doctor(a) asignado(a): %s\n" +
                        "Fecha: %s\n" +
                        "Estado de oxigenación: %s\n" +
                        "Resultado: %s",
                CirujanoAsignado(),
                fecha,
                mensajeOxigenacion,
                resultadoOperacion
        );
    }

    /**
     * Muestra el estado del sensor de oxigenación después de iniciar y finalizar su calibración.
     *
     * @return Un mensaje con el nivel de oxigenación reportado por el sensor de oxígeno.
     */
    public String MostrarSensorOxigeno() {
        int oxigenacion = sensorOxigeno.ReportarOxigenacion();
        return sensorOxigeno.IniciarCalibracion() + "\n" +
                sensorOxigeno.FinalizarCalibracion() + "\nNivel de oxigenación actual: " + oxigenacion + " %";
    }

    /**
     * Simula el éxito de una operación de manera aleatoria.
     *
     * @return true si la operación es exitosa, false si la operación falla.
     */
    public boolean Exitoso() {
        int tiempo;
        Random tiempoRandom = new Random();
        tiempo = tiempoRandom.nextInt(5);
        if (tiempo < 3) return true;
        else return false;
    }

    /**
     * Asigna un nombre aleatorio a un cirujano de una lista predefinida.
     *
     * @return El nombre del cirujano asignado a la operación.
     */
    public String CirujanoAsignado() {
        Random random = new Random();
        List<String> doctores =
                Arrays.asList("Otto Octavius",
                        "John Doe", "Jane Doe", "Clara Smith",
                        "Dwayne Johnson", "Susan Storm", "Edward Nigma");
        nombreCirujano = doctores.get(random.nextInt(doctores.size())); //Función de orden superior
        return nombreCirujano;
    }

    /**
     * Clase interna que representa una cirugía de Bypass Coronario
     */

    public class BypassCoronario extends Cirujano {
        private int numeroBypass;

        /**
         * Realiza una anastomosis de bypass coronario.
         *
         * @return Un mensaje indicando que la anastomosis ha comenzado.
         */
        public String RealizarAnastomosis() {
            numeroBypass = new Random().nextInt(10);
            return "Robot asistente de bypass coronario: " + numeroBypass
                    + "\nInicia anastomosis";
        }
    }

    /**
     * Clase interna que representa una cirugía para la reparación de la válvula mitral.
     */
    public class ReparacionDeValvulaMitral extends Cirujano {
        private float anchuraDeValvulaMitral;

        /**
         * Realiza la reparación de la válvula mitral.
         *
         * @return Un mensaje indicando que la reparación de la válvula mitral ha comenzado.
         */
        public String ReparacionDeValvulaMitral() {
            anchuraDeValvulaMitral = new Random().nextFloat(2F);
            return "Robot asistente de reparación " +
                    "de valvula mitral inicia reparación de valvula mitral";
        }

        /**
         * Realiza la reparación de estenosis en la válvula mitral.
         *
         * @return Un mensaje indicando que la reparación de estenosis ha comenzado.
         */
        public String ReparacionDeEstenosis() {
            return "Robot asistente de reparación" +
                    " de valvula mitral inicia reparación de estenosis";
        }
    }

    /**
     * Clase interna que representa una cirugía para realizar una tumorectomía.
     */
    public class Tumorectomia extends Cirujano {
        private String tipo;
        private float tamaño;

        /**
         * Realiza la extracción de un tumor de acuerdo con el tipo y tamaño especificado.
         *
         * @return Un mensaje indicando que la extracción del tumor ha comenzado.
         */
        public String ExtraccionDeCancer() {
            List<String> tipos = Arrays.asList("cerebral", "tejido blando", "cáncer de mama", "óseo", "piel");
            tamaño = new Random().nextFloat(2F);
            tipo = tipos.get(new Random().nextInt(tipos.size()));
            return "Robot asistende de tumorectomia" +
                    "inicia extracción de cancer de " + tipo + " de tamaño " + tamaño;

        }
    }
}
