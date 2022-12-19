//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] graph = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++)
                    graph[i][j] = Integer.parseInt(S[j]);
            }
            String[] S1 = br.readLine().trim().split(" ");
            int u = Integer.parseInt(S1[0]);
            int v = Integer.parseInt(S1[1]);
            int k = Integer.parseInt(S1[2]);
            Solution ob = new Solution();
            int ans = ob.MinimumWalk(graph, u, v, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    long mod = 1000000007;
    long fun(int[][]graph, int u, int v, int k, long [][]dp){
        if(k == 0){
            if(u == v) return 1;
            return 0;
        }
        
        if(dp[u][k] != 0) return dp[u][k] % mod;
        
        long cou = 0;
        for(int i=0; i<graph.length; i++){
            if(graph[u][i]==1) cou += fun(graph, i, v, k-1, dp) % mod;
        }
        
        cou = cou % mod;
        if(cou < 0) cou += mod;
        
        dp[u][k] = cou ;
        
        return cou;
    }
    
    public int MinimumWalk(int[][] graph, int u, int v, int k){
        long[][] dp = new long[graph.length][k+1];
        
        return (int)fun(graph, u, v, k, dp);
    }
}