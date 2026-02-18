import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PantallaSimple {

    public static void main(String[] args) {
        
        // Crear ventana
        JFrame ventana = new JFrame("Mi Primera Pantalla");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null); // Posiciones manuales
        
        // Crear botón
        JButton boton = new JButton("Haz clic aquí");
        boton.setBounds(120, 100, 150, 40); // (x, y, ancho, alto)
        
        // Evento del botón
        boton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "¡Botón presionado!");
        });
        
        // Agregar botón a la ventana
        ventana.add(boton);
        
        // Mostrar ventana
        ventana.setVisible(true);
    }
}
