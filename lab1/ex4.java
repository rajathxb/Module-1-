package lab1;

import java.util.Scanner;

// Create a method to check if a number is a power of two or not

public class ex4 {
	public static void main(String[] args)
	  {
	      boolean checkNumber = true;
	      try (Scanner in = new Scanner(System.in)) {
			System.out.print("Input a number : ");
			  int n = in.nextInt();           
			 {   
			 while(n!=1)
			  {
			    if(n%2!=0)
			      { 
			        checkNumber=! checkNumber;
			        System.out.print(checkNumber);
			        System.exit(0);
			      }
			        n = n / 2;
			  }
			   System.out.print(checkNumber);
			 }
		}
	  }
	         
	}