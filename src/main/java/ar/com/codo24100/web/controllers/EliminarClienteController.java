package ar.com.codo24100.web.controllers;

import java.io.IOException;

import ar.com.codo24100.web.service.ClientesService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/EliminarClienteController")
public class EliminarClienteController extends HttpServlet{

    protected void doDelete(
        HttpServletRequest req,//aca viene el ?id=
        HttpServletResponse resp
    ) throws ServletException, IOException {
       
        //quiero obtener un cliente de la base de datos con id=1
        String id = req.getParameter("id");

        ClientesService service = new ClientesService();

        service.eliminiarClientePorID(Long.parseLong(id));

        resp.setStatus(HttpServletResponse.SC_OK);
    }

}
