package arrays;


public class CountTriplets 
{
	static int countWays(int[] arr, int n)
    {
        //Calculate max value  in array
        int max_val = 0;
        for (int i = 0; i < n; i++)
        {
        	max_val = Math.max(max_val, arr[i]);
        }
        int[] freq = new int[max_val + 1];
        for (int i = 0; i < n; i++)
        {
        	freq[arr[i]]++;
        }
 
        int ans = 0; // stores the number of ways
 
        // Case 1: 0, 0, 0     -------> C(freq[0],3)
        ans += freq[0] * (freq[0] - 1) * (freq[0] - 2) / 6;
 
        // Case 2: 0, x, x     -------> freq[0]*C(freq[x],2)
        for (int i = 1; i <= max_val; i++)
            ans += freq[0] * freq[i] * (freq[i] - 1) / 2;
 
        // Case 3: x, x, 2*x   -------> C(freq[x],2)*freq[2*x]
        for (int i = 1; 2 * i <= max_val; i++)
            ans += freq[i] * (freq[i] - 1) / 2 * freq[2 * i];
 
        // Case 4: x, y, x + y
        // iterate through all pairs (x, y)
        for (int i = 1; i <= max_val; i++) {
            for (int j = i + 1; i + j <= max_val; j++)
                ans += freq[i] * freq[j] * freq[i + j];
        }
 
        return ans;
    }
}

/*
 
Input : A[] = {1, 2, 3, 4, 5}
Output : 4
The valid triplets are:
(1, 2, 3), (1, 3, 4), (1, 4, 5), (2, 3, 5)

Input : A[] = {1, 1, 1, 2, 2}
Output : 6
 */