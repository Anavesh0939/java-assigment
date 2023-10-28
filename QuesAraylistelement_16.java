package assigment;
import java.util.ArrayList;

public class QuesAraylistelement_16 {
	 public static void main(String[] args) {
	       
	      ArrayList<String> list =new ArrayList<>();
		  
		  list.add("Java");
		  list.add("Python");
		  list.add("PHP");
		  
		  
		 for(int i=0; i<list.size(); i++)
		 {
			 System.out.println("Position =" + i + ":" + list.get(i));
		 }
	    }
	}


