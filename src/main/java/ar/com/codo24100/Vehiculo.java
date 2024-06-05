package ar.com.codo24100;

public class Vehiculo {

    /*atributos */
    private String marca;
    private String modelo;
    private Integer anio;
    private String chasis;
    private Boolean encendido;
    private Integer velocidad;
    private Integer vm;

    /*constructor */
    public Vehiculo (String marca,String modelo,Integer anio,String chasis,Integer vm) {
        //los establece internamente la propia clase
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.chasis = chasis;
        this.vm = vm;

        //cuando los autos nacen, por defecto nacen encendido = false y velocidad=0 
        this.encendido = false;
        this.velocidad = 0;
    }

    /*metodos */
    public void encender () {
        if(!this.encendido) {
            //aca va logica del metodo
            this.encendido = true;
        }else {
            System.out.println("el auto ya esta encendido");
        }
    }

    public void apagar() {
        if(this.encendido) {
            this.encendido = false;
        }else {
            System.out.println("el auto ya esta apagado!!");
        }
    }

    public void acelerar() {
        if(this.encendido) {
            if(this.velocidad < this.vm) {
                this.velocidad++;
            }else {
                System.out.println("velocidad maxima");
            }
        }else {
            System.out.println("para acelerar encender el auto");
        }
    }

    public Integer obtenerVelocidad() {
        return this.velocidad;
    }
    public void frenar() {
        if(this.encendido && this.velocidad > 0){
            this.velocidad--;
        }
    }

    public void detener() {
        if(this.encendido) {
            System.out.println(this.velocidad);
            for(int i=this.velocidad; i>=0; i--) {
                this.velocidad--;
                System.out.println(this.velocidad);
            }
        }
    }
}
