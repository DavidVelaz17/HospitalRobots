package org.hospital;

public interface Calibrable { //Interfaz funcional
    public String IniciarCalibracion(); //Metodo abstracto
    default public String FinalizarCalibracion(){
        return "Calibración finalizada";
    }
}
