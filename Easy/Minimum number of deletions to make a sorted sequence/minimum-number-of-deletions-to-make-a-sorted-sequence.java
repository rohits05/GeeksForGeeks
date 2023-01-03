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
                    int n = sc.nextInt();
                    int Arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDeletions(Arr,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java
class Solution
{
	static int LIS(int arr[]){
        int n = arr.length;
        int dp[] = new int[n];
        int ans = 0;
        for(int i=0; i<n; i++){
            dp[i] = 1;
            for(int j=i-1; j>=0; j--){
                if(arr[i] > arr[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
    
	public int minDeletions(int arr[], int n){
	   return n - LIS(arr); 
	} 
}