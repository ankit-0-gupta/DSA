// Inverted Pyramid Star Pattern.
    
// Sample Input :
// 6
    
// Sample Output :
// * * * * * * 
//  * * * * * 
//   * * * * 
//    * * * 
//     * * 
//      * 
         

import java.util.*;
public class Main 
{
    public static void invertedPyramidStarPattern(int n)
    {
        int nsp = 0;
        int nst = n;
        for(int row = 1; row <= n; row++)
        {
            for(int csp = 1; csp <= nsp; csp++)
            {
                System.out.print(" ");
            }
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print("* ");
            }
            nsp++;
            nst--;
            System.out.println();
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        invertedPyramidStarPattern(n);
    }
}
