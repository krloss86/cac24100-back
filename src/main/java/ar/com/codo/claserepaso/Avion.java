package ar.com.codo.claserepaso;

public class Avion extends Volador implements Aterrizable {
    
    public Avion(String nombre) {
        super(nombre);
    }

    @Override
    /*ahora cumplo el contrato, es decir implementar el metodo de Aterrizable */
    public void aterrizar() {
        System.out.println(nombre + " aterrizando");
    }

    
}
