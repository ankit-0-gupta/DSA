https://www.geeksforgeeks.org/problems/binary-representation5003/1


class Solution
{
    static String getBinaryRep(int N)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 30; i++)
        {
            sb.append(N & 1);
            N = N >> 1;
        }
        return sb.reverse().toString();
    }
}
