package org.hospital;

public class Robot {
    private int numeroDeSerie;

    public String Activar(String typeRobot) {
        return typeRobot + ": Activado";
    }

    public String Desactivar(String typeRobot) {
        return typeRobot + ": Desactivado";
    }

}
