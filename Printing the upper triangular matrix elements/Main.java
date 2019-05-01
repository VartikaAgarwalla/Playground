import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   
        Scanner in = new Scanner(System.in);
        
        int r = in.nextInt();
        int c = in.nextInt();
    
        int a[][] = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                a[i][j] = in.nextInt();
            }
          
        }
    matrix(r,c, a);
  }

  
    public static void matrix(int r,int c,int[][]a)
    {
      for(int z=0;z<c;z++)
      {int x=0;
        for(int y=z;y<c;y++)
        {
          
          {
          System.out.print(a[x][y]+" ");
          }
          x++;
        }
      }
    }
}
