// https://www.codingninjas.com/studio/problems/give-me-triangle_893275


import java.util.*;
public class Solution
{
	public static void upperRightTriangleStarPattern(int n)
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
				System.out.print("*");
			}
			nsp++;
			nst--;
			System.out.println();
		}
	}

	public static void main(String[] args)  
	{
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 1; i <= t; i++)
		{
			int n = scn.nextInt();
			upperRightTriangleStarPattern(n);
		}
	}
}
