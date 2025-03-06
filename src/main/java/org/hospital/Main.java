package org.hospital;

import com.formdev.flatlaf.FlatDarculaLaf;
import org.hospital.controller.NewAppUI;

import javax.swing.*;

/**
 * La clase principal que inicia la aplicación de gestión de robots médicos inteligentes.
 * <p>
 * Este es el punto de entrada de la aplicación. Configura la apariencia de la interfaz de usuario utilizando
 * el Look and Feel "FlatDarculaLaf", luego crea y muestra la ventana principal de la aplicación con un panel de
 * interfaz de usuario proporcionado por la clase {@link NewAppUI}.
 *  @author [Cristofer A. Hernandez y David Gustavo Lara]
 *  @version 1.
 * </p>
 */
public class Main {
    /**
     * El punto de entrada principal de la aplicación.
     * <p>
     * Establece el Look and Feel de la interfaz gráfica a {@link FlatDarculaLaf}, luego inicia la interfaz gráfica
     * de la aplicación en un hilo de eventos de Swing. Crea una ventana con un panel exportado desde {@link NewAppUI}
     * y la muestra al usuario.
     * </p>
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
            frame.setSize(500, 600);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setVisible(true);
        });
    }
}