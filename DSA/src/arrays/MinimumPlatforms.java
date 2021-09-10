package arrays;
import java.util.*;
public class MinimumPlatforms 
{
	static int findPlatform(int arr[], int dep[], int n)
    {
        // Sort arrays first
        Arrays.sort(arr);
        Arrays.sort(dep);
        int curr=1,res=1;
        int i=1,j=0;
        while(i<n && j<n)
        {
            if(arr[i]<=dep[j])
            {
                curr++;
                i++;
            }
            else if(arr[i]>dep[j])
            {
                curr--;
                j++;
            }
            
            if(curr>res)
            {
                res=curr;
            }
        }
        return res;
    }
}

//Time Complexity : O(n)

/*
Example 1:
Input: n = 6 
arr[] = {0900, 0940, 0950, 1100, 1500, 1800}
dep[] = {0910, 1200, 1120, 1130, 1900, 2000}
Output: 3
Explanation: 
Minimum 3 platforms are required to 
safely arrive and depart all trains.

Example 2:
Input: n = 3
arr[] = {0900, 1100, 1235}
dep[] = {1000, 1200, 1240}
Output: 1
Explanation: Only 1 platform is required to 
safely manage the arrival and departure 
of all trains. 
 */
