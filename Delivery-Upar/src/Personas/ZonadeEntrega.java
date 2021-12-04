
package Personas;

import java.util.Scanner;

public class ZonadeEntrega {
    
    private int codigo_postal;

    public ZonadeEntrega() {
    }

    public int getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(int codigo_postal) {
        this.codigo_postal = codigo_postal;
    }
    
    public void registrarZonaEntrega(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Codigo Postal: ");
        this.codigo_postal = sc.nextInt();
    }
            
    
}
