package ar.com.codo24100.web.controllers;

import java.util.ArrayList;

import ar.com.codo24100.web.domain.Clientes;
import ar.com.codo24100.web.service.ClientesService;

public class ListarClientesController {

    public static void main(String[] args) {
        //crear service
        ClientesService service = new ClientesService();

        //invocar metodo listarClientes > lista
        ArrayList<Clientes> clientes = service.listarClientes();

        //mostrar por consola|enviar al frontend
        System.out.println(clientes);
    }

}
