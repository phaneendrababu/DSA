package arrays;

public class EqulBriumPoint 
{
	public static int equilibriumPoint(long arr[], int n) 
	{
        long sum=0;
        long left_sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            sum=sum-arr[i];
            if(left_sum==sum)
            {
                return i+1;
            }
            left_sum=left_sum+arr[i];
        }
        return -1;
    }
	
}

// Time Complexity : O(n)

/*
Example 1:
Input:
n = 1
A[] = {1}
Output: 1
Explanation:
Since its the only element hence
its the only equilibrium point. 

Example 2:
Input:
n = 5
A[] = {1,3,5,2,2}
Output: 3
Explanation: For second test case 
equilibrium point is at position 3 
as elements before it (1+3) = 
elements after it (2+2).
*/
 