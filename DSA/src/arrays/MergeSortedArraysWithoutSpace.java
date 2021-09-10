package arrays;

import java.util.*;
public class MergeSortedArraysWithoutSpace 
{
	public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        int i=0,j=0,k=n-1;
        while(i<=k && j<=m-1)
        {
            if(arr1[i]<arr2[j])
            {
                i++;
            }
            else
            {
                long temp=arr1[k];
                arr1[k]=arr2[j];
                arr2[j]=temp;
                k--;
                j++;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}

// The purpose of the while loop is to seggregate the first n and last m elements of final result

// Time Complexity : O(nlogn + mlogm)

/*
Example 1:
Input: 
n = 4, arr1[] = [1 3 5 7] 
m = 5, arr2[] = [0 2 6 8 9]
Output: 
arr1[] = [0 1 2 3]
arr2[] = [5 6 7 8 9]
Explanation:
After merging the two 
non-decreasing arrays, we get, 
0 1 2 3 5 6 7 8 9.

Example 2:
Input: 
n = 2, arr1[] = [10, 12] 
m = 3, arr2[] = [5 18 20]
Output: 
arr1[] = [5 10]
arr2[] = [12 18 20]
Explanation:
After merging two sorted arrays 
we get 5 10 12 18 20
 */
