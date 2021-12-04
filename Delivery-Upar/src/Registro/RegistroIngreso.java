
package Registro;

import Paquete.*;
import Personas.*;
import java.util.Scanner;

public class RegistroIngreso {
    
    public RegistroIngreso() {
    }
    
    public String imprimirNumeroPaquete(){
        String nps="";
        int contador=1;
        
        String num_paquete_string = String.valueOf(contador);
        int limitenumeropaquete =10;
        int residuo=limitenumeropaquete-num_paquete_string.length();
        for (int i = 0; i <residuo ; i++) {
            System.out.print("0"); 
        }
        System.out.print(""+contador);
        
        return nps;
       
    }
    
    public void formulario(){
        
        Scanner sc1 = new Scanner(System.in);
        Scanner scd = new Scanner(System.in);
        Scanner stc = new Scanner(System.in);
        Scanner sco = new Scanner(System.in);
        
        Paquete p1 = new Paquete();
        Destinatario d1 = new Destinatario();
        ZonadeEntrega z1 = new ZonadeEntrega();
        Direccion dir1 = new Direccion();
        Sobre s1 = new Sobre();
        Caja cj1 = new Caja();
        OtroPaquete o1 = new OtroPaquete();
        ObservacionesAdicionales oa1 = new ObservacionesAdicionales();
        
        System.out.println("*****FORMATO REGISTRO DE PAQUETERÍA");
        System.out.print("Numero de Paquete "); p1.setNumero_paquete(sc1.nextLong());
        System.out.print("Fecha de Ingreso: "); p1.setFecha_ingreso(sc1.next());
        System.out.println("-DATOS DEL DESTINATARIO-");
        System.out.print("Nombre completo: "); d1.setNombre_completo(scd.nextLine());
        System.out.println("Dirección");
        System.out.print("Calle/Carrera: "); dir1.setCalle_o_carrera(scd.nextLine()); 
        System.out.print("N° de vivienda: "); dir1.setNumero_vivienda(scd.nextLine()); 
        System.out.print("Código Postal: "); z1.setCodigo_postal(scd.nextInt());
        System.out.print("Teléfono: "); d1.setTelefono(scd.nextLong());
       
        System.out.println("-DATOS DEL PAQUETE-");
        swTipoPaquete(p1, s1, cj1, scd, o1, stc);
        System.out.print("Valor declarado: "); p1.setValor_declarado(stc.nextDouble());
        
        System.out.println("-OBSERVACIONES AD");
        System.out.print("Fecha Limite entrega: "); oa1.setFecha_limite_entrega(sco.nextLine());
        System.out.println("Observaciones: "); oa1.setObservaciones(sco.nextLine());
        
    }
    
    public void swTipoPaquete( Paquete p1, Sobre s1, Caja cj1, Scanner sw, OtroPaquete o1, Scanner stc){
        
        boolean esExcepcion = true;
        
        do {
            
            try {
         
            System.out.println("\n-Datos del Paquete-");
            System.out.println("*********************");
            System.out.println("* ¿Tipo de Paquete? *");
            System.out.println("*********************");
            System.out.println("* 1. Sobre          *");
            System.out.println("* 2. Caja           *");
            System.out.println("* 3. Otro           *");
            System.out.println("*********************");
            
            int op = stc.nextInt();
      
            switch (op) {
                case 1:
                    System.out.print("Peso del sobre (Ejemplo: 4,4): "); s1.setPeso(sw.nextInt());
                    p1.setSobre(s1);
                    break;
                case 2:
                    System.out.print("Peso de la Caja: "); cj1.setPeso(sw.nextInt());
                    System.out.print("Altura de la Caja: "); cj1.setAlto(sw.nextInt());
                    System.out.print("Ancho de la Caja: "); cj1.setAncho(sw.nextInt());
                    System.out.print("Largo de la Caja: "); cj1.setLargo(sw.nextInt());
                    p1.setCaja(cj1);
                    break;
                case 3:
                    System.out.print("Descripción: "); o1.setDescripcion(sw.nextLine()); p1.setOtroPaquete(o1);
                    break;
                default:
                    System.err.println("\tEscoja una de las dos opciones validas");
                    stc.nextLine();
                    swTipoPaquete(p1, s1, cj1, sw, o1, stc);
                ;
            }
            
            esExcepcion = false;
            
        } catch (java.util.InputMismatchException ime) {
            System.err.println("\tIngrese valores numéricos");
            stc.nextLine();
        }
            
        } while (esExcepcion);
        
    }
    
    
}
