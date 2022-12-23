//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] price = new int[n];
            String[] str = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                price[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            sln.stockBuySell(price, n);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public void stockBuySell(int[] price, int n) {
        // code here
        int min = 0,i,c = 0;

       for(i=1;i<n-1;i++){

           if(price[min]>price[i]){

               min = i;

           }

           if(price[i-1]<price[i] && price[i]>price[i+1]){

               System.out.print("("+min+" "+i+") ");

               min = i+1;

               c++;

           }

       }

       if(price[min]<price[i]){

           System.out.print("("+min+" "+i+")");

           c++;

       }

       if(c==0){

           System.out.print("No Profit");

       }

       System.out.println();
    }
}