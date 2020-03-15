package latihan.factorpattern;

public class FactorPatternDemo{

public static void main(String[] args)
{
    ShapeFactory shapeFactory = new ShapeFactory();

    Shape shape1 = shapeFactory.getShape("CIRCLE");
    shape1.gambar();

    Shape shape2 = shapeFactory.getShape("RECTANGLE");
    shape2.gambar();

    Shape shape3 = shapeFactory.getShape("SQUARE");
    shape3.gambar();

}
}