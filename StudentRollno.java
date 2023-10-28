package assigment;

import java.util.Scanner;

class AgeNotWithinRangeException extends Exception {
 public AgeNotWithinRangeException(String message) {
     super(message);
 }
}

class NameNotValidException extends Exception {
 public NameNotValidException(String message) {
     super(message);
 }
}


class Student {
 private int rollNo;
 private String name;
 private int age;
 private String course;

 public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
     if (age < 15 || age > 21) {
         throw new AgeNotWithinRangeException("Age is not within the valid range (15-21)");
     }

     if (!isValidName(name)) {
         throw new NameNotValidException("Name contains numbers or special symbols");
     }

     this.rollNo = rollNo;
     this.name = name;
     this.age = age;
     this.course = course;
 }

 private boolean isValidName(String name) {
    
     return name.matches("^[a-zA-Z ]+$");
 }

 public int getRollNo() {
     return rollNo;
 }

 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }

 public String getCourse() {
     return course;
 }
}

public class StudentRollno {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     try {
         System.out.print("Enter Roll No: ");
         int rollNo = scanner.nextInt();
         scanner.nextLine(); 

         System.out.print("Enter Name: ");
         String name = scanner.nextLine();

         System.out.print("Enter Age: ");
         int age = scanner.nextInt();
         scanner.nextLine(); 

         System.out.print("Enter Course: ");
         String course = scanner.nextLine();

         Student student = new Student(rollNo, name, age, course);
         System.out.println("Student created successfully:");
         System.out.println("Roll No: " + student.getRollNo());
         System.out.println("Name: " + student.getName());
         System.out.println("Age: " + student.getAge());
         System.out.println("Course: " + student.getCourse());
     } catch (AgeNotWithinRangeException e) {
         System.out.println("AgeNotWithinRangeException: " + e.getMessage());
     } catch (NameNotValidException e) {
         System.out.println("NameNotValidException: " + e.getMessage());
     } catch (Exception e) {
         System.out.println("An error occurred: " + e.getMessage());
     } finally {
         scanner.close();
     }
 }
}
