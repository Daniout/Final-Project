
package Personas;

public class Destinatario extends Cliente{
    
    private ZonadeEntrega zonadeEntrega;
    private Direccion direccion;

    public Destinatario() {
    }
    
    public Destinatario(ZonadeEntrega zonadeEntrega, Direccion direccion) {
        this.zonadeEntrega = zonadeEntrega;
        this.direccion = direccion;
    }

    public Destinatario(ZonadeEntrega zonadeEntrega, Direccion direccion, String nombre_completo, long telefono) {
        super(nombre_completo, telefono);
        this.zonadeEntrega = zonadeEntrega;
        this.direccion = direccion;
    }

    public ZonadeEntrega getCodigo_postal() {
        return zonadeEntrega;
    }

    public void setCodigo_postal(ZonadeEntrega codigo_postal) {
        this.zonadeEntrega = codigo_postal;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }      
    
}
