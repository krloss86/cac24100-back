package ar.com.codo24100; //esto es un paquete

/**
 * Hello world!
 *
 */

public class App 
{
    //esto la funcion principal no pueden haber dos en el mismo archivo
    public static void main( String[] args )
    {
        /*tipo de datos primitivos en JAVA */
        int a = 10;
        long c = 10;

        float b = 10;
        double d = 10;

        boolean flag;//asume false
        
        char letra = 'a';
        
        //wrapper: Clase > tiene metodos
        String nombre = "'carlos'";
        // Integer /Long / Float / Double / Boolean

        Object o = a;//asigno a o el valor de a
 
        // O.O.P (HERENCIA/POLIMORFISMO/ENCAPSULAMIENTO/ABSTRACCION)
        // OPERADORES
        // CLASES
        // INTERFACES
        // JDBC > MYSQL
        // Controller
        // exponer un API Rest (GET/POST/?DELETE/PUT) http://localhost:8080/webapp-24100/api/food

        // CONECTAR EL FRONT 
        // fetch( http://localhost:8080/webapp-24100/api/food).then()..

        // Mostrar los datos
        System.out.println( "Hello World!" );
    }
}
