package latihan2.dependencyinjection.injector;

import latihan2.dependencyinjection.consumer.Consumer;
import latihan2.dependencyinjection.consumer.MyDIApplication;
import latihan2.dependencyinjection.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector
{
    @Override
    public Consumer getConsumer()
    {
        return new MyDIApplication(new EmailServiceImpl());
    }
}