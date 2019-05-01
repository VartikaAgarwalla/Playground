import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner sc =new Scanner(System.in);
      int base =sc.nextInt();
      int exponent=sc.nextInt();
      int pow =1;int count =0;
      while(count<exponent)
      {
        pow =pow*base;
        count++;
      }
      System.out.println(pow);
    }
        
    }
