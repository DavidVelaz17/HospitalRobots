package org.hospital.Model;

public class Robot {
    private int numeroDeSerie;
    private String estado;

    public void Activar(){}
    public void Desactivar(){}
    public void EjecutarFuncion(){}
    public String MostrarSensor(){
        return "sensor";
    }
    public String MostrarEstado(){
        return estado;
    }
}
