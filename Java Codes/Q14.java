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


public class Q14 {

    // Method overloading
    public int addition(int a, int b){
        return a+b;
    }

    public double addition(double a, double b){
        return a+b;
    }
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();
        
    }
}
