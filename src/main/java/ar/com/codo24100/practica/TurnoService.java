package ar.com.codo24100.practica;

import java.util.ArrayList;

public class TurnoService {

    private TurnoDAO dao;//null

    public TurnoService () {
        //Interface nombre = new ClaseQueImplementaLaInterface();
        this.dao = new TurnoDaoMysqlImpl();
    }

    public void crearTurno(Turno turno) {
        this.dao.create(turno);
    }

    public ArrayList<Turno> listarTurnos() {
        return this.dao.findAll();
    }
}
