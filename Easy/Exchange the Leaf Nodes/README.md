<h2><a href="https://practice.geeksforgeeks.org/problems/exchange-the-leaf-nodes/1">Exchange the Leaf Nodes</a></h2><h3>Difficulty Level : Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:20px">Given a binary tree of size <strong>N</strong>, your task is to complete the function <strong>pairwiseSwap()</strong>, that&nbsp;swap leaf nodes in the given binary tree pairwise starting from from left to right.</span><br>
<strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong> 

<img alt="" src="https://contribute.geeksforgeeks.org/wp-content/uploads/swap1.png" style="height:363px; width:583px">
<strong>Output:</strong> 7 2 1 4 5 9 3 8 6 10&nbsp;
<img alt="" src="https://contribute.geeksforgeeks.org/wp-content/uploads/swap2.png" style="height:381px; width:602px">
<strong>Explanation:</strong>
The sequence of leaf nodes in original binary tree
from left to right is (4, 7, 8, 9, 10). Now if we 
try to form pairs from this sequence, we will have 
two pairs as (4, 7), (8, 9). The last node (10) is 
unable to form pair with any node and thus left unswapped</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>
          1
       /     \
      2       3
       \    /    \
        5  6      7</span>
<span style="font-size:18px"><strong>Output:</strong></span> <span style="font-size:18px">2 6 1 5 3 7</span>
<span style="font-size:18px">        1
     /     \
    2       3
     \    /   \
      6  5     7</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function pairwiseSwap() which takes root node of the tree as input parameter. </span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity: </strong>O(N)<br>
<strong>Expected Auxiliary Space: </strong>O(1)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1&lt;=N&lt;=10<sup>3</sup><br>
1&lt;=Data of a node &lt;=10<sup>3</sup></span></p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Tree</code>&nbsp;<code>Data Structures</code>&nbsp;