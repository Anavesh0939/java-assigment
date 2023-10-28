package assigment;
import java.util.*;

public class QuestIncrerse_12 {
	public static void main(String[] args) {
	       
	      ArrayList<String> list =new ArrayList<>();
		  
		  list.add("Java");
		  list.add("Swattt");
		  list.add("Massu");
		  
		  
		  System.out.println("list =" + list.size());
		  
		  
		  list.ensureCapacity(5);
		  
		  System.out.println("list =" + list.size());
	    }

}
