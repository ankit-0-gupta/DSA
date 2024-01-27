// W Star Pattern.

// Sample Input :
// 5

// Sample Output :
// *   *
// *   *
// * * *
// ** **
// *   *


import java.util.*;
public class Main
{
    public static void wStarPattern(int n)
    {
        for(int row = 1; row <= n; row++)
        {
            for(int col = 1; col <= n; col++)
            {
                if(col == 1 || col == n)
                {
                    System.out.print("*");
                }
                else if(row > n / 2 && (row + col == n + 1 || row == col))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
  
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        wStarPattern(n);
    }
}
