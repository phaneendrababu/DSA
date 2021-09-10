package arrays;

public class Sort012 
{

	public static void sort012(int a[], int n)
    {
        int low=0,curr=0,high=n-1;
        int temp;
        while(curr<=high)
        {
            if(a[curr]==0)
            {
                temp=a[low];
                a[low]=a[curr];
                a[curr]=temp;
                low++;
                curr++;
            }
            else if(a[curr]==2)
            {
                temp=a[curr];
                a[curr]=a[high];
                a[high]=temp;
                high--;
            }
            else
            {
                curr++;
            }
        }
    }
}

// Time Complexity is O(n)
/*
Example 1:
Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated 
into ascending order.

Example 2:
Input: 
N = 3
arr[] = {0 1 0}
Output:
0 0 1
Explanation:
0s 1s and 2s are segregated 
into ascending order.
*/
