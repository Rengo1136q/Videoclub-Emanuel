package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClientesCRUD {

    private static ClientesCRUD instance;
    private List<ClientesDatos> almacenCliente;

    /**
     * singleton de la lista
     */
    private ClientesCRUD() {
        this.almacenCliente = new ArrayList();;
    }

    public static ClientesCRUD getInstance() {
        if (instance == null) {
            instance = new ClientesCRUD();
        } else {
            //   System.out.println("El objeto ya existe");

        }
        return instance;
    }

    public boolean AddClientes(ClientesDatos nuevoCliente) {
        this.almacenCliente.add(nuevoCliente);
        return true;
    }

    public List<ClientesDatos> SearchClient() {
        return this.almacenCliente;
    }

    public int SearchClient(int DNI) {
        int i;
        int result = -1;
        for (i = 0; i < this.almacenCliente.size(); i++) {
            if (this.almacenCliente.get(i).getDNI() == DNI) {
                result = this.almacenCliente.indexOf(this.almacenCliente.get(i));
            }
        }
        return result;
    }

    public List<ClientesDatos> SearchClient(String apellido) {
        List<ClientesDatos> listaClientes = new ArrayList();
        int i;

        for (i = 0; i <= this.almacenCliente.size(); i++) {

            if (this.almacenCliente.get(i).getApellido() == apellido) {
                listaClientes.add(this.almacenCliente.get(i));
            }
        }
        return listaClientes;
    }

    /*
    Metodo para eliminar cliente
     */
    public void removeClient(int posicion) {
        this.almacenCliente.remove(posicion);
    }

    //metodo para editar cliente en el dni (terminar)
    public void modifClient(int posicion) {

    }

}
