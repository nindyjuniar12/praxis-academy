package latihan2.dependencyinjection.injector;

import latihan2.dependencyinjection.consumer.Consumer;

public interface MessageServiceInjector
{
    public Consumer getConsumer();
}