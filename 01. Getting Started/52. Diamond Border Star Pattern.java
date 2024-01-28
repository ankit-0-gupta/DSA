// Diamond Border Star Pattern.

// Sample Input :
// 7

// Sample Output :
//    *
//   * *
//  *   *
// *     *
//  *   *
//   * *
//    *


import java.util.*;
public class Main
{
    public static void diamondBorder(int n)
    {
        int nspO = n / 2;
        int nspI = -1;
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
            if(row != 1 && row != n)
            {
                System.out.print("*");                
            }
            if(row <= n / 2)
            {
                nspO--;
                nspI += 2;
            }
            else
            {
                nspO++;
                nspI -= 2;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args)
    {
        Scanner scn =  new Scanner(System.in);
        int n = scn.nextInt();
        diamondBorder(n);
    }
}
