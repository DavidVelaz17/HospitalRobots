package org.hospital.model;

import java.util.Random;

/**
 * Representa un sensor de temperatura que puede reportar la temperatura y realizar calibraciones.
 */
public class SensorTemperatura implements Calibrable {
    private float temperatura;

    /**
     * Genera y reporta una temperatura aleatoria en un rango de 13.7°C a 46.5°C.
     *
     * @return Un valor flotante que representa la temperatura medida por el sensor.
     */
    public float ReportarTemperatura() {
        Random temperaturaRandom = new Random();
        temperatura = 13.7F + temperaturaRandom.nextFloat() * (46.5F - 13.7F);
        return temperatura;
    }

    /**
     * Inicia el proceso de calibración del sensor de temperatura.
     *
     * @return Un mensaje indicando que la calibración ha comenzado.
     */
    @Override
    public String IniciarCalibracion() {
        return "Iniciando calibración de sensor de temperatura";
    }
}
