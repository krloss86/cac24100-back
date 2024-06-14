package ar.com.codo24100.practica;

public class CrearTurnosController {

    public static void main(String[] args) {
        
        TurnoService turnoService = new TurnoService();

        Turno nuevoTurno = new Turno("Test1234");

        turnoService.crearTurno(nuevoTurno);
    }
}
