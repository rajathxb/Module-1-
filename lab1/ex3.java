package lab1;

import java.util.Scanner;

//  Create a method to check if a number is an increasing number

public class ex3 {
	public static void main(String[] args) {
		int num;
	       boolean flag = false;

	       try (Scanner scanner = new Scanner(System.in)) {
			//3
			   System.out.println("Enter a number : ");
			   num = scanner.nextInt();
		}

	       //4
	       int currentDigit = num % 10;
	       num = num/10;

	       //5
	       while(num>0){
	           //6
	           if(currentDigit <= num % 10){
	               flag = true;
	               break;
	           }

	           currentDigit = num % 10;
	           num = num/10;
	       }

	       //7
	       if(flag){
	           System.out.println("Digits are not in increasing order.");
	       }else{
	           System.out.println("Digits are in increasing order.");
	       }

}
}