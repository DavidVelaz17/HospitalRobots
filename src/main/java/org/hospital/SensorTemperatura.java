package org.hospital;


import java.util.Random;

public class SensorTemperatura implements Calibrable {
    private float temperatura;

    public float ReportarTemperatura() {
        Random temperaturaRandom = new Random();
        temperatura = 13.7F + temperaturaRandom.nextFloat() * (46.5F - 13.7F);
        return temperatura;
    }

    @Override
    public String IniciarCalibracion() {
        return "Iniciando calibración de sensor de temperatura";
    }
}
