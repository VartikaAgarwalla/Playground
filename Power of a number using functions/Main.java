import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int base =in.nextInt();
      int expo = in.nextInt();
      int pow1=power(base,expo);
      System.out.println(pow1);
    }
  public static int power(int a,int b)
  {
    int result =1;
    while(b!=0)
    {
      result*=a;
      --b;
    }
      return result;
    
  }
}
      
      
      