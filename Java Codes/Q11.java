import java.nio.file.*;

public class Q11 {
    public static void main(String[] args) {

        Path p1 = Paths.get("A.txt");
        try{
            String content = Files.readString(p1);
            System.out.println(content);
        } catch(Exception e){
            System.err.println("Something went wrong");
        }

        String value = "Hello world!!";
        try{
            Files.writeString(p1, value);
            System.out.println("File written successfully!");
        } catch(Exception e){
            System.err.println("Something went wrong");
        }
        
    }
}
