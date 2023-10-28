package assigment;



class parentclass{
	public void printparent() {
		System.out.println("This is parent class");
	}
}

class childclass extends parentclass{
	public void printchild() {
		System.out.println("This is child class");
	}
}


public class subclass {
	
	       public static void main(String[] args) {
			parentclass po = new parentclass();
			childclass co = new childclass();
			
			po.printparent();
			co.printchild();
			co.printparent();
		}

	}

