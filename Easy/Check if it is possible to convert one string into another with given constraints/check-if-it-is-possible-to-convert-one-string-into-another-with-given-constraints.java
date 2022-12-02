//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Solution ob = new Solution();
            System.out.println(
                ob.isItPossible(S[0], S[1], S[0].length(), S[1].length()));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isItPossible(String S, String T, int M, int N) {
        // code here
        if(M!=N) return 0;
        int i =0,j =0;
        
        while(true){
            while(i < M){
                if(S.charAt(i) != '#') break;
                i++;    
            }
            while(j < N){
                if(T.charAt(j)!='#') break;
                j++;    
            }
            if(i < M && j < N){
                if(S.charAt(i) != T.charAt(j)) return 0;
                else{                           
                    if(S.charAt(i) == 'A' && i < j) return 0;
                    if(S.charAt(i) == 'B' && i > j) return 0;
                }    
                i++; j++;
            }
            else if(i >= M && j < N || i < M && j >= N) return 0;
            else break;
        }        
        return 1;
    }
};