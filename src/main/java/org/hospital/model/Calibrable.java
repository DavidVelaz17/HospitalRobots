package org.hospital.model;

/**
 * Interfaz funcional que define los métodos necesarios para realizar calibraciones en dispositivos.
 * Implementada por sensores que requieren calibración.
 */
public interface Calibrable {

    /**
     * Inicia el proceso de calibración del dispositivo.
     *
     * @return Un mensaje que indica que el proceso de calibración ha comenzado.
     */
    public String IniciarCalibracion();

    /**
     * Finaliza el proceso de calibración del dispositivo.
     * Este es un método por defecto que puede ser sobrescrito si se necesita una implementación personalizada.
     *
     * @return Un mensaje indicando que la calibración ha finalizado.
     */
    default public String FinalizarCalibracion() {
        return "Calibración finalizada";
    }
}
