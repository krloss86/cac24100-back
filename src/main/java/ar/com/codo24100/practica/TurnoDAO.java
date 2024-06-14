package ar.com.codo24100.practica;

import java.util.ArrayList;

public interface TurnoDAO {

    public void create(Turno turno);

    public ArrayList<Turno> findAll();

}
