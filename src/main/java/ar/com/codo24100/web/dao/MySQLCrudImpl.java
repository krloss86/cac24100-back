package ar.com.codo24100.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import ar.com.codo24100.web.domain.Clientes;
import ar.com.codo24100.web.dto.ClientesDTO;

public class MySQLCrudImpl implements ICrud{
    
    //debo decir COMO: implementar el/los metodo/s de ICrud
    public Clientes getById(Long id) {       
        String sql = "select * from clientes where id = " + id;

        Clientes cliente = null;

        Connection con = null;
        try{
            con = AdministradorDeConexiones.conectar();

            PreparedStatement  statement = con.prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery();

            //leer el result y crear mis entidades 

            //si hay datos, solo existe un registro!!!
            if(resultSet.next()) {
                Long idCliente = resultSet.getLong(1);
                String nombre = resultSet.getString(2);
                String apellido = resultSet.getString(3);
                String email = resultSet.getString(4);
                String imagen = resultSet.getString(5);
                Long tipoClienteId = resultSet.getLong(6);

                cliente  = new Clientes(idCliente, nombre, apellido, email, imagen, tipoClienteId);
            }
        }catch(Exception e){
            System.err.println(e);
        }finally {
            AdministradorDeConexiones.desconectar(con);
        }

        return cliente;
    }

    
    public void create(ClientesDTO dto) {
        String sql  = "INSERT INTO clientes (nombre, apellido,email,imagen,clientes_tipos_id) values(?,?,?,?,?,?)";
        //tph; investigar como usar los ? con PreparedStatement
        //...
    }
}
