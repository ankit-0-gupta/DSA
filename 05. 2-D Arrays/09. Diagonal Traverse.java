https://leetcode.com/problems/diagonal-traverse/description/


class Solution 
{
    public int[] findDiagonalOrder(int[][] mat)
    {
        int m = mat.length;
        int n = mat[0].length;
        int[] resultant = new int[m * n];
        int idx = 0;
        for(int d = 0; d <= m + n - 2; d++)
        {
            if(d % 2 == 0)
            {
                int row = (d < m) ? d : m - 1;
                int col = (d < m) ? 0 : d - m + 1;
                while(row >= 0 && col < n)
                {
                    resultant[idx++] = mat[row][col];
                    row--;
                    col++;
                }
            }
            else
            {
                int row = (d < n) ? 0 : d - n + 1;
                int col = (d < n) ? d : n - 1;
                while(row < m && col >= 0)
                {
                    resultant[idx++] = mat[row][col];
                    row++;
                    col--;
                }
            }
        }
        return resultant;
    }
}
