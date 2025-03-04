package org.hospital.model;

/**
 * Representa un robot diagnóstico que extiende de un robot y está asociado con un sensor de temperatura
 * para analizar la condición de un paciente y proporcionar un diagnóstico basado en la temperatura reportada.
 */
public class Diagnostico extends Robot {
    private SensorTemperatura sensorTemperatura = new SensorTemperatura();
    private String observaciones;
    private String diagnosticoFinal;

    /**
     * Realiza un análisis clínico basado en la temperatura del paciente.
     * El diagnóstico final y las observaciones se generan dependiendo de la temperatura reportada por el sensor.
     * <p>
     * La temperatura se clasifica en las siguientes categorías:
     * - Temperatura normal: 36.1°C - 37.2°C
     * - Temperatura baja: 35°C - 36.1°C
     * - Fiebre: 37.2°C - 40°C
     * - Hipertermia: > 40°C
     * - Hipotermia: < 35°C
     *
     * @return Un mensaje con las observaciones y el diagnóstico final del paciente.
     */
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

    /**
     * Muestra el estado del sensor de temperatura después de iniciar y finalizar su calibración.
     *
     * @return La temperatura reportada por el sensor de temperatura.
     */
    public String MostrarSensorTemperatura() {
        sensorTemperatura.IniciarCalibracion();
        sensorTemperatura.FinalizarCalibracion();
        float temperatura = sensorTemperatura.ReportarTemperatura();
        return String.format("Temperatura actual: %s°C", temperatura);
    }

}
