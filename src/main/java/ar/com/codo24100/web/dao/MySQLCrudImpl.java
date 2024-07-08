package ar.com.codo24100.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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
        String sql  = "INSERT INTO clientes (nombre, apellido,email,imagen,clientes_tipos_id) values(?,?,?,?,?)";
        //tph; investigar como usar los ? con PreparedStatement
        Connection connection = AdministradorDeConexiones.conectar();
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            //seteo en orden cada parametro
            pst.setString(1, dto.getNombre());
            pst.setString(2, dto.getApellido());
            pst.setString(3, dto.getEmail());
            pst.setString(4, dto.getImagen());
            pst.setLong(5, dto.getTipoClienteId());
            pst.executeUpdate();

        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            AdministradorDeConexiones.desconectar(connection);
        }
    }

    //implementamos el delete
    @Override
    public void delete(Long pk) {
        Connection cnx = null;
        String sql = "DELETE FROM clientes WHERE id = ?";
        try {
            // 1) Conectarme a la DB
            cnx = AdministradorDeConexiones.conectar();
            PreparedStatement pstmt = cnx.prepareStatement(sql);
            pstmt.setLong(1, pk);
            if(pstmt.executeUpdate() > 0)
                System.out.println("El usuario con ID=" + pk + " ha sido eliminado.");
        } catch(Exception e ) {
            e.printStackTrace();
        } finally {
            AdministradorDeConexiones.desconectar(cnx);
        } 
    }

    public ArrayList<Clientes> findAll() {       
        String sql = "select * from clientes";

        ArrayList<Clientes> clientes = new ArrayList<>();

        Connection con = null;
        try{
            con = AdministradorDeConexiones.conectar();

            PreparedStatement  statement = con.prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery();

            //leer el result y crear mis entidades 

            //si hay datos, solo existe un registro!!!
            while(resultSet.next()) {
                Long idCliente = resultSet.getLong(1);
                String nombre = resultSet.getString(2);
                String apellido = resultSet.getString(3);
                String email = resultSet.getString(4);
                String imagen = resultSet.getString(5);
                Long tipoClienteId = resultSet.getLong(6);

                Clientes cliente = new Clientes(idCliente, nombre, apellido, email, imagen, tipoClienteId);
                clientes.add(cliente);
            }
        }catch(Exception e){
            System.err.println(e);
        }finally {
            AdministradorDeConexiones.desconectar(con);
        }

        return clientes;
    }

    public void update(ClientesDTO cliente) {
        
        String sql = new String("UPDATE clientes set nombre=?, apellido=?, email=?, clientes_tipos_id=? WHERE id=? ");

        Connection connection = AdministradorDeConexiones.conectar();        
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, cliente.getNombre());
            pst.setString(2, cliente.getApellido());
            pst.setString(3, cliente.getEmail());
            //pst.setString(3, cliente.getImagen());
            pst.setLong(4, cliente.getTipoClienteId());

            pst.setLong(5, cliente.getId());

            pst.executeUpdate();
            if(pst.getUpdateCount() > 0) {
                System.out.println("update ok");
            }
        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            AdministradorDeConexiones.desconectar(connection);
        }    
    }
}
