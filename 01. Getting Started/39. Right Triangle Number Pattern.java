// Right Triangle Number Pattern.

// Sample Input : 
// 5

// Sample Output :
// 1
// 23
// 345
// 4567
// 56789


import java.util.*;
public class Main 
{
    public static void rightTriangleNumberPattern(int n)
    {
        int nst = 1;
        for(int row = 1; row <= n; row++)
        {
            int val = row;
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print(val++);
            }
            nst++;
            System.out.println();
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        rightTriangleNumberPattern(n);
    }
}
