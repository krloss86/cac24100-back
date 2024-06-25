package ar.com.codo24100.web.controllers;

import ar.com.codo24100.web.domain.Clientes;
import ar.com.codo24100.web.service.ClientesService;

public class ObtenerClientesController {
    //?id=1&otroX=valor....

    //doGet
    public static void main(String[] args) {

        //quiero obtener un cliente de la base de datos con id=1
        Long id = 1l;//recibo desde el request que mando algun frontend

        ClientesService service = new ClientesService();

        Clientes cliente = service.obtenerClientePorID(id);

        System.out.println(cliente);
    }
}
