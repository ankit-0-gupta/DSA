// Maximum Product of Two Elements in an Array.

// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/


class Solution 
{
    public int maxProduct(int[] nums) 
    {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // int smallest = Integer.MAX_VALUE;
        // int secondSmallest = Integer.MAX_VALUE;

        for(int idx = 0; idx < nums.length; idx++)
        {
            if(largest <= nums[idx])
            {
                secondLargest = largest;
                largest = nums[idx];
            }
            else if(secondLargest < nums[idx])
            {
                secondLargest = nums[idx];
            }

            // if(smallest >= nums[idx])
            // {
            //     secondSmallest = smallest;
            //     smallest = nums[idx];
            // }
            // else if(secondSmallest > nums[idx])
            // {
            //     secondSmallest = nums[idx];
            // }
        }
        return (largest - 1) * (secondLargest - 1);
    }
}
