package org.hospital.model;

import java.util.Random;

public class SensorOxigeno implements Calibrable {
    private int oxigenacion;

    public int ReportarOxigenacion() {
        Random oxigenoRandom = new Random();
        oxigenacion = oxigenoRandom.nextInt(11) + 90;
        return oxigenacion;
    }

    @Override
    public String IniciarCalibracion() {
        return "Iniciando calibración de sensor de oxigeno";
    }
}
