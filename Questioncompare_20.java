package assigment;

public class Questioncompare_20 {
	public static void main(String[] args)
	{
		String str1 = "Java";
		String str2 = "Database";
		CharSequence cs = "Java";
		System.out.println("Comparing '"+str1+"'"+" and '"+cs+"' : " + str1.contentEquals(cs));
		System.out.println("Comparing '"+str2+"'"+" and '"+cs+"' :"+ str2.contentEquals(cs));
	}

}
