package assigment;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSearch {
    public static void main(String[] args) {
                ArrayList<Integer> numbers = new ArrayList<>();

                numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the number to search: ");
        int searchNumber = scanner.nextInt();

                scanner.close();

                int index = search(numbers, searchNumber);

                if (index != -1) {
            System.out.println(searchNumber + " found at index " + index);
        } else {
            System.out.println(searchNumber + " not found in the ArrayList");
        }
    }

        public static int search(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                return i; 
                            }
        }
        return -1; 
            }
}
