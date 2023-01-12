//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution {
    long minimizeSum(int N, int arr[]) {
        // code here
        PriorityQueue<Integer> q = new  PriorityQueue<Integer>();
        int sum =0;
        for(int i=0; i<N ; i++) q.add(arr[i]);
        while(q.size() != 1){
            int temp = q.poll() + q.poll();
            sum += temp;
            q.add(temp);
        }
        return (long)sum;
    }
}

//{ Driver Code Starts.

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0; i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            long ans = obj.minimizeSum(n, A);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends