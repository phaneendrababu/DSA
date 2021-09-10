package arrays;

public class RearrageArray {
	
	public static void rearrange(int arr[], int n)
	{
        int max_ele=arr[n-1]+1;
        int min_index=0;
        int max_index=n-1;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                arr[i]+=(arr[max_index]%max_ele)*max_ele;
                max_index--;
            }
            else
            {
                arr[i]+=(arr[min_index]%max_ele)*max_ele;
                min_index++;
            }
        }
        for(int i=0;i<n;i++)
        {
            arr[i]/=max_ele;
        }
    }
}
// Time Complexiy : O(n)

// Note: Modulo operation is the main trick here
/*
Example 1:
Input:
N = 6
arr[] = {1,2,3,4,5,6}
Output: 6 1 5 2 4 3
Explanation: Max element = 6, min = 1, 
second max = 5, second min = 2, and 
so on... Modified array is : 6 1 5 2 4 3.

Example 2:
Input:
N = 11
arr[]={10,20,30,40,50,60,70,80,90,100,110}
Output:110 10 100 20 90 30 80 40 70 50 60
Explanation: Max element = 110, min = 10, 
second max = 100, second min = 20, and 
so on... Modified array is : 
110 10 100 20 90 30 80 40 70 50 60.
 */
