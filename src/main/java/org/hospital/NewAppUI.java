package org.hospital;

import com.formdev.flatlaf.FlatDarculaLaf;

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

    public NewAppUI() {
        // Agregar opciones al JComboBox
        selectRobot.addItem("Robot Diagnóstico");
        selectRobot.addItem("Robot Cirujano");
        selectRobot.addItem("Robot Distribuidor");

        /**
         * Invoked when an action occurs.
         *
         * @param e the event to be processed
         */
        btnActivar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String robot = (String) selectRobot.getSelectedItem();
                textAreaInfoRobot.append(robot + " activado.\n");
            }
        });

        /**
         * Invoked when an action occurs.
         *
         * @param e the event to be processed
         */
        btnEjecutarFuncion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String robot = (String) selectRobot.getSelectedItem();
                String accion = "";

                switch (robot) {
                    case "Robot Diagnóstico":
                        accion = "Realizando análisis clínico y medición de temperatura.";
                        break;
                    case "Robot Cirujano":
                        accion = "Ejecutando cirugía asistida.";
                        break;
                    case "Robot Distribuidor":
                        accion = "Entregando medicamentos.";
                        break;
                }

                textAreaInfoRobot.append(robot + ": " + accion + "\n");
            }
        });

        /**
         * Invoked when an action occurs.
         *
         * @param e the event to be processed
         */
        btnDesactivar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String robot = (String) selectRobot.getSelectedItem();
                textAreaInfoRobot.append(robot + " desactivado.\n");
            }
        });

        /**
         * Invoked when an action occurs.
         *
         * @param e the event to be processed
         */
        btnMostrarSensor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String robot = (String) selectRobot.getSelectedItem();
                String sensorInfo = "";

                switch (robot) {
                    case "Robot Diagnóstico":
                        sensorInfo = "Temperatura: 36.5°C";
                        break;
                    case "Robot Cirujano":
                        sensorInfo = "Bisturí láser calibrado.";
                        break;
                    case "Robot Distribuidor":
                        sensorInfo = "Inventario de medicamentos: Completo.";
                        break;
                }

                textAreaInfoRobot.append(robot + " - Sensor: " + sensorInfo + "\n");
            }
        });
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("Gestión de Robots Médicos Inteligentes");
        frame.setContentPane(new NewAppUI().NewAppUIPanel);
        frame.setSize(500, 550);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
