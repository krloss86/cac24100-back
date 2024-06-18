package ar.com.codo24100.web.controllers;

import ar.com.codo24100.web.dto.ClientesDTO;
import ar.com.codo24100.web.service.ClientesService;

public class ActualizarClienteController {

    public static void main(String[] args) {
        //datos que quiero actualizar, viene desde el front
        Long id = 2l;
        String nombre = "nuevo nombre";
        String apellido = "nuevo apellido";
        String email = "nuevoemail@mail.com";
        String imagen = "/ble/ble.jpg";
        Long tipoClienteId = 2l;

        //ahora lo se siempre!
        ClientesService service = new ClientesService();

        ClientesDTO cliente = new ClientesDTO(id, nombre, apellido, email, imagen, tipoClienteId);

        service.actualizarCliente(cliente);
    }
}
