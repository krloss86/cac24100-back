package ar.com.codo.claserepaso;

import java.util.LinkedList;

public class TorreDeControlMain {

    public static void main(String[] args) {
        //llamar a los metodos
        Volador a1 = new Avion("avion1");
        Volador h1 = new Helicoptero("helicoptero1");
        Volador superman = new Superman("Clark");

        //guardar a todos en un vector/array/arraylist/
        LinkedList<Volador> voladores = new LinkedList<>();
        voladores.add(a1);
        voladores.add(h1);
        voladores.add(superman);

        //recorrer todos los elementos?
        for(Volador unVolador : voladores) {
            if(unVolador instanceof Aterrizable){
                //down casting: dame el Aterrizable dentro del Volador
                Aterrizable atr = (Aterrizable)unVolador;
                //invoco el metodo
                atr.aterrizar();
            }else{
                System.out.println(unVolador.getNombre() + " No autorizado");
            }
        }
    }
}
