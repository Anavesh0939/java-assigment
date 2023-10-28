
package assigment;

abstract class parent {
	 abstract void message();
}

class firstsubclass extends parent {
	 void message() {
		 System.out.println("this is first subclass");
	 }
}

class secondsubclass extends parent {
	 void message() {
		 System.out.println("this is second subclass");
	 }
}

public class twosubclass{
	public static void main(String[] args) {
		firstsubclass fsc = new firstsubclass();
		secondsubclass ssc = new secondsubclass();
		
		fsc.message();
		ssc.message();
	}

}