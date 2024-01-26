// Forward Slash Star Pattern.

// Sample Input : 
// 6
    
// Sample Output :
//      *
//     *
//    *
//   *
//  *
// *


import java.util.*;
public class Main 
{
    public static void forwardSlashSecondApproach(int n)
    {
        for(int row = 1; row <= n; row++)
        {
            for(int col = 1; col <= n; col++)
            {
                if(row + col == n + 1)
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
    
    public static void forwardSlashFirstApproach(int n)
    {
        int nsp = n - 1;
        for(int row = 1; row <= n; row++)
        {
            for(int csp = 1; csp <= nsp; csp++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            nsp--;
            System.out.println();
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        forwardSlashFirstApproach(n);
        System.out.println();
        forwardSlashSecondApproach(n);
    }
}
