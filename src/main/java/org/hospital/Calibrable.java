package org.hospital;

public interface Calibrable { //Interfaz funcional
    public void IniciarCalibracion(); //Metodo abstracto
    default public void FinalizarCalibracion(){
        System.out.println("Calibración finalizada");
    }
}
