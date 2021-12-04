
package Paquete;

public class Caja extends Sobre{
    private int largo;
    private int ancho;
    private int alto;

    public Caja() {
    }

    public Caja(int largo, int ancho, int alto) {
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
    }
    
    
    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    
}
