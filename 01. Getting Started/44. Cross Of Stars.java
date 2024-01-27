// Cross Of Stars.

// Sample Input :
// 5

// Sample Output :
// *   *
//  * *
//   *
//  * *
// *   *


import java.util.*;
public class Main 
{
    public static void crossOfStarsSecondApproach(int n)
    {
        for(int row = 1; row <= n; row++)
        {
            for(int col = 1; col <= n; col++)
            {
                if((row == col) || (row + col == n + 1))
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
    
    public static void crossOfStarsFirstApproach(int n)
    {
        int nspO = 0;
        int nspI = n - 2;
        for(int row = 1; row <= n; row++)
        {
            for(int cspO = 1; cspO <= nspO; cspO++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int cspI = 1; cspI <= nspI; cspI++)
            {
                System.out.print(" ");
            }
            if(row != n / 2 + 1)
            {
                System.out.print("*");                
            }
            if(row <= n / 2)
            {
                nspO++;
                nspI -= 2;
            }
            else
            {
                nspO--;
                nspI += 2;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        crossOfStarsFirstApproach(n);
        System.out.println();
        crossOfStarsSecondApproach(n);
    }
}
