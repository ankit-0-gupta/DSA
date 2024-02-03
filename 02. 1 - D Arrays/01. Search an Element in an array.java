// Search an Element in an array.

// https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1


class Solution
{
    static int search(int arr[], int N, int X)
    {
        int foundAtIndex = -1;
        for(int i = 0; i < N; i++)
        {
            if(arr[i] == X)
            {
                foundAtIndex = i;
                break;
            }
        }
        return foundAtIndex;
    }
}
