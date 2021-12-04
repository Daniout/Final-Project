
package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import vista.*;

public class VentanaAdministrador extends JFrame implements ActionListener{
    
    private JMenuBar barraMenu;
    private JMenu menu;
    private JMenuItem menuItemRegistroPaquete;
    
    public VentanaAdministrador(){
        this.setTitle("Ventana del Administrador");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.initComponents();
        this.setVisible(true);
    }
    
    public void initComponents(){
        this.barraMenu = new JMenuBar();
        this.setJMenuBar(this.barraMenu);
        
        this.menu = new JMenu("Registro");
        this.barraMenu.add(this.menu);
        
        /*
        this.menuItemRegistro = new JMenuItem("Registrar Venta");
        this.menuItemRegistro.addActionListener(this);
        this.menu.add(this.menuItemRegistro);
        */
        
        this.menuItemRegistroPaquete = new JMenuItem("Registrar Paquete");
        this.menuItemRegistroPaquete.addActionListener(this);
        this.menu.add(this.menuItemRegistroPaquete
        );
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==this.menuItemRegistroPaquete) {
            VentanaRegistroPaquete registropqt = new VentanaRegistroPaquete();
        }
    }
    
}
