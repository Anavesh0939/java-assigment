package assigment;

public class Quesarearect_27 {
	 static final double PI = Math.PI;
	 
	    
	    void Area(float a)
	    {
	        float A = a * a;
	        System.out.println("Area of the Square: " + A);
	    }
	 
	   
	    void Area(int a, int b)
	    {
	        int A = a * b;
	        System.out.println("Area of the Rectangle: " + A);
	    }
	}
	 
	class GFG {
	 
	    
	    public static void main(String[] args)
	    {
	 
	        
	    	Quesarearect_27 obj = new Quesarearect_27();
	 
	       
	        obj.Area(3);
	        obj.Area(5, 4);
	    }
}
