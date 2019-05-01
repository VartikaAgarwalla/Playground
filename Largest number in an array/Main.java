import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
    int max = 0;
       int str_cnt = in.nextInt();
      int arr[]=new  int[str_cnt];
      for(int idx=0;idx<str_cnt;idx++)
      {
        arr[idx] =in.nextInt();
      }
      
      if(arr[0]>arr[1])
      {
        max=arr[0];
      }
      else
      {
        max=arr[1];
      }
       for(int idx=2;idx<str_cnt;idx++)
      {
        if( max<arr[idx])
           {
             max=arr[idx];
           }
       }
      System.out.print(max);
      
           
      }
      
      
    }
