https://leetcode.com/problems/base-7/description/


class Solution
{
    public String convertToBase7(int num)
    {
        int power = 1;
        int answer = 0;
        while(num != 0)
        {
            int remainder = num % 7;
            num /= 7;
            answer += (remainder * power);
            power *= 10;
        }    
        // return String.valueOf(answer);
        return Integer.toString(answer);
    }
}
