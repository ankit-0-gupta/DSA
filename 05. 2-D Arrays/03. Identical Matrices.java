https://www.geeksforgeeks.org/problems/identical-matrices1042/1


class Solution 
{
    int areMatricesIdentical(int N, int[][] Grid1, int[][] Grid2)
    {
        for(int row = 0; row < N; row++)
        {
            for(int col = 0; col < N; col++)
            {
                if(Grid1[row][col] != Grid2[row][col])
                {
                    return 0;
                }
            }
        }
        return 1;
    }
}
