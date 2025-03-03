package org.hospital.model;

import java.util.Random;

public class Robot {
    private int numeroDeSerie;

    public String Activar(String robot) {
        return robot + " Activado";
    }

    public String Desactivar(String robot) {
        return robot + " Desactivado";
    }

    public void setNumeroDeSerie(int numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public int getNumeroDeSerie() {
        Random random = new Random();
        return 100000 + random.nextInt(900000);
    }
}
