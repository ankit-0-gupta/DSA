// Pattern Printing.

// https://www.geeksforgeeks.org/problems/pattern-printing1347/1


class Solution
{
    static void printPattern(int N)
    {
        String str = "*";
        for(int i = 1; i <= N; i++)
        {
            System.out.print(str + " ");
            str += "*";
        }
    }
}
