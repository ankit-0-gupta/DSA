// Sample Input :
// 5
  
// Sample Output :
//     *
//    **
//   ***
//  ****
// *****


import java.io.*;
import java.util.*;
public class Solution 
{
    public static void lowerRightTriangleStarPattern(int n)
    {
        int nsp = n - 1;
        int nst = 1;
        for(int row = 1; row <= n; row++)
        {
            for(int csp = 1; csp <= nsp; csp++)
            {
                System.out.print(" ");
            }
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print("*");
            }
            nsp--;
            nst++;
            System.out.println();
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        lowerRightTriangleStarPattern(n);
    }
}
