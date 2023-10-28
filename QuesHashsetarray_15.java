package assigment;
import java.util.*;
public class QuesHashsetarray_15 {
	 public static void main(String[] args) {
	       
	        HashSet<String> set =new HashSet<>();
			
			
			
	        set.add("database");
	        set.add("Python");
	        set.add("java");

	     String[] array  =set.toArray(new String[set.size()]);
		 
		 
	       System.out.println("Array :");
		   
		   for(String element : array)
		   {
			   System.out.println(element);
		   }
	    }
}
