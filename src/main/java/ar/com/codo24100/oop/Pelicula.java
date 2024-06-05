package ar.com.codo24100.oop;

//clase hija
public class Pelicula extends Articulo {

    /*atributos */
    private String genero;


    /*contructor */
    public Pelicula(
        String titulo, String autor, Float precio, String imagen,//todo del padre
        String genero//propio del hijo
        ) {
        super(titulo,autor,precio,imagen);//esto es la llamada al contructor del padre!

        //despues el hijo
        this.genero = genero;
    }

    /*metodos: get/sets */
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
   
    @Override
    public String toString() {
        //lo que tiene el padre + lo que tiene el hijo
        return super.toString() + ", Pelicula [genero=" + genero + "]";
    }      

}
