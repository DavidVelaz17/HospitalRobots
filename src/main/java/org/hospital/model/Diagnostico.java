package org.hospital.model;

public class Diagnostico extends Robot {
    private SensorTemperatura sensorTemperatura = new SensorTemperatura();
    private String observaciones;
    private String diagnosticoFinal;

    public String AnalisisClinico() {
        float temperatura = sensorTemperatura.ReportarTemperatura();
        if (temperatura >= 36.1F && temperatura <= 37.2F) {
            observaciones = "La temperatura del paciente es normal";
            diagnosticoFinal = "El paciente no requiere tratamiento";
        } else if (temperatura > 35 && temperatura < 36.1F) {
            observaciones = "El paciente presenta temperatura baja pero no llega a hipotermia";
            diagnosticoFinal = "Ligera hipotermia, se recomienda ponserse el sueter de la abuela";
        } else if (temperatura > 37.2F && temperatura < 40) {
            observaciones = "El paciente presenta temperatura alta, probable infección";
            diagnosticoFinal = "Fiebre por posible infección, se receta Penicilina";
        } else if (temperatura > 40) {
            observaciones = "El paciente presenta hipertermia, se requiere atención médica inmediata";
            diagnosticoFinal = "Hipotermia";
        } else if (temperatura < 35) {
            observaciones = "El paciente presenta hipotermina, se requiere atención médica inmediata";
            diagnosticoFinal = "Hipotermina";
        }
        return observaciones + "\n" + diagnosticoFinal;
    }

    public String MostrarSensorTemperatura() {
        sensorTemperatura.IniciarCalibracion();
        sensorTemperatura.FinalizarCalibracion();
        float temperatura = sensorTemperatura.ReportarTemperatura();
        return String.format("Temperatura actual: %s°C", temperatura);
    }

}
