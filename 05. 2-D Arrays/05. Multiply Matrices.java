https://www.geeksforgeeks.org/problems/multiply-matrices/1


class GfG
{
    public static void multiply(int A[][], int B[][], int C[][], int N)
    {
        for(int row = 0; row < A.length; row++)
        {
            for(int col = 0; col < B[0].length; col++)
            {
                for(int k = 0; k < A[0].length; k++)
                {
                    C[row][col] += (A[row][k] * B[k][col]);
                }
            }
        }
    }
}
