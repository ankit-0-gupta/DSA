// Valid Mountain Array.

// https://leetcode.com/problems/valid-mountain-array/


class Solution 
{
    public boolean validMountainArray(int[] arr) 
    {
        if(arr.length < 3) return false;
        int idx = 0; 

        // Increasing Part.
        while(idx + 1 < arr.length)
        {
            if(arr[idx] == arr[idx + 1])
            {
                return false;
            }
            else if(arr[idx] > arr[idx + 1])
            {
                break;
            }
            idx++;
        }

        // No Decreasing Part.
        if(idx == arr.length - 1) return false;

        // No Increasing Part.
        if(idx == 0) return false;
    
        // Decreasing Part.
        while(idx + 1 < arr.length)
        {
            if(arr[idx] == arr[idx + 1])
            {
                return false;
            }
            else if(arr[idx] < arr[idx + 1])
            {
                break;
            }
            idx++;
        }
        
        return (idx == arr.length - 1);
    }
}
