package ar.com.codo24100;

public class MainVehiculo {

    public static void main(String[] args) {
        
        // crear el vehiculo
        Vehiculo clio = new Vehiculo("renault", "clio", 2018, "12345678", 5);

        //ejecutar metodos del vehiculo, clio!
        clio.encender();

        System.out.println(clio.obtenerVelocidad());

        clio.acelerar();
        clio.acelerar();
        clio.acelerar();
        clio.acelerar();
        clio.acelerar();
        clio.acelerar();

        System.out.println(clio.obtenerVelocidad());

        clio.detener();

        /*
         *herencia: 
         polimorfismo
         interfaces 
         ejercicios
         */
    }
}
