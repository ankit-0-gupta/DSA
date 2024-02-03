// Find First and Last Position of Element in Sorted Array.

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/


class Solution 
{
    public int[] searchRange(int[] nums, int target)
    {
        int firstPosition = -1;
        int lastPosition = -1;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == target)
            {
                lastPosition = i;
                if(firstPosition == -1)
                {
                    firstPosition = i;
                }
            }
        }
        int[] positions = {firstPosition, lastPosition};
        return positions;
    }
}
