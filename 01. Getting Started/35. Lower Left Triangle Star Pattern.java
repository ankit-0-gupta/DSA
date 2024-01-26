// Lower Left Triangle Star Pattern.

// Sample Input :
// 5
  
// Sample Output :
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 


import java.io.*;
import java.util.*;
public class Solution 
{
    public static void lowerLeftTriangleStarPattern(int n)
    {
        int nst = 1;
        for(int row = 1; row <= n; row++)
        {
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print("* ");
            }
            nst++;
            System.out.println();
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        lowerLeftTriangleStarPattern(n);
    }
}
