
package View;

import java.util.Scanner;
import Controller.ControllerClientes;   // Controlador - La vista lo único que ve es el controlador


public final class  ViewPantallaCliente implements ILiterales {
    
    public static void MnuCliente(){
        
        int mnuOpcion = 0 ;
        
        System.out.println(mnuClienteOpcion1);
        System.out.println(mnuClienteOpcion2);
        System.out.println(mnuClienteOpcion3);
        System.out.println(mnuClienteOpcion4);
        System.out.println(mnuClienteOpcion5);
        System.out.println(mnuVolverMenuAnterior);
        System.out.println("");
        System.out.println(elegirOpcion);
       
        Scanner sc1 = new Scanner(System.in);
        mnuOpcion = sc1.nextInt();
        
        seleccionMenuCliente(mnuOpcion);
                       
    }

    private static void seleccionMenuCliente(int mnuOpcion) {

        if (mnuOpcion == 1) {
            ViewNuevoCliente();
        } else if (mnuOpcion == 2) {
             MnuCliente2();
        } else if (mnuOpcion == 3) {
            
        } else if (mnuOpcion == 4) {
            
        } else if (mnuOpcion == 5) {
            
        } else if (mnuOpcion == 9) {
            ViewPantallaPrincipal.MnuPrincipal();    
        } else {
            System.out.println("La opción ingresada no es correcta .... El programa se autodetruye.");           
            MnuCliente();
        }
    }    
    
    /**
     * Pantalla de Nuevo Cliente
     */
    private static void ViewNuevoCliente() {
        
        // Declaraciíon de variables 
        int DNI = 0;
        String apellido = "";
        String nombre = "";
        
        Scanner sc1 = new Scanner(System.in);
         
        
        System.out.println("DNI: ");
        DNI = sc1.nextInt();
        
        System.out.println("Apellido: ");
        apellido = sc1.next();
        
        System.out.println("Nombre: ");
        nombre = sc1.next(); 
        
        System.out.println(confirmacion);
        char aux = sc1.next().toUpperCase().charAt(0);
        
        if ('S' == aux ){
            //System.out.println("Datos almacenados");
            ControllerClientes control = new ControllerClientes();
            
            // Si negamos la consulta lo que sucede es que cuando vuelva con error se pida ingresar de nuevo todos los datos
            if (!control.SaveClientes(DNI, apellido, nombre)){
                ViewNuevoCliente();
            };
            MnuCliente();            
            
        } else {
            System.out.println("No se grabarán los datos");
        }
 
    }
    
    /**
     * Pantalla de Eliminar Cliente
     */
    //// eliminar cliente
    
    
    private static void MnuCliente2(){
        
        
        int mnuOpcion2 = 0 ;
        
        System.out.println(mnuEliminarCliente2Opcion1);
        System.out.println(mnuEliminarCliente2Opcion2);
        System.out.println(mnuVolverMenuAnterior);
        System.out.println("");
        System.out.println(elegirOpcion); 
        
        
        Scanner sc1 = new Scanner(System.in);
        mnuOpcion2 = sc1.nextInt();
        
       SeleccionEliminarCliente(mnuOpcion2);
    }
    
    
    private static void SeleccionEliminarCliente(int mnuOpcion2){
        if (mnuOpcion2 == 1){
            BuscarClientePorDNI();
        }else if (mnuOpcion2 == 2){
            BuscarClientePorApellido();
        }else if (mnuOpcion2 == 9) {
            ViewPantallaPrincipal.MnuPrincipal(); 
        }else{
            System.out.println("La opcion ingresada no es correcta");
            MnuCliente2();
        }    
            
       
        
        
    }
    
    private static void BuscarClientePorDNI(){
        
        
        int DNI=0;
        
        Scanner sc1=new Scanner(System.in);
        System.out.println("Ingrese el documento del Cliente");
        DNI = sc1.nextInt();
        
        
    }
    
    private static void BuscarClientePorApellido(){
        
        String a="";
        
        Scanner sc1=new Scanner(System.in);
        System.out.println("Ingrese el Apellido del Cliente");
        a = sc1.nextLine();
    }
}

