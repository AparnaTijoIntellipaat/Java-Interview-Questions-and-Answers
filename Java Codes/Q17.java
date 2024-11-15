import java.nio.file.*;

class Book{

    String title;
    String author;
    int price;

    public Booku(){
        title = "Title";
        author = "Author";
        price = 200;
    }
    

    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

}

public class Q17 {
    public static void main(String[] args) {

        // Checked Exception
        Path p1 = Paths.get("B.txt");
        try{
            String content = Files.readString(p1);
            System.out.println(content);
        } catch(Exception e){
            e.printStackTrace();
        }


        //  Unchecked Exception
        Book b2 = new Book();
        System.out.println("One of my fav books is " + b2.title + " by " + b2.author);
        
    }
}
