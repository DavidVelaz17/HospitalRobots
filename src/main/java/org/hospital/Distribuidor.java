package org.hospital;

public class Distribuidor extends Robot{
    private SensorProximidad sensorProximidad = new SensorProximidad();
    private String medicamento;

    public void EntregarMedicamento(){
        int posicion = sensorProximidad.ReportarPosicion();
        if(posicion == 10){
            Entregado();
        }else{
            System.out.println("Entrega fallida");
        }
    }
    public boolean Entregado(){
        medicamento = "Penicilina";
        System.out.println("Se entregó exitosamente: " + medicamento);
        return true;
    }
    public void MostrarSensorProximidad(){
        sensorProximidad.IniciarCalibracion();
        sensorProximidad.FinalizarCalibracion();
        System.out.println(sensorProximidad.ReportarPosicion());
    }

}
