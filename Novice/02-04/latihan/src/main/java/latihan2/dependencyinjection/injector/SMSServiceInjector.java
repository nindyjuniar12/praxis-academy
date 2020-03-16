package latihan2.dependencyinjection.injector;

import latihan2.dependencyinjection.consumer.Consumer;
import latihan2.dependencyinjection.consumer.MyDIApplication;
import latihan2.dependencyinjection.service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector
{
    @Override
    public Consumer getConsumer()
    {
        return new MyDIApplication(new SMSServiceImpl());
    }
}