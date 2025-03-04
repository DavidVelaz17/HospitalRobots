package org.hospital.model;

import java.util.Random;

/**
 * Representa un sensor de oxígeno que puede reportar el nivel de oxigenación y realizar calibraciones.
 */
public class SensorOxigeno implements Calibrable {
    private int oxigenacion;

    /**
     * Genera y reporta un nivel aleatorio de oxigenación en un rango del 90% al 100%.
     *
     * @return Un valor entero que representa el nivel de oxigenación.
     */
    public int ReportarOxigenacion() {
        Random oxigenoRandom = new Random();
        oxigenacion = oxigenoRandom.nextInt(11) + 90;
        return oxigenacion;
    }

    /**
     * Inicia el proceso de calibración del sensor de oxígeno.
     *
     * @return Un mensaje indicando que la calibración ha comenzado.
     */
    @Override
    public String IniciarCalibracion() {
        return "Iniciando calibración de sensor de oxígeno";
    }
}
