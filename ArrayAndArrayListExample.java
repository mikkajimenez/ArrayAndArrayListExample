import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAndArrayListExample {
    public static void main(String[] args) {
        // Array Example
        System.out.println("Array Example:");
        // Create an array of the 5 great lakes
        String[] lakesArray = {"Superior", "Huron", "Erie", "Michigan", "Ontario"};
        
        // Print array elements
        System.out.println("Array elements: " + Arrays.toString(lakesArray));
        
        // Access an element
        System.out.println("Element at index 2: " + lakesArray[2]);
        
        // Modify an element
        lakesArray[2] = "Lake Ontario"; // Changing the name to another valid string
        System.out.println("Modified element at index 2: " + lakesArray[2]);
        
        // Arrays are fixed size, so we cannot add or remove elements

        // ArrayList Example
        System.out.println("\nArrayList Example:");
        // Create an ArrayList of strings
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Aang", "Katara", "Sokka", "Toph", "Zuko", "Momo"));
        
        // Print ArrayList elements
        System.out.println("ArrayList elements: " + arrayList);
        
        // Access an element
        System.out.println("Element at index 2: " + arrayList.get(2));
        
        // Modify an element
        arrayList.set(5, "Uncle Iroh"); // Replace the first index with "Aang"
        System.out.println("Modified element at index 0: " + arrayList.get(0));
        
        // Add an element
        arrayList.add("Appa");
        System.out.println("ArrayList after adding an element: " + arrayList);
        
        // Remove an element... This doesn't feel right removing Uncle Iroh
        arrayList.remove(5);
        System.out.println("ArrayList after removing element at index 2: " + arrayList);
    }
}
