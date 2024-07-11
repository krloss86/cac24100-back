package ar.com.codo24100.web.service;

import ar.com.codo24100.oop.Articulo;
import ar.com.codo24100.web.dao.ArticuloDAO;
import ar.com.codo24100.web.dao.ArticuloDaoMysqlImpl;
import ar.com.codo24100.web.dto.ArticuloRequestDTO;

public class ArticuloService {

    private ArticuloDAO dao;

    public ArticuloService() {
        this.dao = new ArticuloDaoMysqlImpl();
    }

    public void guardar(ArticuloRequestDTO articuloRequestDto) {
        Articulo articulo = new Articulo(
            articuloRequestDto.getTitulo(),
            articuloRequestDto.getAutor(),
            articuloRequestDto.getPrecio(),
            articuloRequestDto.getImagen()
        );
        
        this.dao.save(articulo);
    }

}
