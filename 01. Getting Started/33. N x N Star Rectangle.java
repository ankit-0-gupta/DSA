// Take n as an integer input. Then print nxn star rectangle as mentioned below.
// In each line, n stars should be printed.
// And there should be n such lines.

// Input Format :
// For each test case, n will be given as an integer input.

// Constraints :
// 0 <= n <= 2^31-1
  
// Output Format :
// Print according to the problem statement.
// For reference, look at the test cases below.

// Sample Input 0 :
// 4
  
// Sample Output 0 :
// ****
// ****
// ****
// ****
  
// Sample Input 1 :
// 6
  
// Sample Output 1 :
// ******
// ******
// ******
// ******
// ******
// ******
  
// Sample Input 2 :
// 8
  
// Sample Output 2 :
// ********
// ********
// ********
// ********
// ********
// ********
// ********
// ********
  
// Sample Input 3 :
// 2
  
// Sample Output 3 :
// **
// **
  
// Sample Input 4 :
// 1
  
// Sample Output 4 :
// *


import java.io.*;
import java.util.*;
public class Solution
{
    public static void starRectangle(int n)
    {
        int nst = n;
        for(int row = 1; row <= n; row++)
        {
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print("*");
            }   
            System.out.println();
        }
    }
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        starRectangle(n);
    }
}
