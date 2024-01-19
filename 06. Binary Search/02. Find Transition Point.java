// https://www.geeksforgeeks.org/problems/find-transition-point-1587115620/1


class Solution 
{
    int transitionPoint(int arr[], int n) 
    {
        if(arr[n - 1] == 0)
        {
            return -1;
        }
        if(arr[0] == 1)
        {
            return 0;
        }
      
        int left = 0;
        int right = n - 1;
        while(left <= right)
        {
            int mid = (left + right) / 2;
            if(arr[mid] == 0)
            {
                left = mid + 1;
            }
            else if(arr[mid] == 1)
            {
                right = mid - 1;
            }
        }
        return left;
    }
}
