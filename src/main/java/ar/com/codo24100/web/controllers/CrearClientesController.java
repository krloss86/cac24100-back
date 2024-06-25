package ar.com.codo24100.web.controllers;

import java.io.IOException;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import ar.com.codo24100.web.domain.Clientes;
import ar.com.codo24100.web.dto.ClientesDTO;
import ar.com.codo24100.web.service.ClientesService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CrearClientesController")//1
public class CrearClientesController extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        String jsonQueMandaElFront = req.getReader().lines().collect(Collectors.joining(System.lineSeparator()));

        System.out.println(jsonQueMandaElFront);
        
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
