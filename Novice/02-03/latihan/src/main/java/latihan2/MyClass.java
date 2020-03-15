package latihan2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyClass{
    public static void main(String[] args) 
    {
        new MyClass().startThreads();
    }

    private void startThreads()
    {
        ExecutorService taskLisst = Executors.newFixedThreadPool(2);

        for ( int i = 0; i < 5; i++){
           
            int finalI = i + 1;

            taskLisst.execute(() -> {

                for (int j = 0; j < finalI; j++){

                System.out.println(Thread.currentThread().getName() + " Counter: " + j);
                
                pause(Math.random());
            }
            });
        }
        taskLisst.shutdown();
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
}
