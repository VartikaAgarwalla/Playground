import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      int k = sc.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx <= n - 1; idx++){
            arr[idx] = sc.nextInt();
        }
       int frq[] = new int[k];
        for(int idx = 0; idx <= k - 1; idx++){
            frq[idx] = 0;
        }
      for(int idx = 0;idx <=n-1;idx++)
      {
        frq[arr[idx]-1]++;
      }
      for(int idx = 0;idx <=k-1;idx++)
      {
        System.out.println((idx+1)+ " "+frq[idx]);
      }
    }
}

      
      
        
        // Sorting the given array and printing the kth largest number
      
   