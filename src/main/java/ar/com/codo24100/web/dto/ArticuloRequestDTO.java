package ar.com.codo24100.web.dto;

public class ArticuloRequestDTO {

    private Long id;
    private String titulo;
    private String autor;
    private String imagen;
    private Float precio;
        
    public ArticuloRequestDTO() {
    }

    public ArticuloRequestDTO(Long id, String titulo, Float precio) {
        this.id = id;
        this.titulo = titulo;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ArticuloRequestDTO [id=" + id + ", titulo=" + titulo + ", precio=" + precio + "]";
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
   

}
