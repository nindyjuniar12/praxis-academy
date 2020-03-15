package latihan.abstractfactorypattern;

public class AbstractFactoryPatternDemo
{
    public static void main(String[] args) 
    {
        //mendapatkan dari shape Factory 
        AbstractFactory shapFactory1 = FactoryProducer.getFactory(false);
        
        //mendapatkan object dari Shape Rounded Rectangle 
        Shape shape1 = shapFactory1.getShape("RECTANGLE");

        shape1.gambar();//memanggil method gambar dari Shape Rectangle

        //mendapatkan object dari Shape Rounded Square
        Shape shape2 = shapFactory1.getShape("SQUARE");

        shape2.gambar();//memanggil method gambar dari Shape Square
        
        
        //mendapatkan dari shape Factory 
        AbstractFactory shapFactory2 = FactoryProducer.getFactory(true);
        
        //mendapatkan object dari Shape Rounded Rectangle 
        Shape shape3 = shapFactory2.getShape("RECTANGLE");

        shape3.gambar();//memanggil method gambar dari Shape Rectangle

        //mendapatkan object dari Shape Rounded Square
        Shape shape4 = shapFactory2.getShape("SQUARE");

        shape4.gambar();//memanggil method gambar dari Shape Square
        

   


    }
}