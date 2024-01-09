https://www.geeksforgeeks.org/problems/convert-from-any-base-to-decimal3736/1


class Solution
{
    static int getInteger(char ch)
    {
        if(ch >= '0' && ch <= '9')
        {
            return ch - '0';
        }
        return ch - 55;
    }
    
    static int decimalEquivalent(String N, int b)
    {
        int power = 1;
        int answer = 0;
        for(int i = N.length() - 1; i >= 0; i--)
        {
            char ch = N.charAt(i);
            int val = getInteger(ch);
            if(val >= b)
            {
                return -1;
            }
            answer += (val * power);
            power *= b;
        }
        return answer;
    }
}
