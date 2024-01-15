https://www.geeksforgeeks.org/problems/addition-of-two-square-matrices4916/1


class Solution
{
    public void Addition(int[][] matrixA, int[][] matrixB)
    {
        for(int row = 0; row < matrixA.length; row++)
        {
            for(int col = 0; col < matrixA[0].length; col++)
            {
                matrixA[row][col] += matrixB[row][col];
            }
        }
    }
}
