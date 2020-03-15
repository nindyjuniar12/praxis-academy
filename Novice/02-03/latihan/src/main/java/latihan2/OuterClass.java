package latihan2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OuterClass
{
    public static void main(String[] args) 
    {
        new OuterClass().startThread();
    }

    private void startThread()
    {
        ExecutorService taskList = Executors.newFixedThreadPool(2);

        taskList.execute(new InnerClass(1));
        taskList.execute(new InnerClass(2));
        taskList.execute(new InnerClass(3));
        taskList.execute(new InnerClass(4));
        taskList.execute(new InnerClass(5));

        taskList.shutdown();
    }

    private void pause(double seconds)
    {
        try{
            Thread.sleep(Math.round(1000.0 * seconds));
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public class InnerClass implements Runnable{
        private int loopList;

        InnerClass(int loopList)
        {
            this.loopList = loopList;
        }

    public void run()
    {
        for ( int i = 0; i < loopList; i++){
            System.out.println(Thread.currentThread().getName() + " Counter: " + i);
            pause(Math.random());
        }
    }
    }
}