package ar.com.codo24100.web.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;

import ar.com.codo24100.web.dto.ArticuloRequestDTO;
import ar.com.codo24100.web.service.ArticuloService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/api/articulo")
public class ArticuloController extends HttpServlet {

    private static List<String> inMemDB = List.of("Ele1","Elem2");

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String id = req.getParameter("id");

        //api de Stream
        List<String> lista = inMemDB
            .stream()
            .filter(x -> x.equals(id))
            .collect(Collectors.toList());
        
        resp.setStatus(200);//ok
        resp.getWriter().print(lista.toString());
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        ObjectMapper mapper = new ObjectMapper();

        ArticuloRequestDTO articuloRequestDto = mapper.readValue(req.getReader(), ArticuloRequestDTO.class);

        ArticuloService service = new ArticuloService();

        service.guardar(articuloRequestDto);

        resp.setStatus(HttpServletResponse.SC_CREATED);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.doDelete(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.doPut(req, resp);
    }
}
