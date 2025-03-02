package org.hospital;


class BusinessLogicRobotDistribuidor{
    Distribuidor robotDistribuidor = new Distribuidor();

    public void EntregarMedicamento(){
        System.out.println(robotDistribuidor.EntregarMedicamento());
        robotDistribuidor.EntregarMedicamento();
    }
    public void ActivarRobotDistribuidor(){
        System.out.println(robotDistribuidor.Activar("Distribuidor"));
        robotDistribuidor.Activar("Distribuidor");
    }
    public void DesactivarRobotDistribuidor(){
        System.out.println(robotDistribuidor.Desactivar("Distribuidor"));
        robotDistribuidor.Desactivar("Distribuidor");
    }
    public void MostrarSensorProximidad(){
        System.out.println("Proximidad: "+robotDistribuidor.MostrarSensorProximidad()+" cm");
        robotDistribuidor.MostrarSensorProximidad();
    }
}

class BusinessLogicRobotDiagnostico{
    Diagnostico robotDiagnostico = new Diagnostico();

    public void Analisisclinico(){
        robotDiagnostico.AnalisisClinico();
    }
    public void ActivarRobotDiagnostico(){
        robotDiagnostico.Activar("Diagnostico");
    }
    public void DesactivarDistribuidor(){
        robotDiagnostico.Desactivar("Distribuidor");
    }
    public void MostrarSensor(){
        robotDiagnostico.MostrarSensorTemperatura();
    }
}
class BusinessLogicRobotCirujanoBypassCoronario{
    //TODO Realizar upcasting y downcasting
    //TODO verificar los tipos de sub clases para upcasting y downcasting
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