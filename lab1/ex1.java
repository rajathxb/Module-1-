package lab1;

// Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5.
public class ex1 {
	// Calculates Sum
	static int calculateSum(int n, int X, int Y)
    {
        int S1, S2, S3;
     
        S1 = ((n / X)) * (2 * X + (n / X - 1) * X) / 2;
        S2 = ((n / Y)) * (2 * Y + (n / Y - 1) * Y) / 2;
        S3 = ((n / (X * Y))) * (2 * (X * Y)
                          + (n / (X * Y) - 1) * (X * Y))/ 2;
     
        return S1 + S2 - S3;
    }
     
    // Driver code
    public static void main(String []args)
    {
        int n = 10 ;
        int X = 3, Y = 5;
     
        System.out.println(calculateSum(n, X, Y));
     
    }
   
}
