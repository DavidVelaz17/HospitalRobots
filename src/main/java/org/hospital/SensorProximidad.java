package org.hospital;

import java.util.Random;

public class SensorProximidad implements Calibrable{
    private int posicion;
    public Integer ReportarPosicion(){
        Random posicionRandom = new Random();
        posicion = posicionRandom.nextInt(100);
        return posicion;
    }

    @Override
    public void IniciarCalibracion() {
        System.out.println("Iniciando calibración de sensor de proximidad");
    }
}
