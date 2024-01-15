https://www.geeksforgeeks.org/problems/print-matrix-in-snake-pattern-1587115621/1


class Solution
{
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        ArrayList<Integer> al = new ArrayList<>();
        for(int row = 0; row < matrix.length; row++)
        {
            if(row % 2 == 0)
            {
                for(int col = 0; col < matrix[0].length; col++)
                {
                    al.add(matrix[row][col]);
                }
            }
            else
            {
                for(int col = matrix[0].length - 1; col >= 0; col--)
                {
                    al.add(matrix[row][col]);
                }
            }
        }
        return al;
    }
}
