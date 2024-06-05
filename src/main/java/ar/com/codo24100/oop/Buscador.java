package ar.com.codo24100.oop;

import java.util.ArrayList;

public class Buscador {
    
    /*atributos */
    private String claveDeBusqueda;
    private ArrayList<Articulo> resultados;//null

    /*constructor */
    public Buscador() {
        this.resultados = new ArrayList<Articulo>();
    }

    /*metodos*/
    public void buscar() {

        //select * from articulos where title like '%this.claveDeBusqueda%'; > []

        //aca mismo crear varios articulos y los metod dentro del array
        Libro l = new Libro(claveDeBusqueda, "SIN AUTOR", 6600f, "http://sitio.com/img/bla.jpg", "12345679");
        resultados.add(l);

        Pelicula p = new Pelicula("EL INVENCIBLE IRON MAN","", 2433.6f,"http://bla.com.ar/img/bla.jpg","ACCION");
        resultados.add(p);
    }

    public void mostrarResultados() {
        System.out.println("Hemos Encontrado " +getCantidad() +" Resultados Para '"+claveDeBusqueda+"'");

        for(Articulo art : resultados) {
            //art puede ser un Libro o una Pelicula
            //polimorfica invoco al toString()
            System.out.println(art.toString());
        }
    }

    public Integer getCantidad() {
        return resultados.size();
    }

    public void setClaveDeBusqueda(String clave) {
        if(clave == null) {
            this.claveDeBusqueda = "";
        }else {
            this.claveDeBusqueda = clave;
        }
    }
}
