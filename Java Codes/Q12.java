class Animal{
    protected String name;

    public Animal(String name){
        this.name = name;
    }

    protected void displayName(){
        System.out.println(name);
    } 
}

class Dog extends Animal{

    public Dog(String name){
        super(name);
    }
}

public class Q12 {

    public int publicVar = 1;
    private int privateVar = 2;
    int defaultVar = 3;

    public static void main(String[] args) {
        Dog d1 = new Dog("Lucy");
        d1.displayName();

        Q12 num = new Q12();
        System.out.println(num.publicVar);
        System.out.println(num.privateVar);
        System.out.println(num.defaultVar);

    }
}
