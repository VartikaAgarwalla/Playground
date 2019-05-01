import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx <= n - 1; idx++){
            arr[idx] = sc.nextInt();
        }
        int left = 0;
        /* Check whether the 'value' is present in the given array
           If it is true, then reset 'is_found' value as false
           and stop your searching for the particular value.
           Otherwise, search till the end of an array
           If it is not existing, then store the 'value' in a variable'missing_val'
           and stop your searching further.
         */
      int right =n-1;
      boolean is_pallindrome =true;
while(left<=right)

        {
           
                if(arr[left] != arr[right])
                {
                    is_pallindrome = false;
                    break;
                }
  left++;
  right--;
            }
            if(is_pallindrome == true){
                System.out.print("Yes");
            }
      else
      {
        System.out.print("No");
            }
        }
    }
