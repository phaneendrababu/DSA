package arrays;

public class MinInRotatedArray {
	static int getMin(int a[],int start,int end){
        if (a[start]<a[end] || start==end)
        {
            return a[start];
        }
        int mid=(start+end)/2;
        if(a[mid]>a[mid+1])
        {
            return a[mid+1];
        }
        else if(a[mid]<a[mid-1])
        {
            return a[mid];
        }
        
        if(a[mid]<a[end])
        {
            return getMin(a,start,mid-1);
        }
        else
        {
            return getMin(a,mid+1,end);
        }
    }
    
    public int findMin(int[] nums) 
    {
        int res=getMin(nums,0,nums.length-1);
        return res;
    }
}

// Time Complexity O(logn)

/*
Example 1:
Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.

Example 2:
Input: nums = [4,5,6,7,0,1,2]
Output: 0
Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.

Example 3:
Input: nums = [11,13,15,17]
Output: 11
Explanation: The original array was [11,13,15,17] and it was rotated 4 times. */
