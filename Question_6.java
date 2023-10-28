package assigment;

import java.util.Scanner;

public class Question_6 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int count = 0;
			System.out.println("Enter Row");
			int row = sc.nextInt();
			
			for (int i=1; i<= row; i++) {
				for (int j = 1;  j<= i; j++) {
					count++;
					System.out.print(count);
				}
				System.out.println();
			}
		}
	}

}
