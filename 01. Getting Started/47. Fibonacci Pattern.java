// Fibonacci Pattern.
    
// Sample Input : 
// 4
    
// Sample Output :
// 0
// 1   1
// 2   3   5
// 8   13  21  34
    

import java.util.*;
public class Main
{
    public static void fibonacciPattern(int n)
    {
        int nst = 1;
        int first = 0;
        int second = 1;
        for(int row = 1; row <= n; row++)
        {
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print(first + "\t");
                int sum = first + second;
                first = second;
                second = sum;
            }
            nst++;
            System.out.println();
        }
    }
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        fibonacciPattern(n);
    }
}
