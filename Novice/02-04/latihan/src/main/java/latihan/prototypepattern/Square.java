package latihan.prototypepattern;

public class Square extends Shape
{
    public Square()
    {
        type = "Persegi";
    }

    @Override
    public void gambar()
    {
        System.out.println("Di dalam Square tedapat method gambar()");
    }
}