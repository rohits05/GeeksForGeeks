//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int m = Integer.parseInt(inputLine[0]);
            int[] arr1 = new int[m];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                arr1[i] = Integer.parseInt(inputLine[i]);
            }
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr2 = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr2[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().LCIS(arr1, m, arr2, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int LCIS(int[] arr1, int m, int[] arr2, int n) {
        // code here
        int dp[] = new int[n];
        for(int j=0; j<n; j++) dp[j] = 0;
        for(int i=0; i<m; i++){
            int current = 0;
            for(int j=0; j<n; j++){
                if(arr1[i] == arr2[j]){
                    if(current+1 > dp[j]) dp[j] = current + 1;
                }
                if(arr1[i] > arr2[j]){
                    if(dp[j] > current) current = dp[j];
                }
            }
        }
        
        int ans = 0;
        for(int i=0; i<n; i++) ans = Math.max(ans, dp[i]);
        return ans;
    }
}