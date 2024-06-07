package ar.com.codo24100.api;

public class EmailLog implements ILog{

    //como
    public void log(String msj) {
        System.out.println("Enviando mail...");
        System.out.println("body:" + msj);
    }
}
