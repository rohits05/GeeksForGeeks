//{ Driver Code Starts
import java.util.*;
class XOR
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		  int n = sc.nextInt();
		  int[] a = new int[100004];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
		  Solution g = new Solution();
		  System.out.println(g.maxSubsetXOR(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/

class Solution
{
    public static int maxSubsetXOR(int arr[], int N)
    {
        //add code here.
        if(N == 0) return 0;
        int num = 0;
        
        while(true){
            int maxi = Integer.MIN_VALUE;;
            for(int i=0; i<N; i++){
                if(maxi<arr[i])
                maxi = arr[i];
         }

         if(maxi == 0)
         return num;

         num = Math.max(num, num^maxi);
         for(int i=0; i<N; i++){
             arr[i] = Math.min(arr[i],arr[i]^maxi);
         }
       }
    }
}