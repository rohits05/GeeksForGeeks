//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Position this line where user code will be pasted.
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.BalancedString(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static String BalancedString(int N){
        StringBuilder sb = new StringBuilder();
        int val = sum(N);   
        while(N>0){
            if(N>=26){
                sb.append(find(26,0));
                N-=26;
            }else{
                if(N%2==0){
                    sb.append(find(N/2,0));
                    sb.append(find(N/2,1));
                }else{
                    if(val%2==0){
                        sb.append(find((N+1)/2,0));
                        sb.append(find((N-1)/2,1));
                    }else{
                        sb.append(find((N-1)/2,0));
                        sb.append(find((N+1)/2,1));
                    }
                }
                N=0;
            }
        }
        return sb.toString();
    }
    
    public static int sum(int n){
        int s=0;
        while(n>0){
            s+=(n%10);
            n/=10;
        }
        return s;
    }
    
    public static String find(int v,int status){
        StringBuilder sb = new StringBuilder();
        if(status==0){
            for(char i='a';v>0;v--,i++) sb.append(Character.toString(i));
        }else{
            for(char i='z';v>0;v--,i--) sb.append(Character.toString(i));
            sb.reverse();
        }
        return sb.toString();
    }
}