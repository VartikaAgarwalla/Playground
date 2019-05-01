import java.util.Scanner;
class Main{   // Type your code here
      public static int sum(int a)
  { int sum=0;
        for(int i=1;i<=a;i++)
        {
         
          sum=sum+i;
          
        }return sum;
   
  }
	
	public static void main (String[] args)
    {
      Scanner in =new Scanner(System.in);
      int n = in.nextInt();
      int sqr1=sum(n);
      System.out.print(sqr1);
        
	}
}