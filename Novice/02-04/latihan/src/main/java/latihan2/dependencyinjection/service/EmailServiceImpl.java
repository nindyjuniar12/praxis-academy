package latihan2.dependencyinjection.service;

public class EmailServiceImpl implements MessageService
{
    @Override
    public void sendMessage(String msg, String rec)
    {
        //logika untuk mengirimkan email
        System.out.println("Email dikirikan ke " +rec+ "dengan Pesan = " +msg);
    }
}