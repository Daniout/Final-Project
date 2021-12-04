
package Personas;

public class Cliente extends Usuario{
    
    private String nombre_completo;
    private long telefono;

    public Cliente() {
    }

    public Cliente(String nombre_completo, long telefono, String nombre, String password) {
        super(nombre, password);
        this.nombre_completo = nombre_completo;
        this.telefono = telefono;
    }

    public Cliente(String nombre_completo, long telefono) {
        this.nombre_completo = nombre_completo;
        this.telefono = telefono;
    }

    

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
    
    
}
