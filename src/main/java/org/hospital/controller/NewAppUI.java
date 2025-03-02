package org.hospital.controller;

import com.formdev.flatlaf.FlatDarculaLaf;
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

    Diagnostico robotDiagnostico = new Diagnostico();
    Distribuidor robotDistribuidor = new Distribuidor();

    //upcasting
    Robot robotCirujano = new Cirujano();
    //Downcasting (de Robot a Cirujano)
    Cirujano cirujano = (Cirujano) robotCirujano;


    public NewAppUI() {
        // Deshabilitar los botones al inicio
        btnEjecutarFuncion.setEnabled(false);
        btnMostrarSensor.setEnabled(false);
        btnDesactivar.setEnabled(false);

        selectRobot.addItem("Robot Diagnóstico");
        selectRobot.addItem("Robot Cirujano");
        selectRobot.addItem("Robot Distribuidor");

        btnActivar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String robot = (String) selectRobot.getSelectedItem();
                String accion = "";

                switch (robot) {
                    case "Robot Diagnóstico":
                        accion = robotDiagnostico.Activar("Robot Diagnóstico");
                        break;
                    case "Robot Cirujano":
                        accion = robotCirujano.Activar("Robot Cirujano");
                        break;
                    case "Robot Distribuidor":
                        accion = robotDistribuidor.Activar("Robot Distribuidor");
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
                        accion = "Robot Cirujano desactivado.";
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
                        accion = cirujano.Desactivar("Robot Cirujano");
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
                        sensorInfo = "Bisturí láser calibrado.";
                        break;
                    case "Robot Distribuidor":
                        sensorInfo = robotDistribuidor.MostrarSensorProximidad();
                        break;
                }

                textAreaInfoRobot.append(robot + " - Sensor: " + sensorInfo + "\n");
            }
        });
    }

    public JPanel UIPanelExport() {
        return NewAppUIPanel;
    }


//    public static void main(String[] args) {
//        try {
//            UIManager.setLookAndFeel(new FlatDarculaLaf());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        JFrame frame = new JFrame("Gestión de Robots Médicos Inteligentes");
//        frame.setContentPane(new NewAppUI().NewAppUIPanel);
//        frame.setSize(500, 550);
//        frame.setLocationRelativeTo(null);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setResizable(false);
//        frame.setVisible(true);
//    }
}
