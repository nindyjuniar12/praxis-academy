package latihan2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.print.DocFlavor.STRING;
public class Counter implements Runnable{
    private final MainApp mainApp;
    private final int loopLimit;
    private final String task;

    public Counter
    (MainApp mainApp, int loopLimit, String task)
    {
        this.mainApp = mainApp;
        this.loopLimit = loopLimit;
        this.task = task;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < loopLimit; i++)
        {
            System.out.println("Thread: " + Thread.currentThread().getName() + "Counter: " + (i + 1) + " Task: " + task);
            mainApp.pause(Math.random());
        }
    }
}

class MainApp
{
    public void startThread()
    {
        ExecutorService taskList = Executors.newFixedThreadPool(2);
        for ( int i = 0; i < 5; i++)
        {
            taskList.execute(new Counter(this, i + 1, "task " + (i + 1)));
        }
            taskList.shutdown();
    }

    public void pause(double seconds)
    {
        try
        {
            Thread.sleep(Math.round(10000 * seconds));
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
        public static void main(String[] args) 
        {
            new MainApp().startThread();    
        }
    }
