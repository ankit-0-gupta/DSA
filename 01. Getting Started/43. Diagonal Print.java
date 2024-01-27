// Diagonal Print.

// Sample Input :
// 5

// Sample Output :
// 0   1   2   3   4   
// 1   2   3   4   5
// 2   3   4   5   6
// 3   4   5   6   7   
// 4   5   6   7   8 

// 0   -1  -2  -3  -4
// 1   0   -1  -2  -3
// 2   1   0   -1  -2
// 3   2   1   0   -1
// 4   3   2   1   0


import java.util.*;
public class Main 
{
    public static void diagonalSecondProperty(int n)
    {
        for(int row = 0; row < n; row++)
        {
            for(int col = 0; col < n; col++)
            {
                System.out.print(row - col + "\t");
            }
            System.out.println();
        }
    }
    
    public static void diagonalFirstProperty(int n)
    {
        for(int row = 0; row < n; row++)
        {
            for(int col = 0; col < n; col++)
            {
                System.out.print(row + col + "\t");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        diagonalFirstProperty(n);
        System.out.println();
        diagonalSecondProperty(n);
    }
}
