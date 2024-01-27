// Play With Pattern.

// https://www.codingninjas.com/studio/problems/number-x_893302


import java.util.*;
import java.io.*;
public class Solution
{
    public static void ninjaPattern(int n)
    {
        n = 2 * n - 1;
        int nspO = 0;
        int nspI = n - 2;
        for(int row = 1; row <= n; row++)
        {
            for(int cspO = 1; cspO <= nspO; cspO++)
            {
                System.out.print(" ");
            }
            int val = row;
            if(row > n / 2 + 1)
            {
                val = n - row + 1;
            }
            System.out.print(val);
            for(int cspI = 1; cspI <= nspI; cspI++)
            {
                System.out.print(" ");
            }
            if(row != n / 2 + 1)
            {
                System.out.print(val);                
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
}
