package assigment;

import java.util.ArrayList;

public class RetrieveElementAtIndex {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");
        arrayList.add("Fig");

        // Specify the index from which you want to retrieve an element
        int indexToRetrieve = 2;

        // Check if the index is valid
        if (indexToRetrieve >= 0 && indexToRetrieve < arrayList.size()) {
            // Retrieve the element at the specified index
            String element = arrayList.get(indexToRetrieve);
            System.out.println("Element at index " + indexToRetrieve + ": " + element);
        } else {
            System.out.println("Invalid index. Index should be between 0 and " + (arrayList.size() - 1));
        }
    }
}
