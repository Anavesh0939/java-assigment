package assigment;




import java.util.Scanner;

public class UpdateArrayElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[size];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Input the element to be updated
        System.out.print("Enter the element to be updated: ");
        int oldValue = scanner.nextInt();

        // Input the new value
        System.out.print("Enter the new value: ");
        int newValue = scanner.nextInt();

        // Call the updateElement method to update the array
        updateElement(array, oldValue, newValue);

        // Print the updated array
        System.out.println("Updated array: ");
        for (int element : array) {
            System.out.print(element + " ");
        }

        scanner.close();
    }

    public static void updateElement(int[] array, int oldValue, int newValue) {
        // Loop through the array to find and update the element
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
                break; // Element found and updated, so exit the loop
            }
        }
    }
}
