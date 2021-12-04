
package datos;

import Personas.*;
import Paquete.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArchivoPaqueteTexto implements IArchivo{
    private File archivo;
    private FileWriter aEscritura;
    private Scanner aLectura;

    public ArchivoPaqueteTexto() {
        this.archivo = new File("Paquetes.dat");
    }
    
    public ArchivoPaqueteTexto(String name){
        this.archivo = new File(name);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public FileWriter getaEscritura() {
        return aEscritura;
    }

    public void setaEscritura(FileWriter aEscritura) {
        this.aEscritura = aEscritura;
    }

    public Scanner getaLectura() {
        return aLectura;
    }

    public void setaLectura(Scanner aLectura) {
        this.aLectura = aLectura;
    }
    
    public Paquete leerPaquete(String linea[]){
        Paquete p = new Paquete();
        Destinatario d = new Destinatario();
        Remitente r = new Remitente();
        Direccion dir = new Direccion();
        ZonadeEntrega z = new ZonadeEntrega();
        Pais ps = new Pais();
        Ciudad c = new Ciudad();
        Caja cj = new Caja();
        Sobre s = new Sobre();
        OtroPaquete op = new OtroPaquete();
        ObservacionesAdicionales oa = new ObservacionesAdicionales();
        
        p.setNumero_paquete(Integer.valueOf(linea[0]));
        p.setFecha_ingreso(linea[1]);
        p.setValor_declarado(Double.valueOf(linea[2]));
        p.setEstado_paquete(linea[3]);
    
        return p;
    }
    
    public Paquete eliminar(String cc) throws IOException{
        
        List<Paquete> listadoInicial = this.leer();
        ArchivoPaqueteTexto archivoAux = new ArchivoPaqueteTexto("ArchivoTmpF1.dat");
        Paquete eliminado = null;
        for(Paquete f: listadoInicial){
            if (cc.equals(f.getNumero_paquete())) {//elemento a eliminar
                eliminado = f;
            }else{
                archivoAux.escribir(f);
            }
        }
        
       
            if (this.archivo.delete()) {
                if (archivoAux.archivo.exists()) {
                    if (!archivoAux.archivo.renameTo(this.archivo)) {
                        throw  new IOException("El archivo temporal no pudo ser eliminado");
                         
                    }
                }else{
                    this.archivo.createNewFile();
                }
                
            }else {
                throw  new IOException("El archivo original no pudo ser eliminado");
            }
            
        
        return eliminado;
    }
    
    public Paquete buscar(String cc)throws IOException{
        Paquete buscado = null;
        try{ 
            this.aLectura = new Scanner(this.archivo);        
            while (this.aLectura.hasNext()) {
               String linea[] = this.aLectura.nextLine().split(";");
               Paquete c = this.leerPaquete(linea);
               if (cc.equals(c.getNumero_paquete())) {
                    buscado = c;
                    break;
                }
            }
            return buscado;
        
       }catch (FileNotFoundException ex){
           throw  new IOException("El archivo no se encuentra ");          
       }
       finally{
           if (this.aLectura!=null) {
               this.aLectura.close();
           }
       } 
    }
    
    public List<Paquete> leer() throws IOException{
        List<Paquete> list = null;
        
       try{ 
        this.aLectura = new Scanner(this.archivo);
        list = new ArrayList();
        
           while (this.aLectura.hasNext()) {
               String linea[] = this.aLectura.nextLine().split(";");
               Paquete c = this.leerPaquete(linea);
               list.add(c);
           }
           return list;
        
       }catch (FileNotFoundException ex){
           throw new IOException("El archivo no se encuentra ");
       }
       finally{
           if (this.aLectura!=null) {
               this.aLectura.close();
           }
       }
    }
    
    public boolean escribir(Paquete c) throws IOException{
      PrintWriter escritor = null;
      try{
           
        this.aEscritura = new FileWriter(this.archivo, true);
        escritor = new PrintWriter(this.aEscritura);
        escritor.println(c.getDatosFileText());
        return true;
        
       }catch(IOException ioe){
           throw new IOException("Error al abrir el archivo para escritura...");
           
       } 
       finally{
           if (escritor!=null)
               escritor.close();
           
           if (this.aEscritura!=null) {
                    this.aEscritura.close();
           }
       }
    }
}