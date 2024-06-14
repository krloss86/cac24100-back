package ar.com.codo24100.practica;

import java.util.ArrayList;

public class ListarTurnosController {

    public static void main(String[] args) {
        TurnoService service = new TurnoService();

        ArrayList<Turno> turnos = service.listarTurnos();

        for(Turno t : turnos) {
            System.out.println(t);//llama al toString()
        }
    }
}
