import java.util.ArrayList;

public class DisplayArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Displaying elements
        System.out.println("Numbers in ArrayList: " + numbers);
    }
}
