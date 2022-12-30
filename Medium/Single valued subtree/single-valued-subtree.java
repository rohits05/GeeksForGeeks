//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

//Initial Template for Java

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class Tree {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
    	    	
                Solution g = new Solution();
                System.out.println(g.singlevalued(root));
                    
                t--;
            
        }
    }
}



// } Driver Code Ends


//User function Template for Java

/*class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}*/

class Pair{

    int data;

    boolean bool;

    Pair(int data, boolean bool){

        this.data = data;

        this.bool = bool;

    }

}

class Solution

{

    int count = 0;

 

    public Pair fun(Node root){

        if(root == null ) return new Pair((int)1e9, true);

        if(root.left == null && root.right == null) {

            count++;

            return new Pair(root.data, true);

        }

        Pair left = fun(root.left);

        Pair right = fun(root.right);

        if(left.bool == false || right.bool == false){

            return new Pair(root.data, false);

        }

        else {

            if( (root.data == left.data || left.data == (int)1e9) 

            && ( root.data == right.data || right.data == (int)1e9 )) {

                count++;

                return new Pair(root.data, true);

            }else {

                return new Pair(root.data, false);

            }

        }

    }

    public int singlevalued(Node root){
        if(root == null) return count;

        fun(root);

        return count;

    }

}