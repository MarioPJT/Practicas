import javax.swing.*;
import java.awt.*;

public class PantallaModerna {

    public static void main(String[] args) {

        try {
            // Activar Look and Feel moderno
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Crear ventana
        JFrame ventana = new JFrame("Pantalla Moderna");
        ventana.setSize(450, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null); // Centrar ventana
        ventana.setLayout(new BorderLayout());

        // Panel principal con color moderno
        JPanel panel = new JPanel();
        panel.setBackground(new Color(30, 30, 30)); // Fondo oscuro
        panel.setLayout(new GridBagLayout());

        // Botón moderno
        JButton boton = new JButton("Presióname");
        boton.setFont(new Font("Segoe UI", Font.BOLD, 16));
        boton.setBackground(new Color(0, 120, 215));
        boton.setForeground(Color.WHITE);
        boton.setFocusPainted(false);
        boton.setBorder(BorderFactory.createEmptyBorder(10, 25, 10, 25));

        boton.addActionListener(e ->
                JOptionPane.showMessageDialog(ventana, "🚀 Botón ")
        );

        panel.add(boton);
        ventana.add(panel);

        ventana.setVisible(true);
    }
}
