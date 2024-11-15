import java.util.*;
import java.util.stream.Collectors;

public class Q26 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Aaa", "Bbb", "Ccc", "Ddd");

        List<String> modifiedNames = names.stream().filter(x -> x.startsWith("A")).map(String::toUpperCase).collect(Collectors.toList());


        modifiedNames.forEach(System.out::println);

        
    }
}
