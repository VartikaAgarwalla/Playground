import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		 Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int digit =0;
        int m=n;
      while(n>0)
      {
        n=n/10;
      digit++;
      }
      int rem=m/10;
     int quo=rem%10;
      System.out.print(quo);
      
   
       
    }
}