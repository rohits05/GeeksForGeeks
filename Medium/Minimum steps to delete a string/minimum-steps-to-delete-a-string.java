//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.minStepToDeleteString(s));
                }
        }
}    
// } Driver Code Ends


class Solution{

	int solve(String s, int si, int ei,Integer[][] dp)
    {
        if(si > ei) return 0;
        if(ei == si) return 1;
        if(dp[si][ei] != null) return dp[si][ei];

        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        int c = Integer.MAX_VALUE;
        a = 1 + solve(s, si + 1, ei, dp);

        if(s.charAt(si) == s.charAt(si + 1))
            b = 1 + solve(s,si+2,ei,dp);
        for(int i=si+2; i<=ei; i++){
            if(s.charAt(si) == s.charAt(i))
                c = Math.min(c,solve(s,si+1,i-1,dp) + solve(s,i+1,ei,dp));
        }
        return dp[si][ei]=Math.min(a,Math.min(b,c));
    }
    
	public int minStepToDeleteString(String s){ 
	    // Your code goes here
	    Integer dp[][] = new Integer[s.length()][s.length()];
	    return solve(s, 0, s.length()-1, dp);
	} 
}