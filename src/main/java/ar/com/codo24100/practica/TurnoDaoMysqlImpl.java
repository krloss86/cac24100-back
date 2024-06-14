package ar.com.codo24100.practica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import ar.com.codo24100.web.dao.AdministradorDeConexiones;

public class TurnoDaoMysqlImpl implements TurnoDAO{

    public void create(Turno turno) {
        String sql  = "INSERT INTO TURNOS (MOTIVO) VALUES(?)";
     
        Connection connection = AdministradorDeConexiones.conectar();
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,turno.getMotivo());        
            //como es un insert
            pst.executeUpdate();
        }catch(Exception e) {
            System.err.println(e);
        }finally{
            AdministradorDeConexiones.desconectar(connection);
        }
    }

    @Override
    public ArrayList<Turno> findAll() {
        String sql  = "SELECT * FROM TURNOS";
     
        Connection connection = AdministradorDeConexiones.conectar();
        ArrayList<Turno> turnos = new ArrayList<>();
        
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
              
            //como es un insert
            ResultSet res = pst.executeQuery();

            while(res.next()) {//3 veces
                Long id = res.getLong(1);
                String motivo = res.getString(2);
                //res.getString(3)//tph... como extraer de TimeStamp a un LocalDate
                
                Turno turno = new Turno(motivo);
                turno.setId(id);
                turnos.add(turno);
            }
        }catch(Exception e) {
            System.err.println(e);
        }finally{
            AdministradorDeConexiones.desconectar(connection);
        }
        return turnos;
    }

}
