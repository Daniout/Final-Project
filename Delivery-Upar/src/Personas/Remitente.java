
package Personas;

import java.util.Scanner;

public class Remitente extends Cliente{
    
    private Pais pais;
    private Ciudad ciudad;
    private Direccion direccion;

    public Remitente() {
    }

    public Remitente(Pais pais, Ciudad ciudad, Direccion direccion, String nombre_completo, long telefono) {
        super(nombre_completo, telefono);
        this.pais = pais;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
}
