package latihan.builderpattern;

public class VegBurger extends Burger
{
    @Override
    public float harga()
    {
        return 25.0f;
    }

    @Override
    public String nama()
    {
        return "Vegetarian Burger";
    }
}