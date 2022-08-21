package lab5;

import java.util.Scanner;

@SuppressWarnings("serial")
class AgeException extends Exception {
 
 public AgeException(String str) {
  System.out.println(str);
 }
}
public class ex5 {

 public static void main(String[] args) {
  try (Scanner s = new Scanner(System.in)) {
	System.out.print("Enter ur age : ");
	  int age = s.nextInt();
	  
	  try {
	   if(age < 18) 
	    throw new AgeException("Invalid age");
	   else
	    System.out.println("Valid age");
	  }
	  catch (AgeException a) {
	   System.out.println(a);
	  }
  	}
 }
}