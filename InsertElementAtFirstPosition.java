package assigment;



import java.util.ArrayList;
import java.util.Scanner;

public class  InsertElementAtFirstPosition {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Add elements to the ArrayList
        arrayList.add("Element 1");
        arrayList.add("Element 2");
        arrayList.add("Element 3");

        // Display the original ArrayList
        System.out.println("Original ArrayList: " + arrayList);

        // Get user input for the element to insert
        System.out.print("Enter the element to insert at the first position: ");
        String elementToInsert = scanner.nextLine();

        // Insert the element at the first position
        arrayList.add(0, elementToInsert);

        // Display the ArrayList after insertion
        System.out.println("ArrayList after inserting at the first position: " + arrayList);

        // Close the scanner
        scanner.close();
    }
}
