package org.hospital.model;

/**
 * Representa un robot distribuidor que extiende de un robot y está asociado con un sensor de proximidad
 * para entregar medicamentos a una ubicación específica.
 */
public class Distribuidor extends Robot {
    private SensorProximidad sensorProximidad = new SensorProximidad();
    private String medicamento;

    /**
     * Intenta entregar un medicamento basado en la posición reportada por el sensor de proximidad.
     * Si la posición es 10, se considera que la entrega fue exitosa.
     *
     * @return Un mensaje indicando si la entrega fue exitosa o fallida.
     */
    public String EntregarMedicamento() {
        medicamento = "Penicilina";
        int posicion = sensorProximidad.ReportarPosicion();
        if (posicion == 10) {
            return Entregado() + "Se entregó exitosamente: " + medicamento;
        } else {
            return "Entrega fallida";
        }
    }

    /**
     * Indica que el medicamento fue entregado correctamente.
     *
     * @return `true` si la entrega fue exitosa.
     */

    public boolean Entregado() {
        return true;
    }

    /**
     * Muestra el estado del sensor de proximidad después de iniciar y finalizar su calibración.
     *
     * @return La posición reportada por el sensor de proximidad.
     */
    public String MostrarSensorProximidad() {
        sensorProximidad.IniciarCalibracion();
        sensorProximidad.FinalizarCalibracion();
        return (sensorProximidad.ReportarPosicion()).toString();
    }
}
