package ar.com.codo24100.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import ar.com.codo24100.oop.Articulo;

public class ArticuloDaoMysqlImpl implements ArticuloDAO{

    @Override
    public void save(Articulo articulo) {
        String sql  = "INSERT INTO articulo (titulo, autor,precio,imagen) values(?,?,?,?)";        
        Connection connection = AdministradorDeConexiones.conectar();
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            //seteo en orden cada parametro
            pst.setString(1, articulo.getTitulo());
            pst.setString(2, articulo.getAutor());
            pst.setFloat(3, articulo.getPrecio());
            pst.setString(4, articulo.getImagen());

            pst.executeUpdate();

        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            AdministradorDeConexiones.desconectar(connection);
        }
    }

}
