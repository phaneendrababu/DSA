package arrays;

import java.util.*;
public class ChocolateDistribution 
{
	public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        // your code here
        int nc=(int)n;
        int mc=(int)m;
        int arr[]=new int[nc];
        int i=0;
        for(Long num:a)
        {
            arr[i++]=(int)(long)num;
        }
        Arrays.sort(arr);
        i=0;
        int j=mc-1;
        long minDiff=arr[j]-arr[i];
        for(i=1;i<=nc-mc;i++)
        {
            j=i+mc-1;
            if((arr[j]-arr[i])<minDiff)
            {
                minDiff=arr[j]-arr[i];
            }
        }
        return minDiff;
    }
}

// Note: Trick is to sort the array
// Time Complexity : O(n*logn)

/*
Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are M students, the task is to distribute chocolate packets among M students such that :
1. Each student gets exactly one packet.
2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.

Example 1:
Input:
N = 8, M = 5
A = {3, 4, 1, 9, 56, 7, 9, 12}
Output: 6
Explanation: The minimum difference between 
maximum chocolates and minimum chocolates 
is 9 - 3 = 6 by choosing following M packets :
{3, 4, 9, 7, 9}.

Example 2:
Input:
N = 7, M = 3
A = {7, 3, 2, 4, 9, 12, 56}
Output: 2
Explanation: The minimum difference between
maximum chocolates and minimum chocolates
is 4 - 2 = 2 by choosing following M packets :
{3, 2, 4}.
 */
