package assigment;

	import java.util.Scanner;

	public class AgeValidOrNot {
	    public static void validate(int age) {
	        if (age < 18) {
	            throw new ArithmeticException("Not valid - You are not eligible to vote.");
	        } else {
	            System.out.println("Welcome to vote.");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Enter your age: ");
	            int age = scanner.nextInt();
	            validate(age);
	        } catch (ArithmeticException e) {
	            System.out.println(e.getMessage());
	        }
	        
	        scanner.close();
	    }
	}
