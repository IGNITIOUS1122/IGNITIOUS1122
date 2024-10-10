import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs
        map.put("Alice", 30);
        map.put("Bob", 25);

        // Accessing values
        System.out.println("Alice's age: " + map.get("Alice"));

        // Displaying all key-value pairs
        System.out.println("HashMap contents: " + map);
    }
}
