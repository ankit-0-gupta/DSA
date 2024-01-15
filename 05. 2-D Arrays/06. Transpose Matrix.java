https://leetcode.com/problems/transpose-matrix/


class Solution 
{
    public int[][] transpose(int[][] matrix)
    {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] transpose = new int[n][m];
        for(int row = 0; row < m; row++)
        {
            for(int col = 0; col < n; col++)
            {
                transpose[col][row] = matrix[row][col];
            }
        }
        return transpose;
    }
}
