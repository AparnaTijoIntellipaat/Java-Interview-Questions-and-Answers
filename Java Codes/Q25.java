class Counter {

    private volatile boolean flag = false;

    public void toggleFlag() {
        flag = !flag;
    }

    public boolean getFlag() {
        return flag;
    }

}

public class Q25 {
    public static void main(String[] args) {

        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            counter.toggleFlag();
            System.out.println("Thread 1: Flag toggled to " + counter.getFlag());
        });

        Thread t2 = new Thread(() -> {
            while(!counter.getFlag()) {
                counter.toggleFlag();
            }
            System.out.println("Thread 2: Flag becomes true, exiting the loop");
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

    }
}
