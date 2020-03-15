package latihan.builderpattern;

public abstract class Burger implements Item
{
    @Override
    public Packing bungkus()//hasil implementasi dengan Item yang terdapat atribut bungkus()
    {
        return new Wrapper(); //kembali ke Wrapper
    }

    @Override
    public abstract float harga(); //hasil implementasian dengan Item yang terdapat atribut harga()
}