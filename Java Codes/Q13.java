class Book{

    String title;
    String author;
    int price;

    public Book(){
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

public class Q13 {
    public static void main(String[] args) {

        Book b1 = new Book("Verity", "Collen Hoover", 200);
        System.out.println("One of my fav books is " + b1.title + " by " + b1.author);
        
        Book b2 = new Book();
        System.out.println("One of my fav books is " + b2.title + " by " + b2.author);
        


        
    }
}
