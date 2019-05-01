import java.util.Scanner;
class Main{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int a =in.nextInt();
    int pr= prime(a);
  }

	public static int prime(int n)
    {
	    // Type your code here
      for(int i=2;i<=n;i++)
      {
        int count=0;
        for(int j=1;j<=i;j++)
        {
          if(i%j==0)
          {
            ++count;
          }
        }
        if(count==2)
        {
          System.out.println(i);
          
        }
      }
     
  return 0;
    } 
}
  

