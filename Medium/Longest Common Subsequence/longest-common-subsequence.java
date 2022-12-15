//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-- > 0){
		    int p=sc.nextInt();             // Take size of both the strings as input
		    int q=sc.nextInt();
		    
		    String s1=sc.next();            // Take both the string as input
	        String s2=sc.next();
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.lcs(p, q, s1, s2));
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int m, int n, String s1, String s2)
    {
        // your code here
        // S
        int[] dp = new int[n+1];
            
        for(int i=1; i<=m; i++){
               int[] curr = new int[n+1];
               for(int j=1; j<=n; j++){
                   if(s1.charAt(i-1) == s2.charAt(j-1)) curr[j] = 1 + dp[j-1];
                   else curr[j] = Math.max(dp[j],curr[j-1]);
                }
            dp = curr;
        }
        return dp[n];
    }
    
}