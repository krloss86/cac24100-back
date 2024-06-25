package ar.com.codo24100.web.controllers;

import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

import ar.com.codo24100.web.domain.Clientes;
import ar.com.codo24100.web.service.ClientesService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ListarClientesController")
public class ListarClientesController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //crear service
        ClientesService service = new ClientesService();

        //invocar metodo listarClientes > lista
        ArrayList<Clientes> clientes = service.listarClientes();

        ObjectMapper mapper = new ObjectMapper();

        //convierto Objecto java a json string
		//ahora respondo al front: json, Convirtiendo el nuevo Clientes a json
		String clientesJSON = mapper.writeValueAsString(clientes);
        
        //mostrar por consola|enviar al frontend
        // Configurar cabeceras CORS
        resp.setHeader("Access-Control-Allow-Origin", "*"); // Permitir acceso desde cualquier origen
        resp.setHeader("Access-Control-Allow-Methods", "*"); // Métodos permitidos
        resp.setHeader("Access-Control-Allow-Headers", "Content-Type"); // Cabeceras permitidas

        resp.getWriter().println(clientesJSON);
    }

}
