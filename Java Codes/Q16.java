import java.util.*;

public class Q16 {
    public static void main(String[] args) {

        //todo List
        // List<Integer> students = new ArrayList<>();

        // students.add(100);
        // students.add(100);
        // students.add(101);
        // students.add(101);

        // for(Integer x : students) System.out.println(x);

        //todo HashSet

        // Set<Integer> students = new HashSet<>();
        // students.add(100);
        // students.add(100);
        // students.add(101);
        // students.add(101);

        // for (Integer x : students)
        //     System.out.println(x);

        //todo HashMap

        // Map<String, Integer> students = new HashMap<>();
        // students.put("Alice", 100);
        // students.put("B", 100);
        // students.put("C", 101);
        // students.put("D", 101);

        // for(Map.Entry<String, Integer> entry : students.entrySet()){
        //     System.out.println(entry.getKey() + " : " + entry.getValue());
        // }

        //todo LinkedList

        Queue<String> students = new LinkedList<>();
        students.add("Alice");
        students.add("B");
        students.add("C");
        students.add("D");

        System.out.println("Current " + students.poll());
        System.out.println("Next " + students.peek());
    }
}
