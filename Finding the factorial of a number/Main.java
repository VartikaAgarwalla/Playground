import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
        int num = in.nextInt();
      	System.out.println(fact(num));
    }
    public static int fact(int num)
    {
      if(num == 0)
      return 1;
      else
      return num*fact(num -1);
  }
}