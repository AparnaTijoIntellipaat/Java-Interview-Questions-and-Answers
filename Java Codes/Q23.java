public class Q23 {
    public static void main(String[] args) {

        new Thread(new Runnable (){
            @Override
            public void run(){
                System.out.println("Thread is running");
            }
        }).start();

        new Thread(() -> System.out.println("Thread is running")).start();
        
    }
}
