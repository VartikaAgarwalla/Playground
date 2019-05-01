import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
    
       int str_cnt = in.nextInt();
      int ele__1idx=-1;
      int ele__2idx=-1;
      
      int arr[]=new  int[str_cnt];
      for(int idx=0;idx<str_cnt;idx++)
      {
        arr[idx] =in.nextInt();
      }
       int ele_1 = in.nextInt();
       int ele_2 = in.nextInt();
      for(int idx=0;idx<str_cnt;idx++)
      {
        if(arr[idx] ==ele_1)
        {
          ele__1idx=idx;
        }
      }
        for(int idx=0;idx<str_cnt;idx++)
      {
        if(arr[idx] ==ele_2)
        {
          ele__2idx=idx;
        }
        }
          System.out.println(ele__1idx);
           System.out.println(ele__2idx);
        }
      }
         