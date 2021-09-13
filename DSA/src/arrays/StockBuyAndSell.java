package arrays;

import java.util.*;
public class StockBuyAndSell 
{
	ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) 
    {
        // code here
        ArrayList<ArrayList<Integer>> result= new ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> min_max = new ArrayList<Integer>();
            while((i<n-1)&&(A[i]>A[i+1]))
            {
                i++;
            }
            min_max.add(i);
            if(i==n-1)
            {
                break; 
            }
            while((i<n-1)&&(A[i]<A[i+1]))
            {
                i++;
            }
            min_max.add(i);
            result.add(min_max);
        }
        return result;
    }
}

//Time Complexity: O(n)

/*
The cost of stock on each day is given in an array A[] of size N. Find all the days on which you buy and sell the stock so that in between those days your profit is maximum.
Note: There may be multiple possible solutions. Return any one of them. Any correct solution will result in an output of 1, whereas wrong solutions will result in an output of 0.

Example 1:
Input:
N = 7
A[] = {100,180,260,310,40,535,695}
Output:
1
Explanation:
One possible solution is (0 3) (4 6)
We can buy stock on day 0,
and sell it on 3rd day, which will 
give us maximum profit. Now, we buy 
stock on day 4 and sell it on day 6.

Example 2:
Input:
N = 5
A[] = {4,2,2,2,4}
Output:
1
Explanation:
There are multiple possible solutions.
one of them is (3 4)
We can buy stock on day 3,
and sell it on 4th day, which will 
give us maximum profit.
 */