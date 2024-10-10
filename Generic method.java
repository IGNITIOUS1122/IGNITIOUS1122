public class Generic methodAssignment{
    // Generic method to display elements of any type
    public static <T> void displayArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Using the generic method with Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.print("Integer array: ");
        displayArray(intArray);

        // Using the generic method with String array
        String[] strArray = {"Hello", "World"};
        System.out.print("String array: ");
        displayArray(strArray);
    }
}
