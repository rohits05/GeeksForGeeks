//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine().trim());
            String input_line[] = read.readLine().trim().split("\\s+");
            int A[]= new int[N];
            for(int i = 0; i < N; i++)
                A[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubsequence(N, A));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int longestSubsequence(int N, int A[])
    {
        // code here
        if(N == 1) return 1;

        int dp[] = new int[N];
        dp[0] = 1;
    
        HashMap<Integer, Integer> h=new HashMap<>();
        h.put(A[0],1);
    
        for(int i=1; i<N; i++){
            if(h.containsKey(A[i]-1) || h.containsKey(A[i]+1))
                dp[i] = 1 + Math.max(h.getOrDefault(A[i]+1, 0), h.getOrDefault(A[i]-1, 0));
            else dp[i] = 1;
            
            h.put(A[i],dp[i]);
        }
    
       int max = Integer.MIN_VALUE;
       for(int i=0; i<N; i++)
           if(max < dp[i]) max = dp[i];
    
       return max;
    }
}