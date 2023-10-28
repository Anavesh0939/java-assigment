package assigment;
import java.util.Scanner;

public class Factroial {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = scanner.nextInt();
	        scanner.close();

	        long factorial = Factorial(n);

	        System.out.println(n + "! = " + factorial);
	    }

	    
	    public static long Factorial(int n) {
	        if (n < 0) {
	            System.out.println("Factorial is not defined for negative numbers.");
	            return -1; 
	        }

	        if (n == 0 || n == 1) {
	            return 1; 
	        }

	        long result = 1;
	        for (int i = 2; i <= n; i++) {
	            result *= i;
	        }

	        return result;
	    }
	}


