package org.hospital.model;

public class Distribuidor extends Robot {
    private SensorProximidad sensorProximidad = new SensorProximidad();
    private String medicamento;

    public String EntregarMedicamento() {
        int posicion = sensorProximidad.ReportarPosicion();
        if (posicion == 10) {
            return Entregado() + "";
        } else {
            return "Entrega fallida";
        }
    }

    public boolean Entregado() {
        medicamento = "Penicilina";
        System.out.println("Se entregó exitosamente: " + medicamento);
        return true;
    }

    public String MostrarSensorProximidad() {
        sensorProximidad.IniciarCalibracion();
        sensorProximidad.FinalizarCalibracion();
        return (sensorProximidad.ReportarPosicion()).toString();
    }

}
