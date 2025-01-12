class Counter{

    private int count = 0;

    public synchronized void increment(){
        count++;
    }

    public int getCount(){
        return count++;
    }
}

public class Q24 {
    public static void main(String[] args) {

        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for(int i=0; i<100; i++){
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=0; i<100; i++){
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
        }catch(Exception e){
            e.printStackTrace();
        }

        try{
            t2.join();
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println(counter.getCount());
        
    }
}
