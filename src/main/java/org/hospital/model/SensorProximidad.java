package org.hospital.model;

import java.util.Random;

public class SensorProximidad implements Calibrable {
    private int posicion;

    public Integer ReportarPosicion() {
        Random posicionRandom = new Random();
        posicion = posicionRandom.nextInt(100);
        return posicion;
    }

    @Override
    public String IniciarCalibracion() {
        return "Iniciando calibración de sensor de proximidad";
    }
}
