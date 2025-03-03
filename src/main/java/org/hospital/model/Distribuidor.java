package org.hospital.model;

public class Distribuidor extends Robot {
    private SensorProximidad sensorProximidad = new SensorProximidad();
    private String medicamento;

    public String EntregarMedicamento() {
        medicamento = "Penicilina";
        int posicion = sensorProximidad.ReportarPosicion();
        if (posicion == 10) {
            return Entregado() + "Se entregó exitosamente: " + medicamento;
        } else {
            return "Entrega fallida";
        }
    }

    public boolean Entregado() {
        return true;
    }

    public String MostrarSensorProximidad() {
        sensorProximidad.IniciarCalibracion();
        sensorProximidad.FinalizarCalibracion();
        return (sensorProximidad.ReportarPosicion()).toString();
    }

}
