import java.util.Scanner;
class Main{
	public static void main (String[] args){
      
	    Scanner in = new Scanner(System.in);
	    int n1 = in.nextInt();
	    int n2 = in.nextInt();
	    int n3 = in.nextInt();
	    int result = gcd_of_2_numbers(n1, n2);// Function call
	    System.out.print(gcd_of_2_numbers(n1, n2));// Function call
	}
	// Function to find the gcd of 2 numbers
	public static int gcd_of_2_numbers(int num1, int num2)
	{
	    
	    if(num1 < num2)
	    {
	   return num2;
	    }
	    else{
	        return num1;
	    }
	    
	    // Type your code here
	}
}