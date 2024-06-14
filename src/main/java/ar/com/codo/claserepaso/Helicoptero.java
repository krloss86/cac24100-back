package ar.com.codo.claserepaso;
//es un => extends
//se comporta como => implements

public class Helicoptero extends Volador implements Aterrizable{

    public Helicoptero(String nombre) {
        super(nombre);
    }

    @Override
    public void aterrizar() {
        System.out.println(this.nombre + " aterrizando");
    }

    
}
