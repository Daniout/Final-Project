
package datos;

import Paquete.*;
import java.io.IOException;
import java.util.List;

public interface IArchivo {
    
    public Paquete eliminar(String codigoTienda) throws IOException;
    public Paquete buscar(String codigoTienda) throws IOException;
    public boolean escribir(Paquete codigoTienda) throws IOException;    
    public List<Paquete> leer() throws IOException;
}
