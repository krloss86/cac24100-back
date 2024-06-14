package ar.com.codo24100.practica;

import java.time.LocalDate;

public class Turno {
    //atributos
    private Long id;
    private LocalDate fecha;
    private Long tipo;
    private String motivo;
    //constructor
    public Turno(String motivo) {
        this.motivo = motivo;
    }  
    //metodos (get/set u otros)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public Long getTipo() {
        return tipo;
    }
    public void setTipo(Long tipo) {
        this.tipo = tipo;
    }
    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    public String toString() {
        return "Turno [id=" + id + ", fecha=" + fecha + ", tipo=" + tipo + ", motivo=" + motivo + "]";
    }
    
}
