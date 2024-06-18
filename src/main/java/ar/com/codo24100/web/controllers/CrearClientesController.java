package ar.com.codo24100.web.controllers;

import ar.com.codo24100.web.domain.Clientes;
import ar.com.codo24100.web.dto.ClientesDTO;
import ar.com.codo24100.web.service.ClientesService;

public class CrearClientesController {

    
    public static void main(String[] args) {

        //quiero obtener un cliente de la base de datos con id=1
        //Long id = 1l;//recibo desde el request que mando algun frontend
        String nombre ="juan";
        String apellido = "perez";
        String email = "email@email.com";
        String imagen = "/img/bla.jpg";
        Long tipoClienteId = 1l; 

        if(nombre == null || nombre.isBlank()) {
            //aca hay un error!
            return;
        }
        //agregar validaciones: TPH

        ClientesService service = new ClientesService();

        //crar el DTO
        ClientesDTO dto = new ClientesDTO(nombre, apellido, email,imagen, tipoClienteId);
        service.crearCliente(dto);

        ///fin!
    }
}
