//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String S = read.readLine();

            Solution ob = new Solution();
            
            System.out.println(ob.minimumNumberOfDeletions(S));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int lps(String s, String t, int n){
        int[][] dp = new int[n+1][n+1];
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[n][n];
    }
    
    static int minimumNumberOfDeletions(String s) {
        //your code here
        int n = s.length();
        
        String t = new StringBuilder(s).reverse().toString();
        return n - lps(s, t, n);
    }
}