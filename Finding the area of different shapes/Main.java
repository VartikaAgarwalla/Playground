import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here Scanner sc =new Scanner(System.in);
     
       Scanner sc =new Scanner(System.in);
      int choice =sc.nextInt();
      switch(choice)
      {
          case 1:
          int side=sc.nextInt();
          double area =side*side;
          System.out.println(area);
          break;
        case 2:
          int l=sc.nextInt();
          int br=sc.nextInt();
          area =l*br;
          System.out.println(area);
          break;
        case 3:
          int b=sc.nextInt();
          int h   = sc.nextInt();
          area=(b*h)/2;
            System.out.println(area);
          break;
           case 4:
          int r =sc.nextInt();
          
         area=(3.14*r*r);
            System.out.println(area);
          break;
        default:
          System.out.print("enter correct choice");
      }
    }
}