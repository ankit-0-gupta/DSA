https://www.geeksforgeeks.org/problems/transpose-of-matrix-1587115621/1


class Solution
{
    public void transpose(int n,int a[][])
    {
        for(int row = 0; row < n; row++)
        {
            for(int col = row; col < n; col++)
            {
                int temp = a[row][col]; 
                a[row][col] = a[col][row];
                a[col][row] = temp;
            }
        }
    }
}
