package org.hospital;


class BusinessLogicRobotDistribuidor{
    Distribuidor robotDistribuidor = new Distribuidor();

    public void EntregarMedicamento(){
        robotDistribuidor.EntregarMedicamento();
    }
    public void ActivarRobotDistribuidor(){
        robotDistribuidor.Activar();
    }
    public void DesactivarRobotDistribuidor(){
        robotDistribuidor.Desactivar();
    }
    public void MostrarSensorProximidad(){
        robotDistribuidor.MostrarSensorProximidad();
    }
}

class BusinessLogicRobotDiagnostico{
    Diagnostico robotDiagnostico = new Diagnostico();

    public void Analisisclinico(){
        robotDiagnostico.AnalisisClinico();
    }
    public void ActivarRobotDiagnostico(){
        robotDiagnostico.Activar();
    }
    public void DesactivarDistribuidor(){
        robotDiagnostico.Desactivar();
    }
    public void MostrarSensor(){
        robotDiagnostico.MostrarSensorTemperatura();
    }
}
class BusinessLogicRobotCirujanoBypassCoronario{

}

public class Main {
    public static void main(String[] args) {
        BusinessLogicRobotDiagnostico robot = new BusinessLogicRobotDiagnostico();
        robot.ActivarRobotDiagnostico();
        robot.MostrarSensor();
        robot.Analisisclinico();
        robot.DesactivarDistribuidor();

        BusinessLogicRobotDistribuidor r2 = new BusinessLogicRobotDistribuidor();
        r2.ActivarRobotDistribuidor();
        r2.MostrarSensorProximidad();
        r2.EntregarMedicamento();
        r2.DesactivarRobotDistribuidor();

    }
}