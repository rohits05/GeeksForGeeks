//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Driverclass {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            System.out.println(new BlackAndWhite().numOfWays(N, M));
        }
    }
}
// } Driver Code Ends


class BlackAndWhite
{
    //Function to find out the number of ways we can place a black and a 
    //white Knight on this chessboard such that they cannot attack each other.
    static long numOfWays(int N, int M){
        long ways = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                ways += calculateSafePlace(i, j, N, M, N*M-1);
            }
        }
        return (ways%1000000007);
    }

    static long calculateSafePlace(int i, int j, int N, int M, long totalPosition){
        int unsafe = 0;
        if(i+2 < N){
            if(j+1 < M) unsafe++;
            if(j-1 >= 0) unsafe++;
        }
        
        if(i-2 >= 0){
            if(j+1 < M) unsafe++;
            if(j-1 >= 0) unsafe++;
        }
        
        if(j+2 < M){
            if(i+1 < N) unsafe++;
            if(i-1 >= 0) unsafe++;
        }
        
        if(j-2 >= 0){
            if(i+1 < N) unsafe++;
            if(i-1 >= 0) unsafe++;
        }
        return (totalPosition - unsafe);
    }
}