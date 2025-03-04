package org.hospital.model;

import java.util.Random;

/**
 * Representa un sensor de proximidad que puede reportar su posición y realizar calibraciones.
 */
public class SensorProximidad implements Calibrable {
    private int posicion;

    /**
     * Genera y reporta una posición aleatoria en un rango de 0 a 49.
     *
     * @return Un valor entero que representa la posición detectada por el sensor.
     */
    public Integer ReportarPosicion() {
        Random posicionRandom = new Random();
        posicion = posicionRandom.nextInt(50);
        return posicion;
    }

    /**
     * Inicia el proceso de calibración del sensor de proximidad.
     *
     * @return Un mensaje indicando que la calibración ha comenzado.
     */
    @Override
    public String IniciarCalibracion() {
        return "Iniciando calibración de sensor de proximidad";
    }
}
