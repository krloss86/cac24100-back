package ar.com.codo24100.oop;

//clase hija
public class Libro extends Articulo {

    /*atributos */
    private String isbn;


    /*contructor */
    public Libro(
        String titulo, String autor, Float precio, String imagen,//todo del padre
        String isbn//propio del hijo
        ) {
        super(titulo,autor,precio,imagen);//esto es la llamada al contructor del padre!

        //despues el hijo
        this.isbn = isbn;
    }

    /*metodos: get/sets */
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        //lo que tiene el padre + lo que tiene el hijo
        return super.toString() + ", {Libro {isbn=" + isbn + "}";
    }      

}
