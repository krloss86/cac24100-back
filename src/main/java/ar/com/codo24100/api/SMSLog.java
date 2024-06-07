package ar.com.codo24100.api;

public class SMSLog implements ILog {

    //como
    public void log(String msj) {
        System.out.println("Enviando sms a jose: ");
        System.out.println(msj);
    }

}
