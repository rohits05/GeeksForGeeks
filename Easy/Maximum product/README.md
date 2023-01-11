<h2><a href="https://practice.geeksforgeeks.org/problems/maximum-product4633/1">Maximum product</a></h2><h3>Difficulty Level : Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array <strong>arr[]</strong> of <strong>N</strong> integers, the task is to find a subsequence of size <strong>K</strong> whose product is maximum among all possible <strong>K</strong> sized subsequences of a given array.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>N = 4, K = 2
arr[] = {1, 2, 0, 3} 
<strong>Output:</strong> 6
<strong>Explanation</strong>: Subsequence containing 
elements {2, 3} gives maximum product: 
2*3 = 6</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>N = 6, K = 4
arr[] = {1, 2, -1, -3, -6, 4}
<strong>Output:</strong> 144
<strong>Explanation</strong>: Subsequence containing 
{2, -3, -6, 4} gives maximum product: 
2*(-3)*(-6)*4 = 144</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
This is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function <strong>maxProductSubarrayOfSizeK</strong>() that takes array<strong> arr[],&nbsp;</strong>integer<strong> N </strong>and&nbsp;integer<strong> K</strong>&nbsp;as parameters and returns the desired product.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(NlogN).<br>
<strong>Expected Auxiliary Space:</strong> O(1).</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 10<sup>5</sup></span></p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Data Structures</code>&nbsp;