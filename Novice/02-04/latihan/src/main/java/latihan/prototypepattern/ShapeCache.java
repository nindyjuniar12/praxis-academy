package latihan.prototypepattern;

import java.util.Hashtable;//penyimpanan class dari database

public class ShapeCache
{
    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId)
    {
        Shape cachedShape = shapeMap.get(shapeId);
            return (Shape) cachedShape.clone();
    }

        //untuk setiap shape run database query dan create Shape
        //shapeMap.put(shapeKey, shape);
        //contoh, menambahkan tiga shape

        

    public static  void loadCache()
    {
        Circle lingkaran = new Circle();
        lingkaran.setId("1");
        shapeMap.put(lingkaran.getId(), lingkaran);

        Square persegi = new Square();
        persegi.setId("2");
        shapeMap.put(persegi.getId(), persegi);

        Rectangle persegipanjang = new Rectangle();
        persegipanjang.setId("3");
        shapeMap.put(persegipanjang.getId(), persegipanjang);
    }

}