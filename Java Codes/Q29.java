import java.io.Serializable;

class User implements Serializable{

    private String username;
    private transient String password;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }


}


public class Q29 {
    public static void main(String[] args) {
        
    }
}
