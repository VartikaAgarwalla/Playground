import java.util.Scanner;
class Main
{
  public static int square(int a)
  {
    int sq=a*a;
    return sq;
  }
	public static void main (String[] args)
    {
      Scanner in =new Scanner(System.in);
      int n = in.nextInt();
      int sqr1=square(n);
      System.out.print(sqr1);
        
	 // Type your code here   
	} 
}