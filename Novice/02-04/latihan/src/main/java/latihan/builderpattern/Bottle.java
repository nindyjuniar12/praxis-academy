package latihan.builderpattern;

public class Bottle implements Packing 
{
    @Override
    public String pack() //hasil implementasi dari Packing yang terdapat method pack()
    {
        return "Botol";
    }
}