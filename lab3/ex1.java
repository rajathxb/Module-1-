package lab3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Create a method which accepts an array of integer elements and return the second smallest element in the array

public class ex1 {
	public static int getSecondSmallest(Integer[] a, int total){  
		List<Integer> list=Arrays.asList(a);  
		Collections.sort(list);  
		int element=list.get(1);  
		return element;  
		}  
		public static void main(String args[]){  
		Integer a[]={1,2,5,6,3,2};  
		Integer b[]={44,66,99,77,33,22,55};  
		System.out.println("Second Smallest: "+getSecondSmallest(a,6));  
		System.out.println("Second Smallest: "+getSecondSmallest(b,7));  
		}
		}  