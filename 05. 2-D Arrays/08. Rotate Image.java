https://leetcode.com/problems/rotate-image/description/


class Solution 
{
    // Swap (r1, c1) with (r2, c2).
    public void swap(int[][] matrix, int r1, int c1, int r2, int c2)
    {
        int temp = matrix[r1][c1];
        matrix[r1][c1] = matrix[r2][c2];
        matrix[r2][c2] = temp;
    }

    // Reverse each row by using Two Pointer Technique.
    public void reverseRows(int[][] matrix, int n)
    {   
        for(int row = 0; row < n; row++)
        {
            int left = 0;
            int right = n - 1;
            while(left < right)
            {
                // Swap (row, left) with (row, right).
                // int temp = matrix[row][left];
                // matrix[row][left] = matrix[row][right];
                // matrix[row][right] = temp;
                swap(matrix, row, left, row, right);
                left++;
                right--;
            }
        }
    }

    // Transpose.
    public void transpose(int[][] matrix, int n)
    {
        for(int row = 0; row < n; row++)
        {
            for(int col = row; col < n; col++)
            {
                // Swap (row, col) with (col, row).
                // int temp = matrix[row][col];
                // matrix[row][col] = matrix[col][row];
                // matrix[col][row] = temp;
                swap(matrix, row, col, col, row);
            }
        }
    }

    public void rotate(int[][] matrix)
    {
        int n = matrix.length;
        transpose(matrix, n);
        reverseRows(matrix, n);
    }
}
