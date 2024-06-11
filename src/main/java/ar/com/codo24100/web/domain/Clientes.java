package ar.com.codo24100.web.domain;

public class Clientes {

    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String imagen;
    private Long tipoClienteId;
    
    //obtener desde la db
    public Clientes(Long id, String nombre, String apellido, String email, String imagen, Long tipoClienteId) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.imagen = imagen;
        this.tipoClienteId = tipoClienteId;
    }
    //para crear en la db
    public Clientes(String nombre, String apellido, String email, String imagen, Long tipoClienteId) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.imagen = imagen;
        this.tipoClienteId = tipoClienteId;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public Long getTipoClienteId() {
        return tipoClienteId;
    }
    public void setTipoClienteId(Long tipoClienteId) {
        this.tipoClienteId = tipoClienteId;
    }
    
    public String toString() {
        return "Clientes [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", imagen="
                + imagen + ", tipoClienteId=" + tipoClienteId + "]";
    }
}
