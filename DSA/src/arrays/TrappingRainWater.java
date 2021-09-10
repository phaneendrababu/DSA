package arrays;

public class TrappingRainWater 
{
	public int trap(int[] heights) 
    {
        int result=0;
        int n=heights.length;
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=heights[0];
        right[n-1]=heights[n-1];
        
        /* Find the leftMax and RightMax of each element and 
          if that maximum is greater than heights[i] then update*/
        for(int i=1;i<n-1;i++)
        {
            left[i]=Math.max(left[i-1],heights[i]);
        }
        
        for(int i=n-2;i>=1;i--)
        {
            right[i]=Math.max(right[i+1],heights[i]);
        }
        
        for(int i=1;i<n-1;i++)
        {
            result+=Math.min(left[i],right[i])-heights[i];
        }
        return result;  
    }
}
// Time Complexity: O(n)

/*
Example 1:
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6

Example 2:
Input: height = [4,2,0,3,2,5]
Output: 9
*/
