class Animal{

    public void sound(){
        System.out.println("Animals make different sounds");
    }
}

class Dog extends Animal{

    public void sound(){
        System.out.println("Woof woof!");
    }
}

public class Q15 {
    
    public static void main(String[] args) {
        
        final int num = 10;
        System.out.println(num);

        try{
            int sum = 10 / 79;
            System.out.println(sum);
        } catch(ArithmeticException e){
            e.printStackTrace();
        } finally{
            System.out.println("This will be executed regardless");
        }
    }
}
