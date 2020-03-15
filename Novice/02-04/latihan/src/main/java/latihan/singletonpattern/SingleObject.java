package latihan.singletonpattern;

public class SingleObject
{
    //membuat onject SingleObject
    private static SingleObject instance = new SingleObject();

    //membuat construktor private sehingga class tidak dapat di pakai
    private SingleObject(){}
    
    //Mendapatkan dari object yang tersedia
    public static SingleObject getInstance()
    {
        return instance;
    }

    public void showMessage()
    {
        System.out.println("Assalamuallaikum!");
    }
}