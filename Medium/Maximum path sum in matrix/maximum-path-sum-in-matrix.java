//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int Matrix[][] = new int[N][N];
            for(int i = 0; i < N*N; i++)
                Matrix[(i/N)][i%N] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.maximumPath(N, Matrix));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maximumPath(int N, int matrix[][])
    {
        // code here
        int n=matrix.length;
        int min=Integer.MIN_VALUE;
        
        int prev[]=new int[n];
        
     
        
        for(int i=0;i<matrix.length;i++) prev[i]=matrix[0][i];
        
        for(int row=1; row<n; row++){
            int temp[]=new int[n];
            
            for(int col=0; col<n; col++){
                int left=Integer.MIN_VALUE;
                    if(col>=1) left= prev[col-1];
                int mid=prev[col];
                int right=Integer.MIN_VALUE;
                    if(col+1<n) right=prev[col+1];
            
                 temp[col]=matrix[row][col]+Math.max(left,Math.max(right,mid));
            }
            prev=temp;
        }
        
        for(int i=0; i<n; i++) min=Math.max(min,prev[i]);
        return min;
    }
}