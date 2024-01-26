// Number Pattern.

// Sample Input : 
// 5

// Sample Output :
// 1
// 12
// 123
// 1234
// 12345


import java.util.*;
public class Main 
{
    public static void numberPattern(int n)
    {
        int nst = 1;
        for(int row = 1; row <= n; row++)
        {
            int val = 1;
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
        numberPattern(n);
    }
}
