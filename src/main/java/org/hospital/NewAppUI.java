package org.hospital;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

import javax.swing.*;

public class NewAppUI {
    private JPanel NewAppUIPanel;
    private JComboBox comboBox1;
    private JButton activarButton;
    private JButton ejecutarFuncionButton;
    private JButton desactivarButton;
    private JButton mostrarSensorButton;
    private JTextArea textArea1;

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
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
