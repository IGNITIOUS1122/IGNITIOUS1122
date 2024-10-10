import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Adding elements
        set.add("Dog");
        set.add("Cat");
        set.add("Dog"); // Duplicate, will not be added

        // Displaying elements
        System.out.println("HashSet elements: " + set);
    }
}
