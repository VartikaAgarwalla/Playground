import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
     String str2 = scan.nextLine();
         int str1_len = str1.length();
        int str2_len = str2.length();
        // Reverse a given string
    int count=0;
    
        
        
        for(int idx = 0; idx < str1_len -str2_len+1; idx++)
        {
          boolean is_matching =true;
          for(int j=0;j<str2_len;j++)
          {
            
            if(str1.charAt(idx+j)!= str2.charAt(j))
            {
              
                is_matching =false;
        }
        
    }
    // Function to reverse a string
          if(is_matching ==true)
          {
            
            count++;
          }
        }
    System.out.println(count);
  }
 
}