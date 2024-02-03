// Max Min.

// https://www.interviewbit.com/problems/max-min-05542f2f-69aa-4253-9cc7-84eb7bf739c4/


public class Solution
{
    public int solve(int[] A) 
    {
        // // Approach 1.
        // int maximum = -(int)1e9;
        // int minimum = (int)1e9;
        // for(int i = 0; i < A.length; i++)
        // {
        //     if(maximum < A[i])
        //     {
        //         maximum = A[i];
        //     }
        //     if(minimum > A[i])
        //     {
        //         minimum = A[i];
        //     }
        // }
        // return maximum + minimum;
        
        
        // Approach 2.
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        for(int elements : A)
        {
            maximum = Math.max(maximum, elements);
            minimum = Math.min(minimum, elements);
        }
        return maximum + minimum;
    }
}
