package latihan2;

import java.util.concurrent.Exchanger; 
import java.util.concurrent.TimeUnit; 
import java.util.concurrent.TimeoutException; 
  
public class ExchangerDemo { 
    public static void main(String[] args) 
    { 
        Exchanger<String> exchanger = new Exchanger<>(); 
  
        new UseString(exchanger); 
        new MakeString(exchanger); 
    } 
} 
  
class MakeString implements Runnable { 
    Exchanger<String> ex; 
    String str; 
  
    MakeString(Exchanger<String> ex) 
    { 
        this.ex = ex; 
        str = new String(); 
  
        new Thread(this).start(); 
    } 
  
    public void run() 
    { 
        char ch = 'A'; 
        try { 
            for (int i = 0; i < 3; i++) { 
                for (int j = 0; j < 5; j++) { 
                    str += ch++; 
                } 
                if (i == 2) { 
                    str 
                        = ex.exchange(str, 250, TimeUnit.MILLISECONDS); 
                    continue; 
                } 
  
                str = ex.exchange(str); 
            } 
        } 
        catch (InterruptedException e) { 
            System.out.println(e); 
        } 
        catch (TimeoutException t) { 
            System.out.println("Timeout Occurred"); 
        } 
    } 
} 

class UseString implements Runnable { 
  
    Exchanger<String> ex; 
    String str; 
  
    UseString(Exchanger<String> ex) 
    { 
        this.ex = ex; 
  
        new Thread(this).start(); 
    } 
  
    public void run() 
    { 
        try { 
            for (int i = 0; i < 3; i++) { 
                if (i == 2) { 
                    Thread.sleep(500); 
                    continue; 
                } 
  
                str = ex.exchange(new String()); 
                System.out.println("Got: " + str); 
            } 
        } 
        catch (InterruptedException e) { 
            System.out.println(e); 
        } 
    } 
}