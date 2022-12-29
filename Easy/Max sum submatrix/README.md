<h2><a href="https://practice.geeksforgeeks.org/problems/max-sum-submatrix2725/1">Max sum submatrix</a></h2><h3>Difficulty Level : Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a matrix of size NxM and a list of queries containing (a,b) pairs. Find the maximum sum among all (a x b) sub-matrices of the matrix.&nbsp;<br>
<strong>Note:</strong> The rows and columns of the submatrix must be contiguous. For example:</span></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 3, M = 4
mat[][] = {{1, 2, 3, 9}, 
           {4, 5, 6, 2}, 
           {8, 3, 2, 6}}
Q = 1
Queries[] = {(3,2)}</span>

<span style="font-size:18px"><strong>Output:</strong> 28</span>

<span style="font-size:18px"><strong>Explanation:</strong>
Here a = 3 and b = 2.</span>

<span style="font-size:18px">The first 3x2 submatrix is:
1 2
4 5
8 3
The sum of elements in this is 23.</span>

<span style="font-size:18px">The second 3x2 submatrix is:
2 3
5 6
3 2
The sum of elements in this is 21.</span>

<span style="font-size:18px">The third 3x2 submatrix is:
3 9
6 2
2 6
The sum of elements in this is 28.</span>

<span style="font-size:18px">The maximum among these is 28.</span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 3, M = 4
mat[][] = {{1, 2, 3, 9}, 
           {4, 5, 6, 2}, 
           {8, 3, 2, 6}}
Q = 3
Queries[] = {(1, 1), (2, 2), (3, 3)}</span>

<span style="font-size:18px"><strong>Output:</strong> 9 20 38</span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 3:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 2, M = 7
mat[][] = {{49, 44, 46, 22, 24, 11, 2}, 
           {5, 25, 24, 28, 20, 47, 47}}
Q = 1
Queries = {(2, 1)}</span>

<span style="font-size:18px"><strong>Output:</strong> 70</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>maxSubMatrixSumQueries() </strong>which takes the 2D array of integers mat, n, m, queries and q as input parameters and returns an array of integers denoting the maximum sum for each query.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(Q*N*M)<br>
<strong>Expected Auxiliary Space:</strong> O(N*M)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 10<sup>3</sup><br>
1 ≤ M ≤ 10<sup>3</sup><br>
1 ≤ Q ≤ 100<br>
1 ≤ a ≤ N<br>
1 ≤ b ≤ M<br>
1 ≤ mat[i][j] ≤ 10<sup>3</sup></span></p>
</div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Accolite</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Data Structures</code>&nbsp;