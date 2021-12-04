
package vista;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaEmergente {
    
    public static void mostrarMensaje(JFrame hijo, String titulo, String contenido, int icono){
        JOptionPane.showMessageDialog(hijo,contenido,titulo, icono);
    }
    
}
