import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int list[] = new int[n];
for(int index = 0; index < n; index++)
{
list[index] = sc.nextInt();
}
perfect_batch(list, n);
}

public static void perfect_batch(int list[], int n)
{
  int max =0;
if(list[0]>list[1])
{
   max=0;
}
  else 
  {
     max=1;
  }
  
for(int index = 2; index <= n-1; index ++) {
  
if(list[index]>list[max])
{
  max=index;
}
}
  System.out.print(max);
}
}
  