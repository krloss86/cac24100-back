package ar.com.codo24100.web.dao;

import java.sql.Connection;

public class AdministradorDeConexiones {
    private Connection connection;

    //obtener una conexion
    public Connection conectar() {
        //logica para obtener la conexion
        return null;
    }
    
    public void desconectar() {
        //controlo el posible error del metodo close
        try{
            this.connection.close();
        }catch(Exception e) {
            System.err.println(e);
        }
    }
}
