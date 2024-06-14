package ar.com.codo.claserepaso;

public class Volador {
   
    protected String nombre; // => los hijos lo heredan como private
    
    public Volador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
}
