//{ Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().print2largest(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int print2largest(int arr[], int n) {
        // code here
        // Without sorting
        // int maxI = Integer.MIN_VALUE, sLar = -1;
        // for(int i=0; i<n; i++) {  if(maxI < arr[i])  maxI = arr[i]; }
        // for(int i=0; i<n; i++) {  if(arr[i] > sLar && arr[i] < maxI) sLar = arr[i]; }
        // return sLar;
        
        // Using Sort MeTHoD
        Arrays.sort(arr);
        for(int i=n-1; i>0; i--){if(arr[i-1] != arr[i]) return arr[i-1];}
        return -1;
    }
}