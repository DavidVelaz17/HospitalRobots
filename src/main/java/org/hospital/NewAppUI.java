package org.hospital;

import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;

public class NewAppUI {
    private JPanel NewAppUIPanel;
    private JComboBox selectRobot;
    private JButton btnActivar;
    private JButton btnEjecutarFuncion;
    private JButton btnDesactivar;
    private JButton btnMostrarSensor;
    private JTextArea textAreaInfoRobot;

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
