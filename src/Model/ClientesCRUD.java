
package Model;

import java.util.ArrayList;
import java.util.List;


public class ClientesCRUD {
    
    private List<ClientesDatos> almacenCliente; 
    
    public ClientesCRUD(){
        this.almacenCliente = new ArrayList();;
    }
    
    public boolean AddClientes(ClientesDatos nuevoCliente) {
        this.almacenCliente.add(nuevoCliente);
        return true;
    }
    
   // DeleteCliente
    
    
   //
    
    
}
