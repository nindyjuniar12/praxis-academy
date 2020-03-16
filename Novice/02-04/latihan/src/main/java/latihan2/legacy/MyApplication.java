package latihan2.legacy;

public class MyApplication
{
    private EmailService email = new EmailService();

    public void processMessage(String msg, String rec)
    {
        //Melakukan validasi msg, manipulasi logika
        this.email.sendEmail(msg, rec);
    }
}