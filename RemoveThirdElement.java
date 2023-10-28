package assigment;

import java.util.ArrayList;

public class RemoveThirdElement {
    public static void main(String[] args) {
                ArrayList<String> arrayList = new ArrayList<>();

                arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");
        arrayList.add("Fourth");
        arrayList.add("Fifth");

                System.out.println("Original ArrayList: " + arrayList);

                if (arrayList.size() >= 3) {
                        arrayList.remove(2);

                        System.out.println("ArrayList after removing the third element: " + arrayList);
        } else {
            System.out.println("The ArrayList does not have a third element to remove.");
        }
    }
}
