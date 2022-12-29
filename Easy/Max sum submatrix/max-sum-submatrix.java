//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] mat = new int[n][m];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    mat[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int q = Integer.parseInt(br.readLine().trim());
            int[][] queries = new int[q][2];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < q; i++) {
                for (int j = 0; j < 2; j++) {
                    queries[i][j] = Integer.parseInt(inputLine[i * 2 + j]);
                }
            }
            int[] ans = new Solution().maxSubMatrixSumQueries(mat, n, m, queries, q);
            for (int xx : ans) {
                System.out.print(xx + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int[] maxSubMatrixSumQueries(int[][] mat, int n, int m, int[][] queries, int q) {
        // code here
        int[] ans = new int[q];
        
       int[][] pre_sum = new int[n + 1][m + 1];
       // keeping top row and left col values as 0    
       
        // Now, calculating the presum of the remaining elements of matrix
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= m; j++)
                pre_sum[i][j] = mat[i - 1][j - 1] + pre_sum[i - 1][j] + pre_sum[i][j - 1] - pre_sum[i - 1][j - 1];
        } 
        
         // Finally, calculating the maximum and store into the ans array
        
        for(int index = 0; index < q; index++){
            int max = Integer.MIN_VALUE, temp, k = queries[index][0], l = queries[index][1];
            
            for (int i = k; i <= n; i++)
            {
                for (int j = l; j <= m; j++)
                {
                    temp = pre_sum[i][j] - pre_sum[i][j - l] - pre_sum[i - k][j] + pre_sum[i - k][j - l];
                    if (temp > max)
                        max = temp;
                }
            }
            ans[index] = max;
        }
        return ans;
    }
}