package org.hospital.Model;

public class SensorProximidad implements Calibrable{
    private int posicion;
    public Integer ReportarPosicion(){
        return posicion;
    }

    @Override
    public void IniciarCalibracion() {

    }

    @Override
    public void FinalizarCalibracion() {

    }
}
