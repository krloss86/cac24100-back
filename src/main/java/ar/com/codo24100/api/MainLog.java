package ar.com.codo24100.api;

import java.util.Scanner;

import ar.com.codo24100.api.service.LogService;

public class MainLog {

    public static void main(String[] args) {
        
        //1 obtengo mensaje que quiero enviar
        String msj = "error en archivo";

        //2 creo una instancia de mi log particular       
        //Interface nombre = new ClaseQueImplementaLaInterface()
        //que      = como

        //instancia LogService
        int log = 3;

        LogService service = new LogService(log);

        //3 envio el msj
        service.enviarMensaje(msj);
    }

}
