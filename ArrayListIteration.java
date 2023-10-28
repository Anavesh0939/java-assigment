package assigment;

import java.util.ArrayList;

public class ArrayListIteration {
    public static void main(String[] args) {
                ArrayList<String> arrayList = new ArrayList<>();

                arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");

                System.out.println("Iterating through elements using a for-each loop:");
        for (String element : arrayList) {
            System.out.println(element);
        }

                System.out.println("\nIterating through elements using a traditional for loop:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
