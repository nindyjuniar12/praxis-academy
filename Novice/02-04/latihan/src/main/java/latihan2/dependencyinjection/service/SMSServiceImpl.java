package latihan2.dependencyinjection.service;

public class SMSServiceImpl implements MessageService
{
    @Override
    public void sendMessage(String msg, String rec)
    {
        //logika untuk mengirim ke email
        System.out.println("SMS dikirim ke " +rec+ "dengan Pesan = " +msg);
    }
}