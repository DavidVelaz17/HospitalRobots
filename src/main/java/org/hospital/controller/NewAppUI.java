package org.hospital.controller;

import org.hospital.model.Cirujano;
import org.hospital.model.Diagnostico;
import org.hospital.model.Distribuidor;
import org.hospital.model.Robot;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewAppUI {
    private JPanel NewAppUIPanel;
    private JComboBox<String> selectRobot;
    private JButton btnActivar;
    private JButton btnEjecutarFuncion;
    private JButton btnDesactivar;
    private JButton btnMostrarSensor;
    private JTextArea textAreaInfoRobot;
    private JComboBox accionesByCirujano;

    //Instancias
    Diagnostico robotDiagnostico = new Diagnostico();
    Distribuidor robotDistribuidor = new Distribuidor();

    //upcasting
    Robot robotCirujano = new Cirujano();
    //Downcasting (de Robot a Cirujano)
    Cirujano cirujano = (Cirujano) robotCirujano;

    // También podemos instanciar subclases del robot Cirujano
    Cirujano bypass = cirujano.new BypassCoronario(),
            tumorectomia = cirujano.new Tumorectomia(),
            valvulaMitral = cirujano.new ReparacionDeValvulaMitral();


    public NewAppUI() {
        // Deshabilitar los botones al inicio
        btnEjecutarFuncion.setEnabled(false);
        btnMostrarSensor.setEnabled(false);
        btnDesactivar.setEnabled(false);
        accionesByCirujano.setVisible(false);

        selectRobot.addItem("Robot Diagnóstico");
        selectRobot.addItem("Robot Cirujano");
        selectRobot.addItem("Robot Distribuidor");

        accionesByCirujano.addItem("Realizar Anastomosis");
        accionesByCirujano.addItem("Reparación De Valvula Mitral");
        accionesByCirujano.addItem("Reparacion De Estenosis");
        accionesByCirujano.addItem("Extracción De Cancer");


        btnActivar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String robot = (String) selectRobot.getSelectedItem();
                String accion = "";

                switch (robot) {
                    case "Robot Diagnóstico":
                        accion = robotDiagnostico.Activar("Robot Diagnóstico Num. " + robotDiagnostico.getNumeroDeSerie());
                        break;
                    case "Robot Cirujano":
                        accion = robotCirujano.Activar("Robot Cirujano Num. " + robotCirujano.getNumeroDeSerie());
                        break;
                    case "Robot Distribuidor":
                        accion = robotDistribuidor.Activar("Robot Distribuidor Num. " + robotDistribuidor.getNumeroDeSerie());
                        break;
                }
                textAreaInfoRobot.append(accion + "\n");

                // Habilitar botones de función y desactivar el de activar
                btnEjecutarFuncion.setEnabled(true);
                btnMostrarSensor.setEnabled(true);
                btnDesactivar.setEnabled(true);
                btnActivar.setEnabled(false);
            }
        });

        btnDesactivar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String robot = (String) selectRobot.getSelectedItem();
                String accion = "";

                switch (robot) {
                    case "Robot Diagnóstico":
                        accion = robotDiagnostico.Desactivar("Robot Diagnóstico");
                        break;
                    case "Robot Cirujano":
                        accion = cirujano.Desactivar("Robot Cirujano");
                        break;
                    case "Robot Distribuidor":
                        accion = robotDistribuidor.Desactivar("Robot Distribuidor");
                        break;
                }
                textAreaInfoRobot.append(accion + "\n");

                // Deshabilitar botones de función y habilitar el de activar
                btnEjecutarFuncion.setEnabled(false);
                btnMostrarSensor.setEnabled(false);
                btnDesactivar.setEnabled(false);
                btnActivar.setEnabled(true);
            }
        });

        btnEjecutarFuncion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String robot = (String) selectRobot.getSelectedItem();
                String accion = "";

                switch (robot) {
                    case "Robot Diagnóstico":
                        accion = robotDiagnostico.AnalisisClinico();
                        break;
                    case "Robot Cirujano":
                        accionesByCirujano.setVisible(true);

                        accion = cirujano.CirugiaAsistida();

                        break;
                    case "Robot Distribuidor":
                        accion = robotDistribuidor.EntregarMedicamento();
                        break;
                }

                textAreaInfoRobot.append(robot + ": " + accion + "\n");
            }
        });

        btnMostrarSensor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String robot = (String) selectRobot.getSelectedItem();
                String sensorInfo = "";

                switch (robot) {
                    case "Robot Diagnóstico":
                        sensorInfo = robotDiagnostico.MostrarSensorTemperatura();
                        break;
                    case "Robot Cirujano":
                        sensorInfo = cirujano.MostrarSensorOxigeno();
                        break;
                    case "Robot Distribuidor":
                        sensorInfo = robotDistribuidor.MostrarSensorProximidad();
                        break;
                }

                textAreaInfoRobot.append(robot + " - Sensor: " + sensorInfo + "\n");
            }
        });

        selectRobot.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                accionesByCirujano.setVisible(false);
                btnEjecutarFuncion.setEnabled(false);
                btnMostrarSensor.setEnabled(false);
                btnDesactivar.setEnabled(false);
                btnActivar.setEnabled(true);

            }
        });


        accionesByCirujano.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                String acciones = (String) accionesByCirujano.getSelectedItem();
                String mostrarAcciones = "";

                //Las siguientes líneas realizan downcasting explícito de las instancias de las
                // clases internas y luego llaman a sus métodos específicos:
                Cirujano.BypassCoronario bypassCoronario = (Cirujano.BypassCoronario) bypass;
                Cirujano.ReparacionDeValvulaMitral repacion = (Cirujano.ReparacionDeValvulaMitral) valvulaMitral;
                Cirujano.Tumorectomia tumorectomia1 = (Cirujano.Tumorectomia) tumorectomia;


                switch (acciones) {
                    case "Realizar Anastomosis":

                        mostrarAcciones = bypassCoronario.RealizarAnastomosis();
                        break;
                    case "Reparación De Valvula Mitral":
                        mostrarAcciones = repacion.ReparacionDeValvulaMitral();
                        break;
                    case "Reparacion De Estenosis":
                        mostrarAcciones = repacion.ReparacionDeEstenosis();
                        break;
                    case "Extracción De Cancer":
                        mostrarAcciones = tumorectomia1.ExtraccionDeCancer();
                        break;
                }

                textAreaInfoRobot.append(mostrarAcciones + "\n");
            }
        });
    }

    public JPanel UIPanelExport() {
        return NewAppUIPanel;
    }
}
