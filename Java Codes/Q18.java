class InvalidAgeException extends Exception{

    public InvalidAgeException(String message){
        super(message);
    }

}

public class Q18 {

    public static void checkAge(int age) throws InvalidAgeException{
        if(age < 15 || age > 30) throw new InvalidAgeException(age + " is not allowed, sorry!");
        else System.out.println(age + " is always welcome.");
    }


    public static void main(String[] args) {

        try{
            checkAge(20);
        } catch(InvalidAgeException e){
            e.printStackTrace();
        }

        try{
            checkAge(10);
        } catch(InvalidAgeException e){
            e.printStackTrace();
        }
        
    }
}
