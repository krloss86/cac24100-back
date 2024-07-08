package ar.com.codo24100.web.controllers;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import ar.com.codo24100.web.dto.ClientesDTO;
import ar.com.codo24100.web.service.ClientesService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ActualizarClienteController")
public class ActualizarClienteController extends HttpServlet{

    @Override
    protected void doPost(
        HttpServletRequest req,
        HttpServletResponse resp)
    throws ServletException, IOException {
        
        ObjectMapper mapper = new ObjectMapper();

        //crar el DTO
        ClientesDTO dto = mapper.readValue(req.getReader(), ClientesDTO.class);

        ClientesService service = new ClientesService();
        
        service.actualizarCliente(dto);
      
        resp.setStatus(HttpServletResponse.SC_CREATED);/////creado
    }
}
