package latihan1;

public class MsLunch{
    private long c1 = 0;
    private long c2 = 0;
    private Object look1 = new Object();
    private Object look2 = new Object();


    public void inc1(){
        synchronized(look1){
            c1++;
        }
    }

    public void inc2(){
        synchronized(look2){
            c2++;
        }
    }
}