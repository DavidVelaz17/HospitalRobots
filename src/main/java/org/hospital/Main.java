package org.hospital;


import com.formdev.flatlaf.FlatDarculaLaf;
import org.hospital.controller.NewAppUI;
import org.hospital.model.Cirujano;
import org.hospital.model.Diagnostico;
import org.hospital.model.Distribuidor;
import org.hospital.model.Robot;

import javax.swing.*;

class BusinessLogicRobotDistribuidor {
    Distribuidor robotDistribuidor = new Distribuidor();

    public void EntregarMedicamento() {
        System.out.println(robotDistribuidor.EntregarMedicamento());
        robotDistribuidor.EntregarMedicamento();
    }

    public void ActivarRobotDistribuidor() {
        System.out.println(robotDistribuidor.Activar("Distribuidor"));
        robotDistribuidor.Activar("Distribuidor");
    }

    public void DesactivarRobotDistribuidor() {
        System.out.println(robotDistribuidor.Desactivar("Distribuidor"));
        robotDistribuidor.Desactivar("Distribuidor");
    }

    public void MostrarSensorProximidad() {
        System.out.println("Proximidad: " + robotDistribuidor.MostrarSensorProximidad() + " cm");
        robotDistribuidor.MostrarSensorProximidad();
    }
}

class BusinessLogicRobotDiagnostico {
    Diagnostico robotDiagnostico = new Diagnostico();

    public void Analisisclinico() {
        System.out.println(robotDiagnostico.AnalisisClinico());
    }

    public void ActivarRobotDiagnostico() {
        System.out.println(robotDiagnostico.Activar("Diagnostico"));

    }

    public void DesactivarDistribuidor() {
        System.out.println(robotDiagnostico.Desactivar("Distribuidor"));

    }

    public void MostrarSensor() {
        System.out.println(robotDiagnostico.MostrarSensorTemperatura());

    }
}

class BusinessLogicRobotCirujanoBypassCoronario {
    //TODO Realizar upcasting y downcasting
    //TODO verificar los tipos de sub clases para upcasting y downcasting

    void Prueba() {
        Robot robotCirujano = new Cirujano();
        // Verificamos si el objeto es una instancia de Cirujano antes de hacer downcasting
        if (robotCirujano instanceof Cirujano) {
            // 🔹 Downcasting (de Robot a Cirujano)
            Cirujano cirujano = (Cirujano) robotCirujano;

            // Ahora podemos acceder a los métodos de Cirujano
            cirujano.CirugiaAsistida();
            robotCirujano.Activar("");

            // También podemos instanciar subclases del robot Cirujano
            Cirujano bypass = cirujano.new BypassCoronario(),
                    tumorectomia = cirujano.new Tumorectomia(),
                    valvulaMitral = cirujano.new ReparacionDeValvulaMitral();


            //Las siguientes líneas realizan downcasting explícito de las instancias de las
            // clases internas y luego llaman a sus métodos específicos:
            Cirujano.BypassCoronario bypassCoronario = (Cirujano.BypassCoronario) bypass;
            bypassCoronario.RealizarAnastomosis();

            Cirujano.Tumorectomia tumorectomia1 = (Cirujano.Tumorectomia) tumorectomia;
            tumorectomia1.ExtraccionDeCancer();

            Cirujano.ReparacionDeValvulaMitral repacion = (Cirujano.ReparacionDeValvulaMitral) valvulaMitral;
            repacion.ReparacionDeEstenosis();
            repacion.ReparacionDeValvulaMitral();

        }
    }
}


public class Main {
    /*
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


        Cirujano.BypassCoronario bypassCoronario = new Cirujano().new BypassCoronario();
        bypassCoronario.Activar();
        bypassCoronario.RealizarAnastomosis();
        bypassCoronario.CirugiaAsistida();
        bypassCoronario.Desactivar();

        BusinessLogicRobotCirujanoBypassCoronario objTest = new BusinessLogicRobotCirujanoBypassCoronario();
        objTest.Prueba();


    }

     */

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Gestión de Robots Médicos Inteligentes");
            frame.setContentPane(new NewAppUI().UIPanelExport());
            frame.setSize(500, 550);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setVisible(true);
        });
    }
}