package latihan2.dependencyinjection.test;

import latihan2.dependencyinjection.consumer.Consumer;
import latihan2.dependencyinjection.injector.MessageServiceInjector;
import latihan2.dependencyinjection.injector.SMSServiceInjector;

public class MyMessageDITest
{
    public static void main(String[] args) 
    {
        String msg = "Assalamualaikum Nindy" ;
        String email = "nindy1700016057@webmail.uad.ac.id";
        String phone = "123456789";
        MessageServiceInjector injector = null;
        Consumer app = null;

        //Kirim email
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessage(msg, email);

        //Kirim SMS
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessage(msg, phone);
    }
}