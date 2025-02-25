package org.hospital.Model;

public class SensorOxigeno implements Calibrable{
    private int oxigenacion;
    public int ReportarOxigenacion(){
        return oxigenacion;
    }

    @Override
    public void IniciarCalibracion() {

    }

    @Override
    public void FinalizarCalibracion() {

    }
}
