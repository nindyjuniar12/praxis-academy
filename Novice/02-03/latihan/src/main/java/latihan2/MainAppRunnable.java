package latihan2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainAppRunnable implements Runnable
{
    private final int loopLimit;

    private MainAppRunnable(int loopLimit)
    {
        this.loopLimit = loopLimit;
    }

    private void startThreads()
    {
       ExecutorService taskList = Executors.newFixedThreadPool(2);
       
       taskList.execute(this);
       taskList.execute(this);
       taskList.execute(this);
       taskList.execute(this);
       taskList.execute(this);

       taskList.shutdown();
    }

    @Override
    public void run()
    {
        for (int i = 0; i < loopLimit; i++){
            System.out.println(Thread.currentThread().getName() + " Counter: " + i);
        }

        pause(Math.random());
    }

    private void pause(double seconds)
    {
        try {
            Thread.sleep(Math.round(seconds * 1000.0));
        }

        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) 
    {
        new MainAppRunnable(3).startThreads();    
    }
}