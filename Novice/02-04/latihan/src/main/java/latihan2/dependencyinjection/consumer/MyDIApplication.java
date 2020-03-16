package latihan2.dependencyinjection.consumer;

import latihan2.dependencyinjection.service.MessageService;

public class MyDIApplication implements Consumer
{
    private MessageService service;

    public MyDIApplication(MessageService svc)
    {
        this.service = svc;
    }

    @Override
    public void processMessage(String msg, String rec)
    {
        //melakukan validasi msg dan logika manipulasi
        this.service.sendMessage(msg, rec);
    }
}