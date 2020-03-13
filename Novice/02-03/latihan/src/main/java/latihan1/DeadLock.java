package latihan1;

public class DeadLock{
    static class Friend {
        private final String name;
        public Friend(String name){
            this.name = name;
        }

        public String getName(){
            return this.name;
        }

        public synchronized void bow(Friend bower){
            System.out.format("%s : %s" + " has bowed to me!%n",this.name, bower.getName());
            bower.bowBack(this);
        }

        public synchronized void bowBack(Friend bower){
            System.out.format("%s : %s" + " has bowed to me!%n",this.name, bower.getName());
        }
    }

    public static void main(String[] args) {
        final Friend alphouse = new Friend("Alphouse");
        final Friend gaston = new Friend("Gaston");

        new Thread(new Runnable(){
            public void run(){alphouse.bow(gaston);}
        }).start();

        new Thread(new Runnable(){
            public void run(){gaston.bow(alphouse);}
        }).start();
    }
}