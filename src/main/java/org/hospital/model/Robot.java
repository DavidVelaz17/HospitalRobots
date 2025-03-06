package org.hospital.model;

import java.util.Random;

/**
 * Representa un robot con un número de serie y funcionalidades de activación y desactivación.
 */
public class Robot {
    private int numeroDeSerie;

    /**
     * Activa el robot y devuelve un mensaje de confirmación.
     *
     * @param robot Nombre o identificador del robot.
     * @return Un mensaje indicando que el robot ha sido activado.
     */
    public String Activar(String robot) {
        return robot + " Activado";
    }

    /**
     * Desactiva el robot y devuelve un mensaje de confirmación.
     *
     * @param robot Nombre o identificador del robot.
     * @return Un mensaje indicando que el robot ha sido desactivado.
     */
    public String Desactivar(String robot) {
        return robot + " Desactivado";
    }

    /**
     * Establece el número de serie del robot.
     *
     * @param numeroDeSerie Número de serie a asignar al robot.
     */
    public void setNumeroDeSerie(int numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    /**
     * Obtiene el número de serie del robot.
     * <strong>Nota: Este método genera un número aleatorio en lugar de devolver el número de serie almacenado.</strong>
     *
     * @return Un número de serie aleatorio de 6 dígitos.
     */
    public int getNumeroDeSerie() {
        if (numeroDeSerie == 0) {
            // Si el número de serie no ha sido establecido, generar un número aleatorio
            Random random = new Random();
            numeroDeSerie = 100000 + random.nextInt(900000);
        }
        return numeroDeSerie;
    }
}
