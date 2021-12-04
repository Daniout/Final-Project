
package Paquete;

import Personas.*;
import java.io.Serializable;
import java.util.Scanner;

public class Paquete implements Serializable{
    private long numero_paquete;
    private String fecha_ingreso;
    private double valor_declarado;
    private String estado_paquete;
    
    private Sobre sobre;
    private Caja caja;
    private OtroPaquete otroPaquete;
    private ObservacionesAdicionales observacionesAdicionales;
    private Remitente remitente;
    private Destinatario destinatario;

    public Paquete() {
    }

    public Paquete(long numero_paquete, String fecha_ingreso, double valor_declarado, String estado_paquete, Sobre sobre, Caja caja, OtroPaquete otroPaquete, ObservacionesAdicionales observacionesAdicionales, Remitente remitente, Destinatario destinatario) {
        this.numero_paquete = numero_paquete;
        this.fecha_ingreso = fecha_ingreso;
        this.valor_declarado = valor_declarado;
        this.estado_paquete = estado_paquete;
        this.sobre = sobre;
        this.caja = caja;
        this.otroPaquete = otroPaquete;
        this.observacionesAdicionales = observacionesAdicionales;
        this.remitente = remitente;
        this.destinatario = destinatario;
    }
    
    public long getNumero_paquete() {
        return numero_paquete;
    }

    public void setNumero_paquete(long numero_paquete) {
        this.numero_paquete = numero_paquete;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public double getValor_declarado() {
        return valor_declarado;
    }

    public void setValor_declarado(double valor_declarado) {
        this.valor_declarado = valor_declarado;
    }

    public String getEstado_paquete() {
        return estado_paquete;
    }

    public void setEstado_paquete(String estado_paquete) {
        this.estado_paquete = estado_paquete;
    }

    public Sobre getSobre() {
        return sobre;
    }

    public void setSobre(Sobre sobre) {
        this.sobre = sobre;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    public OtroPaquete getOtroPaquete() {
        return otroPaquete;
    }

    public void setOtroPaquete(OtroPaquete otroPaquete) {
        this.otroPaquete = otroPaquete;
    }

    public ObservacionesAdicionales getObservacionesAdicionales() {
        return observacionesAdicionales;
    }

    public void setObservacionesAdicionales(ObservacionesAdicionales observacionesAdicionales) {
        this.observacionesAdicionales = observacionesAdicionales;
    }

    public Remitente getRemitente() {
        return remitente;
    }

    public void setRemitente(Remitente remitente) {
        this.remitente = remitente;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Destinatario destinatario) {
        this.destinatario = destinatario;
    }
    
    public String getDatosFileText(){
        return  this.numero_paquete+";"+//paquete
                this.fecha_ingreso+";"+
                destinatario.getNombre_completo()+";"+//Destinatario
                destinatario.getDireccion().getCalle_o_carrera()+";"+
                destinatario.getDireccion().getNumero_vivienda()+";"+
                destinatario.getCodigo_postal()+";"+
                destinatario.getTelefono()+";"+
                remitente.getNombre_completo()+";"+
                remitente.getDireccion().getCalle_o_carrera()+";"+//remitente
                remitente.getDireccion().getNumero_vivienda()+";"+
                remitente.getPais()+";"+
                remitente.getCiudad()+";"+
                remitente.getTelefono()+";"+
                sobre.getPeso()+";"+
                caja.getLargo()+";"+
                caja.getAncho()+";"+
                caja.getAlto()+";"+
                otroPaquete.getDescripcion()+";"+
                this.valor_declarado+";"+
                observacionesAdicionales.getFecha_limite_entrega()+";"+
                observacionesAdicionales.getObservaciones()+";";
    }
    
}
