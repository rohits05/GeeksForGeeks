<h2><a href="https://practice.geeksforgeeks.org/problems/reversal-algorithm5340/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=reversal-algorithm">Rotating an Array</a></h2><h3>Difficulty Level : Basic</h3><hr><div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given an array&nbsp;of size&nbsp;<strong style="user-select: auto;">N</strong>. The task is to rotate array by <strong style="user-select: auto;">D</strong> elements where <strong style="user-select: auto;">D&nbsp;</strong></span><span style="font-size: 18px; user-select: auto;">≤</span><span style="font-size: 18px; user-select: auto;">&nbsp;<strong style="user-select: auto;">N</strong>.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 7
Arr[] = {1, 2, 3, 4, 5, 6, 7}
D = 2
<strong style="user-select: auto;">Output:</strong> 3 4 5 6 7 1 2
<strong style="user-select: auto;">Explanation:</strong> 
Rotate by 1: [2, 3, 4, 5, 6, 7, 1]
Rotate by 2: [3, 4, 5, 6, 7, 1, 2]</span>
</pre>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 4
Arr[] = {1, 3, 4, 2}
D = 3
<strong style="user-select: auto;">Output:</strong> 2 1 3 4

</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong style="user-select: auto;">leftRotate()</strong>&nbsp;which takes the array of integers&nbsp;<strong style="user-select: auto;">arr[], </strong>its size&nbsp;<strong style="user-select: auto;">n</strong>&nbsp;and&nbsp;<strong style="user-select: auto;">d&nbsp;</strong>as input parameters and rotates&nbsp;arr[] in-place without using any extra memory.</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong>&nbsp;O(N)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong>&nbsp;O(1)</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ N ≤ 10<sup style="user-select: auto;">5</sup><br style="user-select: auto;">
1 ≤ Arr[i] ≤ 1000<br style="user-select: auto;">
0 ≤ D ≤ N</span></p>

<p style="user-select: auto;">&nbsp;</p>
</div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Codenation</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;