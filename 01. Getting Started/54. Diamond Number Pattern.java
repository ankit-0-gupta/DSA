// Diamond Number Pattern.

// Sample Input :
// 7

// Sample Output :
//    1
//   232
//  34543
// 4567654
//  34543
//   232
//    1


import java.util.*;
public class Main
{
    public static void diamondNumberPattern(int n)
    {
        int nsp = n / 2;
        int nst = 1;
        for(int row = 1; row <= n; row++)
        {
            for(int csp = 1; csp <= nsp; csp++)
            {
                System.out.print(" ");
            }
            int val = row;
            if(row > n / 2 + 1)
            {
                val = n - row + 1;
            }
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print(val);
                if(cst <= nst / 2)
                {
                    val++;
                }
                else
                {
                    val--;
                }
            }
            if(row <= n / 2)
            {
                nsp--;
                nst += 2;
            }
            else
            {
                nsp++;
                nst -= 2;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args)
    {
        Scanner scn =  new Scanner(System.in);
        int n = scn.nextInt();
        diamondNumberPattern(n);
    }
}
