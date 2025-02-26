package org.hospital;

import java.util.Date;

public class Cirujano {
    private String nombreCirujano;
    private Date fecha;
    public void CirujiaAsistida(){}
    public boolean Exitoso(){
        return true;
    }
    public String CirujanoAsignado(){
        return nombreCirujano;
    }

    class BypassCoronario extends Cirujano{
        private int numeroBypass;
        public boolean RealizarAnastomosis(){
            return true;
        }
    }

    class ReparacionDeValvulaMitral extends Cirujano{
        private float anchuraDeValvulaMitral;
        public void ReparacionDeValvulaMitral(){}
        public void ReparacionDeEstenosis(){}
    }

    class Tumorectomia extends Cirujano{
        private String tipo;
        private float tamaño;
        public void ExtraccionDeCancer(){}
    }
}
