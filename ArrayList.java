import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Access elements
        System.out.println("First element: " + list.get(0)); // Accessing the first element

        // Remove an element
        list.remove("Banana");

        // Display all elements
        System.out.println("ArrayList elements: " + list);
    }
}
