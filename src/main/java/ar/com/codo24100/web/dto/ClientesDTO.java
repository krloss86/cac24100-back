package ar.com.codo24100.web.dto;

//Inmutables
public class ClientesDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String imagen;
    private Long tipoClienteId;
    
    public ClientesDTO(Long id, String nombre, String apellido, String email, String imagen, Long tipoClienteId) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.imagen = imagen;
        this.tipoClienteId = tipoClienteId;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getImagen() {
        return imagen;
    }

    public Long getTipoClienteId() {
        return tipoClienteId;
    }

    
}
