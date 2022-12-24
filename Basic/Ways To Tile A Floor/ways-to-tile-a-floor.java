//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.numberOfWays(N));
        }
    }
}
// } Driver Code Ends


class Solution {
    static Long numberOfWays(int n) {
        // code here
        Long[] dp = new Long[n+1];
        dp[1] = (long)1;
        dp[0] = (long)1;
        
        for(int i = 2; i <= n; i++){
            dp[i] = (dp[i-1] + dp[i-2]) % 1000000007;
        }
        return dp[n];
    }
};