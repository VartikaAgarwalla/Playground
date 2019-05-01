import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
        Scanner in = new Scanner(System.in);
      int n =in.nextInt();
      int m= n;
      int count =0;
      
      while(n>0)
      {
        int r=n%10;
      int sum=1;
      for(int i=1;i<=r;i++)
      {
        sum=sum*i;
      }
        count=count+sum;
        n=n/10;
        
	}
if(count==m)
{
System.out.println("Yes");
}
      else
      {
        System.out.println("No");
      }
    }
}