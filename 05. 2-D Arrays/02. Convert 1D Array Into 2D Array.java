https://leetcode.com/problems/convert-1d-array-into-2d-array/description/


class Solution
{
    public int[][] construct2DArray(int[] original, int m, int n)
    {
        // Approach 1.

        // if(original.length != m * n)
        // {
        //     return new int[0][0];
        // }
        // int idx = 0;
        // int[][] mat = new int[m][n];
        // for(int row = 0; row < m; row++)
        // {
        //     for(int col = 0; col < n; col++)
        //     {
        //         mat[row][col] = original[idx++];
        //     }
        // }
        // return mat;


        // Approach 2.

        if(original.length != m * n)
        {
            return new int[0][0];
        }
        int[][] mat = new int[m][n];
        for(int idx = 0; idx < original.length; idx++)
        {
            int row = idx / n;
            int col = idx % n;
            mat[row][col] = original[idx];
        }
        return mat;
    }
}
