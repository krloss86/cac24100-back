package ar.com.codo24100.web.service;

import ar.com.codo24100.web.dao.ICrud;
import ar.com.codo24100.web.dao.MySQLCrudImpl;
import ar.com.codo24100.web.domain.Clientes;
import ar.com.codo24100.web.dto.ClientesDTO;

public class ClientesService {

    private ICrud crud;//null, porque no es primitivo
 
    public ClientesService() {
        //Interface nombre = new ClaseQueImplementaLaInterface();
        crud = new MySQLCrudImpl();
    }

    public void crearCliente(ClientesDTO dto) {
        //this.crud.getById(null);
    }

    public Clientes obtenerClientePorID(Long id) {
        return this.crud.getById(id);
    }
}
