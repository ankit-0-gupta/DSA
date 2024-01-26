// Backward Slash Star Pattern.

// Sample Input : 
// 6
    
// Sample Output :
// *
//  *
//   *
//    *
//     *
//      *


import java.util.*;
public class Main 
{
    public static void backwardSlashSecondApproach(int n)
    {
        for(int row = 1; row <= n; row++)
        {
            for(int col = 1; col <= row; col++)
            {
                if(row == col)
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
    
    public static void backwardSlashFirstApproach(int n)
    {
        int nsp = 0;
        for(int row = 1; row <= n; row++)
        {
            for(int csp = 1; csp <= nsp; csp++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            nsp++;
            System.out.println();
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        backwardSlashFirstApproach(n);
        System.out.println();
        backwardSlashSecondApproach(n);
    }
}
