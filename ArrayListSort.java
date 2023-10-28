package assigment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
                ArrayList<Integer> arrayList = new ArrayList<>();
        
                System.out.print("Enter the number of elements in the ArrayList: ");
        int n = scanner.nextInt();
        
                System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            arrayList.add(element);
        }
        
                Collections.sort(arrayList);
        
                System.out.println("Sorted ArrayList:");
        for (int element : arrayList) {
            System.out.print(element + " ");
        }
        
                scanner.close();
    }
}

