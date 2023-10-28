package assigment;

import java.util.Scanner;

public class Question_1 {
     public static void main(String[] args) {
		
    	 try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter the first number :");
			 int one1 = in.nextInt();
			 
			 System.out.println("Enter the second number :");
			 int two2 = in.nextInt();
			 
			 System.out.println("Enter the third number :");
			 int three3 = in.nextInt();
			 
			 
			 if (one1 > two2)
				 if (two2 > three3)
					 System.out.println("The greatest:" +one1);
			 
			 if (two2 > three3)
				 if(two2 > one1)
					 System.out.println("The greatest:" +two2);
			 
			 if (three3 > one1)
				 if (three3 > two2)
					 System.out.println("The greatest:" +three3);
		}
    		 
    		 
    	 
	}
}
