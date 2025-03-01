package org.hospital;

import java.util.Random;

public class SensorOxigeno implements Calibrable{
    private int oxigenacion;
    public int ReportarOxigenacion(){
        Random oxigenoRandom = new Random();
        oxigenacion = 90 + oxigenoRandom.nextInt() * (100 - 90);
        return oxigenacion;
    }

    @Override
    public void IniciarCalibracion() {
        System.out.println("Iniciando calibración de sensor de oxigeno");
    }
}
