package ar.com.codo24100.api.service;

import ar.com.codo24100.api.EmailLog;
import ar.com.codo24100.api.ILog;
import ar.com.codo24100.api.SMSLog;
import ar.com.codo24100.api.DefaultLog;

public class LogService {

    private ILog logger;

    public LogService(int logHabilitado) {
        
        //Interface i = new Clase();   

        switch (logHabilitado) {
            case 1:
                this.logger = new SMSLog(); 
                break;
            case 2: 
                this.logger = new EmailLog(); 
                break;
            default:
                this.logger = new DefaultLog();
                break;
        }
    }

    public void enviarMensaje(String msjAEnviar) {
        this.logger.log(msjAEnviar);
    }
}
