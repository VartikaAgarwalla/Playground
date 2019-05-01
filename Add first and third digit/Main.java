import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
            Scanner in = new Scanner(System.in);
               int n=in.nextInt();
     int rem=n%10;
      int quo=n/100;
      System.out.print(rem+quo);
      
	}
}