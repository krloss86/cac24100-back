package ar.com.codo24100.web.service;

import java.util.ArrayList;

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
        this.crud.create(dto);
    }

    public Clientes obtenerClientePorID(Long id) {
        return this.crud.getById(id);
    }

    public void eliminiarClientePorID(Long id) {
        this.crud.delete(id);
    }

    public ArrayList<Clientes> listarClientes() {
        return this.crud.findAll();
    }

    public void actualizarCliente(ClientesDTO cliente) {
        this.crud.update(cliente);
    }
}
