/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

public class Direccion {

    private String calle_o_carrera;
    private String numero_vivienda;

    public Direccion() {
    }
    
    public Direccion(String calle_o_carrera, String numero_vivienda) {
        this.calle_o_carrera = calle_o_carrera;
        this.numero_vivienda = numero_vivienda;
    }

    public String getCalle_o_carrera() {
        return calle_o_carrera;
    }

    public void setCalle_o_carrera(String calle_o_carrera) {
        this.calle_o_carrera = calle_o_carrera;
    }

    public String getNumero_vivienda() {
        return numero_vivienda;
    }

    public void setNumero_vivienda(String numero_vivienda) {
        this.numero_vivienda = numero_vivienda;
    }
    
    @Override
    public String toString(){
        return "Calle: "+calle_o_carrera+"\n"
               +"N° de vivienda: "+numero_vivienda+"\n";
    }
    
    
}
