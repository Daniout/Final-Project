
package vista;

import Paquete.*;
import Personas.*;
import Registro.*;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws AWTException, InterruptedException {        
       
        VentanaAdministrador ventanaAdmin = new VentanaAdministrador();
        
        /*
        System.out.println("*****************************************");
        System.out.println("**************DELIVERY UPAR**************");
        System.out.println("*****************************************");
        System.out.println("");
        usuario();
        */
    }
    
    /*
    public static void limpiarConsola() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_L);
    }*/
    
    public static void usuario() throws AWTException, InterruptedException{
        
        Admistrador a1 = new Admistrador();
        
        Scanner sc = new Scanner(System.in);
        
                System.out.println("");
                System.out.println("************LOGIN***********");
                System.out.print("Usuario: ");
                String nu = sc.next();
                System.out.print("Contraseña: ");
                String pass = sc.next();
                
                if (nu.equals(a1.getNombre()) && pass.equals(a1.getPassword())) {
                    System.out.println("¡Bienvenido Admin Daniel!\n\n");     
                    Registro();          
                }else{
                    System.err.println("Porfavor verifique los datos ingresados\n\n");
                    Thread.sleep(1000);
                    usuario();
                }            
    }
    
    public static void Registro() throws AWTException, InterruptedException{
                    Scanner sc = new Scanner(System.in);
                    
                    boolean conExcepcion = true;
                    do{
                        try {
                        
                            System.out.println("");
                            System.out.println("*****************************");
                            System.out.println("* OPCIONES DE ADMINISTRADOR *");
                            System.out.println("*****************************");
                            System.out.println("* 1. Registrar Paquete      *");
                            System.out.println("* 2. Cerrar Sesion          *");
                            System.out.println("*****************************");
                            System.out.print("Elija una opcion: ");
                            System.out.println("");
                        
                            int op = sc.nextInt();     
                        
                            if (op<=0) {
                                sc.nextLine();
                                System.err.println("\tOpcion fuera de rango");
                                System.err.println("\tElije una opción valida");
                                Registro();
                            }else if (op==2) {
                                        switchRegistro(op);
                                    }else if (op==1) {
                                                switchRegistro(op);
                                            }else{
                                                sc.nextLine();
                                                System.err.println("\tOpcion fuera de rango");
                                                System.err.println("\tElije una opción valida");
                                                Registro();
                                            }
                        
                            conExcepcion = false;
                        
                        } catch (java.util.InputMismatchException ime ) {
                            sc.nextLine();
                            System.err.println("\tIngrese solo números enteros");
                        }
                    }while(conExcepcion);
    }
    
    public static void switchRegistro(int op) throws AWTException, InterruptedException{
        switch (op) {
            case 1:
                RegistroIngreso r = new RegistroIngreso();
                r.formulario();     
                break;
            case 2:   
                usuario();
                break;
            default:
                System.out.println("valor fuera de rango");
                ;
        }
    }
    
}
