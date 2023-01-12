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
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v = new int[n];
            for(int i = 0; i < n; i++)
            {
                v[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
           System.out.println(ob.max_xor(v, n));
            
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static int max_xor(int arr[], int n)
    {
        //code here
        int mx = 0;
        for(int i=0; i<n-1; ++i){
            for(int j=i+1; j<n; ++j){
                int k=arr[i]^arr[j];
                if(mx < k) mx = arr[i] ^ arr[j];
            }
        }
        return mx;
    }
}