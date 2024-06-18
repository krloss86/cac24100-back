package ar.com.codo24100.web.dao;

import java.util.ArrayList;

import ar.com.codo24100.web.domain.Clientes;
import ar.com.codo24100.web.dto.ClientesDTO;

public interface ICrud {

    //que 
    public Clientes getById(Long id);
    //select * from clientes where id = id

    public void create(ClientesDTO dto);

    public void delete(Long pk);

    public ArrayList<Clientes> findAll();

}
