package org.hospital;


import com.formdev.flatlaf.FlatDarculaLaf;
import org.hospital.controller.NewAppUI;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Gestión de Robots Médicos Inteligentes");
            frame.setContentPane(new NewAppUI().UIPanelExport());
            frame.setSize(500, 600);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setVisible(true);
        });
    }
}