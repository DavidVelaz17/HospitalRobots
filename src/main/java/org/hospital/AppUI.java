package org.hospital;

import javax.swing.*;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

public class AppUI {
    private JPanel AppUIPanel;
    private JComboBox comboBoxSelectRobot;
    private JButton ejecutarFuncionButton;
    private JButton activarButton;
    private JButton desactivarButton;
    private JButton mostrarSensorButton;

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("Gestión de Robots Médicos Inteligentes");
        frame.setContentPane(new AppUI().AppUIPanel);
        frame.setSize(550, 450);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
