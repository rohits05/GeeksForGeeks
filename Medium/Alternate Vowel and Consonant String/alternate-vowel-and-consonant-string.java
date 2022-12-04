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
            int N = Integer.parseInt(read.readLine());
            String S = read.readLine().trim();
            
            Solution ob = new Solution();
            String ans = ob.rearrange(S, N);
            
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public String rearrange(String s, int n) {
        int[] vowels = new int[26];
        int[] conso = new int[26];
        int vc = 0, cc = 0;
        
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) =='o' || s.charAt(i) == 'u') {
                vowels[s.charAt(i) - 'a']++;
                vc++;
            }else{
                conso[s.charAt(i) - 'a']++;
                cc++;
            }
        }
        if(Math.abs(vc - cc) > 1) return "-1";
        if(vc >= cc) return helper(vowels, conso);
        else return helper(conso, vowels);
    }
    
    public String helper(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        StringBuffer sb = new StringBuffer();
        
        while(i < arr1.length || j < arr2.length) {
            
            while(i < arr1.length && arr1[i] == 0) i++;
            if(i < arr1.length) {
                if(arr1[i] != 0) {
                    sb.append((char)(i + 'a'));
                    arr1[i]--;
                }
            }
            
            while(j < arr2.length && arr2[j] == 0) j++;
            if(j < arr2.length) {
                if(arr2[j] != 0) {
                    sb.append((char)(j + 'a'));
                    arr2[j]--;
                }
            }
        }
        return sb.toString();
    }
}