
package Controller;

// importamos los paquetes del modelo
import Model.ClientesCRUD;
import Model.ClientesDatos;  
import java.util.InputMismatchException;


public class ControllerClientes {
    
    //Crear constructor si es necesario instanciar el objeto
    
    public ControllerClientes(){
        
    }
    
    public boolean SaveClientes(int DNI, String apellido, String nombre){
              
        boolean isSaved;
        
        try {           
            // llamar a un metodo del modelo que nos genere el objeto Cliente
            ClientesDatos nuevoCliente = new ClientesDatos(DNI, apellido, nombre);       
            
            // llamar a otro método del modelo que nos guarde en una lista de clientes
            ClientesCRUD listaDeCientes = new ClientesCRUD();
            isSaved = listaDeCientes.AddClientes(nuevoCliente);
            
        } catch (InputMismatchException e ){
            System.out.println("Hubo un error con los datos del dni del cliente");    
            isSaved = false;
        }; 
        
        return isSaved;
        
    }
    
    // BuscarCliente por dni
     public int DeletClientes(int DNI){
         
         
         
        return DNI;
    }
    
        
    // BuscarCliente por apellido
    
        
   
    // DeleteCliente
    
}
