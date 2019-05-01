import java.util.Scanner;
class Main {
	public static void main (String[] args){
	      Scanner in  = new Scanner(System.in);
	    int n = in.nextInt();
      int sum = 0;
        // Repeatedly remove last digit until it reaches the second digit
		while(n >0)
		{
        int  r= n%10;
          sum = sum+r;
		   n = n / 10;
		}
        // Extract last digit(i.e. second digit)
		
		System.out.print(sum);
	}
}