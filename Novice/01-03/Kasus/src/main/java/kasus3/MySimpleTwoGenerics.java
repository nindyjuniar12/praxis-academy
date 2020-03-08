package kasus3;

/**
 * MySimpleTwoGenerics
 */
public class MySimpleTwoGenerics {
public static void main(String a[] ) {
    SimpleGen<String, Integer> sample = new SimpleGen<String, Integer>("JAVANOVICE", 100);

    sample.printTypes();
}
    
}
/**
 * SimpleGen
 */
class SimpleGen<U, V> {
    //type U object reference
    private U objUreff;
    //type v object reference
    private V objVreff;

    //constructor to accept object type U and object type V
    public SimpleGen(U objU, V objV){
        this.objUreff = objU;
        this.objVreff = objV;
    }
    public void printTypes(){
        System.out.println("U Type : "+this.objUreff.getClass().getName());
        System.out.println("V Type : "+this.objVreff.getClass().getName());
    }

    
}