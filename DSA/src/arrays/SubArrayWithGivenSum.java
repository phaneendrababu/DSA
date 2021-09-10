package arrays;

import java.util.*;
public class SubArrayWithGivenSum {
	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        int preSum=0;
        int start=0;
        int i;
        for(i=0;i<n;i++)
        {
        	/*If preSum greter than sum then remove elements*/
            while(preSum>s)
            {
                preSum=preSum-arr[start++];
            }
            if(preSum==s)
            {
                break;
            }
            preSum=preSum+arr[i];
        }
        /*If last element is the end point*/
        while(preSum>s)
        {
            preSum=preSum-arr[start++];
        }
        if(preSum==s)
        {
            list.add(start+1);
            list.add(i);
            return list;
        }
        list.add(-1);
        return list;
    }
}

//Time Complexity O(n)

/*
Example 1:
Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.
 

Example 2:
Input:
N = 10, S = 15
A[] = {1,2,3,4,5,6,7,8,9,10}
Output: 1 5
Explanation: The sum of elements 
from 1st position to 5th position
is 15.
 */