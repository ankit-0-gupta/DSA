https://www.geeksforgeeks.org/problems/decimal-to-any-base-conversion2440/1


class Solution
{
    static char getCharacter(int n)
    {
        if(n < 10) return (char)(n + '0');
        if(n == 10) return 'A';
        if(n == 11) return 'B';
        if(n == 12) return 'C';
        if(n == 13) return 'D';
        if(n == 14) return 'E';
        return 'F';
    }
    
    static String getNumber(int B, int N)
    {
        StringBuilder sb = new StringBuilder();
        while(N != 0)
        {
            char remainder = getCharacter(N % B);
            sb.append(remainder);
            N /= B;
        }
        return sb.reverse().toString();
    }
}
