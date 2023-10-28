package assigment;
import java.util.ArrayList;

public class QuesCopyarray_17 {
	public static void main(String args[])
	{
		ArrayList<String> list1 =new ArrayList<>();
		
		list1.add("java");
		list1.add("Divyan");
		list1.add("shrutu");
		
		ArrayList<String> list2 =new ArrayList<>();
		
		list2.addAll(list1);
		
		System.out.println("list =" + list2);
	}

}
