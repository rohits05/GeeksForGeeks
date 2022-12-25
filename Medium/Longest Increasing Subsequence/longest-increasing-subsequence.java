//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total testcases
        int t = sc.nextInt();
        while(t > 0){
            
            //taking size of array
            int n = sc.nextInt();
            int array[] = new int[n];
            
            //inserting elements in the array
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }
            
            //creating an object of class Solution
            Solution ob = new Solution();
            
            //calling longestSubsequence() method of class
            //Solution
            System.out.println(ob.longestSubsequence(n,array));
            t--;
        }
    } 
} 
// } Driver Code Ends




class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int size, int a[]){
        // code here
        int dp[][]=new int[size][size+1];
        int res=solveMem(0,size,-1,a,dp);

        return res;
    }

    // recursive solution
    static int solveRec(int idx,int n,int prev,int a[]){
        if(idx == n) return 0;

        int inc=0,exc=0,max=0;
        if(a[idx]>prev){
            inc=solveRec(idx+1,n,a[idx],a)+1;
            exc=solveRec(idx+1,n,prev,a);
            max=Math.max(inc,exc);
        }else{
            return solveRec(idx+1,n,prev,a);
        }

        return max;
    }

    // memoized Solutions
    static int solveMem(int idx,int n,int prev,int a[],int dp[][]){
        if(idx == n) return 0;

        if(dp[idx][prev+1]!=0) return dp[idx][prev+1];

        int inc=0,exc=0,max=0;

        if(prev==-1 || a[idx]>a[prev]){
            inc=solveMem(idx+1,n,idx,a,dp)+1;
            exc=solveMem(idx+1,n,prev,a,dp);
            max=Math.max(inc,exc);
        }else{
            return solveMem(idx+1,n,prev,a,dp);
        }

        return dp[idx][prev+1]=max;
    }
} 