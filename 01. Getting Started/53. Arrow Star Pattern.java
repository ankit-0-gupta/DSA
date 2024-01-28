// Arrow Star Pattern.

// Sample Input :
// 5

// Sample Output :
//   *
//   **
// *****
//   **
//   *


import java.util.*;
public class Main
{
    public static void arrowPattern(int n)
    {
        int nsp = n / 2;
        int nst = 1;
        for(int row = 1; row <= n; row++)
        {
            for(int csp = 1; csp <=nsp; csp++)
            {
                if(row == n / 2 + 1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print("*");
            }
            if(row <= n / 2)
            {
                nst++;
            }
            else
            {
                nst--;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args)
    {
        Scanner scn =  new Scanner(System.in);
        int n = scn.nextInt();
        arrowPattern(n);
    }
}
