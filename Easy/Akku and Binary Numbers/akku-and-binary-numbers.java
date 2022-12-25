//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        Solution ob = new Solution();
        ob.precompute();
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            long L = Long.parseLong(input_line[0]);
            long R = Long.parseLong(input_line[1]);
            long ans = ob.solve(L, R);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java


class Solution{
    
    void precompute(){
        // Code Here
    }
    long solve(long l, long r){
        // Code here
        long ans = 0;

        for(long i=1; i<=r; i*=2){
            for(long j=i*2; j<=r; j*=2){
                for(long k=j*2; k<=r; k*=2){
                    long t = i | j | k;

                    if(t >= l && t <= r) ans++;
                }
            }
        }

        return ans;
    }
    
}
