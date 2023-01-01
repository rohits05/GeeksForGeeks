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
            Solution ob = new Solution();
            int ans = ob.compute_value(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    int mod = 1000000007;

    public long inv(long r){
        if(r==1) return 1;

        return (mod-((mod/r)*inv(mod%r))%mod+mod)%mod;
    }

    public int  compute_value(int n){
        long ans=1,ncr=1;
        for(int i=1; i<=n; i++){
            ncr=((ncr*(n+1-i)%mod)*inv(i))%mod;
            ans=(ans+(ncr*ncr)%mod)%mod;
        }

        return (int)(ans%mod);
    }
}