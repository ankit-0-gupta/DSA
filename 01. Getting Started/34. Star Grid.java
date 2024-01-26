// Sample Input 1 :
// 3 4

// Sample Output 1 : 
// ****
// ****
// ****

// Sample Input 2 :
// 5 6

// Sample Output 2 : 
// ******
// ******
// ******
// ******
// ******


import java.util.*;
public class Main 
{
    public static void starGrid(int rows, int cols)
    {
        int nst = cols;
        for(int row = 1; row <= rows; row++)
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
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        starGrid(rows, cols);
    }
}
