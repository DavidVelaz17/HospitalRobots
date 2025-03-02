package org.hospital;

public class Robot {
    private int numeroDeSerie;


    public void Activar(){
        System.out.println("Robot activado");
    }
    public void Desactivar(){
        System.out.println("Robot desactivado");
    }

    public void setNumeroDeSerie(int numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }
    public int getNumeroDeSerie() {
        return numeroDeSerie;
    }
}
