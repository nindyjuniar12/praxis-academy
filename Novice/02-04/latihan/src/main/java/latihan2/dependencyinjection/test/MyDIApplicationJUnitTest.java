package latihan2.dependencyinjection.test;

import org.checkerframework.dataflow.qual.TerminatesExecution;

import jdk.jfr.Timestamp;
import latihan2.dependencyinjection.consumer.Consumer;
import latihan2.dependencyinjection.consumer.MyDIApplication;
import latihan2.dependencyinjection.injector.MessageServiceInjector;
import latihan2.dependencyinjection.service.MessageService;

public class MyDIApplicationJUnitTest
{
    private MessageServiceInjector injector;
    @Before
    public void setUp()
    {
        //mock injector dengan class anonim
        injector = new MessageServiceInjector(){
        
            @Override
            public Consumer getConsumer() {
                //mock layanan pesan
                return new MyDIApplication(new MessageService(){
                
                    @Override
                    public void sendMessage(String msg, String rec) {
                        System.out.println("Implementasi Layanan Pesan Mock");
                    }
                });
            }
        };
    }

    @Test
    public void test()
    {
        Consumer consumer = injector.getConsumer();
        consumer.processMessage("Assalamuallaikum Nindy", "nindy1700016057@webmail.uad.ac.id");
    }

    @After
    public void tear()
    {
        injector = null;
    }
}