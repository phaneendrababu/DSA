package arrays;

public class KthSmallestElement {
	//Heapfiying
	static void heapify(int a[],int i,int n)
    {
        int left=2*i+1;
        int right=2*i+2;
        
        int smallest=i;
        if(left<n && a[smallest]>a[left])
        {
            smallest=left;
        }
        if(right<n && a[smallest]>a[right])
        {
            smallest=right;
        }
        
        if(smallest!=i)
        {
            int temp=a[i];
            a[i]=a[smallest];
            a[smallest]=temp;
            
            heapify(a,smallest,n);
        }
    }
    
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        int a[]=new int[r+1];
        int i;
        for(i=0;i<r+1;i++)
        {
            a[i]=arr[i];
        }
        //Heap Sort
        for(i=(r)/2;i>=0;i--)
        {
            heapify(a,i,r+1);
        }
        
        int len=a.length;
        for(i=1;i<k;i++)
        {
            a[0]=a[len-1];
            heapify(a,0,len-1);
            len--;
        }
        return a[0];
    } 
}

//Time Complexity: O(n+Klogn)

/*
Example 1:
Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7
Explanation :
3rd smallest element in the given 
array is 7.

Example 2:
Input:
N = 5
arr[] = 7 10 4 20 15
K = 4
Output : 15
Explanation :
4th smallest element in the given 
array is 15.
*/
