package assigment;
import java.util.*;

public class QuesMap_11 {
	

	
	    public static void main(String[] args) {
	        
	        Map<String, Integer> map = new HashMap<>();

	       
	        map.put("Java", 1);
	        map.put("Python", 2);
	        map.put("Data", 3);


	        Collection<Integer> values = map.values();

	        
	        System.out.println("Values in the map: " + values);
	    }
	}

