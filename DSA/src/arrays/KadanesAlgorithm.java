package arrays;

public class KadanesAlgorithm 
{
	//Approach1
	long maxSubarraySumApproach1(int arr[], int n)
	{
        long maxSum=-10000000;
        long curSum=0;
        for(int i=0;i<n;i++)
        {
            curSum=curSum+arr[i];
            if(curSum>maxSum)
            {
                maxSum=curSum;
            }
            if(curSum<0)
            {
                curSum=0;
            }
        }
        return maxSum;
    }
	//Approach2
	int max(int a,int b)
    {
        return ((a>b)?a:b);
    }
    int maxSubarraySumAppraoch2(int arr[], int n)
    {
        
        // Your code here
        int cur_sum=arr[0];
        int maximumSubarraySum=arr[0];
        for(int i=1;i<n;i++)
        {
            cur_sum=max(arr[i],arr[i]+cur_sum);
            maximumSubarraySum=max(cur_sum,maximumSubarraySum);
        }
        return maximumSubarraySum;
    }
}

//Time Complexity O(n)


/*
 
Example 1:
Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which 
is a contiguous subarray.

Example 2:
Input:
N = 4
Arr[] = {-1,-2,-3,-4}
Output:
-1
Explanation:
Max subarray sum is -1 
of element (-1)
 */
