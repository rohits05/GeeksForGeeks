<h2><a href="https://practice.geeksforgeeks.org/problems/first-element-to-occur-k-times5150/1?page=1&curated[]=1&sortBy=submissions">First element to occur k times</a></h2><h3>Difficulty Level : Basic</h3><hr><div class="problems_problem_content__Xm_eO"><p>Given an array of <strong>N</strong> integers.&nbsp;Find the first element that occurs at least&nbsp;<strong>K</strong> number of times.<br>
&nbsp;</p>

<p><strong>Example 1:</strong></p>

<pre><strong>Input :</strong>
N = 7, K = 2
A[] = {1, 7, 4, 3, 4, 8, 7}
<strong>Output :</strong>
4
<strong>Explanation:</strong>
Both 7 and 4 occur 2 times. 
But 4 is first that occurs 2 times
As at <strong>index = 4</strong>, 4 has occurred 
atleast 2 times whereas at <strong>index = 6</strong>,
7 has occurred atleast 2 times.
</pre>

<p>&nbsp;</p>

<p><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>firstElementKTime()</strong>&nbsp;which takes the array <strong>A[]</strong>, its size <strong>N,&nbsp;</strong>and an integer <strong>K </strong>as inputs and <strong>returns</strong> the required answer. If the answer is not present in the array, return <strong>-1</strong>.</p>

<p><strong>Expected Time Complexity:</strong> O(N)<br>
<strong>Expected Auxiliary Space:</strong> O(N)</p>

<p><strong>Constraints:</strong><br>
1 &lt;= N, K &lt;= 105<br>
1&lt;= A &lt;= 106</p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Hash</code>&nbsp;<code>Data Structures</code>&nbsp;