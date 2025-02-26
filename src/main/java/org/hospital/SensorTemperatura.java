package org.hospital;


public class SensorTemperatura implements Calibrable{
    private int remperatura;
    public int ReportarTemperatura(){
        return remperatura;
    }

    @Override
    public void IniciarCalibracion() {

    }

    @Override
    public void FinalizarCalibracion() {

    }
}
