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
                    String s1 = sc.next();
                    String s2 = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.minOperations(s1,s2));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int [][]dp = new int[1001][1001];
	public int minOperations(String str1, String str2){
	    for(int i=0; i<dp.length; i++){
	        for(int j=0; j<dp[0].length; j++){
	            dp[i][j] = -1;
	        }
	    }
	    
	   int m = str1.length(), n = str2.length();
	   int l = lcs(str1,str2,m,n);
	   return (n-l)+(m-l);
	} 
	
	public int lcs(String str1,String str2,int m,int n){
	    if(m == 0 || n == 0) return 0;
	    if(dp[m][n] != -1) return dp[m][n];
	    
	    if(str1.charAt(m-1) == str2.charAt(n-1))
	        return dp[m][n] = 1 + lcs(str1, str2, m-1, n-1);
	    else
	        return dp[m][n] = Math.max(lcs(str1, str2, m-1, n), lcs(str1, str2, m, n-1)); 
	}
}