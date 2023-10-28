package assigment;



abstract class Marks {
 abstract double getPercentage();
}


class A extends Marks {
 private double subject1;
 private double subject2;
 private double subject3;

 A(double subject1, double subject2, double subject3) {
     this.subject1 = subject1;
     this.subject2 = subject2;
     this.subject3 = subject3;
 }

 @Override
 double getPercentage() {
     double totalMarks = subject1 + subject2 + subject3;
     double percentage = (totalMarks / 300) * 100;
     return percentage;
 }
}


class B extends Marks {
 private double subject1;
 private double subject2;
 private double subject3;
 private double subject4;

 B(double subject1, double subject2, double subject3, double subject4) {
     this.subject1 = subject1;
     this.subject2 = subject2;
     this.subject3 = subject3;
     this.subject4 = subject4;
 }

 @Override
 double getPercentage() {
     double totalMarks = subject1 + subject2 + subject3 + subject4;
     double percentage = (totalMarks / 400) * 100;
     return percentage;
 }
}

public class Main {
 public static void main(String[] args) {
    
     A studentA = new A(85, 90, 78);
     B studentB = new B(75, 88, 92, 79);

    
     System.out.println("Percentage of marks for StudentRollno A: " + studentA.getPercentage());
     System.out.println("Percentage of marks for StudentRollno B: " + studentB.getPercentage());
 }
}
