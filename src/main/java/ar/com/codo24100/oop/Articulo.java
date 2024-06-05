package ar.com.codo24100.oop;

//clase base/padre
public class Articulo {

    /*atributos */
    private String titulo;
    private String autor;
    private Float precio;
    private String imagen;

    /*contructor */
    public Articulo(String titulo, String autor, Float precio, String imagen) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.imagen = imagen;
    }

    /*metodos: gets/sets*/
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "{Articulo {titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + ", imagen=" + imagen + "}}";
    }   

}
