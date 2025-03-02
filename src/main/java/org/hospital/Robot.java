package org.hospital;

public class Robot {
    private int numeroDeSerie;


    public String Activar(String robot) {
        return robot + ": Activado";
    }

    public String Desactivar(String robot) {
        return robot + ": Desactivado";
    }

    public void setNumeroDeSerie(int numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public int getNumeroDeSerie() {
        return numeroDeSerie;
    }
}
