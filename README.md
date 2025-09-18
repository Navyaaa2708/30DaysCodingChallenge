# 30 Days Coding Consistency Challenge 🎯

I’ve taken up the **30 Days Coding Consistency Challenge** to build the habit of solving problems every single day.  
The main goal is to improve problem-solving skills, stay disciplined, and track my daily progress 💡.  
I’ll be solving **LeetCode problems** daily and updating my journey here.

---

## 📅 Daily Progress

### ✅ Day 1
**Problems Completed:**
- [Add Two Integers – LeetCode 2235](https://leetcode.com/problems/add-two-integers/)  
- [Concatenation of Array – LeetCode 1929](https://leetcode.com/problems/concatenation-of-array/)  
- [Move Zeroes – LeetCode 283](https://leetcode.com/problems/move-zeroes/)  

✔️ **Progress Status:** Completed  

### ✅ Day 2
**Problems Solved:**
- [Contains Duplicate – LeetCode 217](https://leetcode.com/problems/contains-duplicate/)  
- [Missing Number – LeetCode 268](https://leetcode.com/problems/missing-number/)  
- [First Unique Character in a String – LeetCode 387](https://leetcode.com/problems/first-unique-character-in-a-string/)  

✔️ **Status:** Done  

### ✅ Day 3
**Problems Solved:**
- [Palindrome Number – LeetCode 9](https://leetcode.com/problems/palindrome-number/)  
- [Roman to Integer – LeetCode 13](https://leetcode.com/problems/roman-to-integer/)  
- [Length of Last Word – LeetCode 58](https://leetcode.com/problems/length-of-last-word/)  

✔️ **Status:** Done  

### ✅ Day 4  
**Problems Solved:**
### 1️⃣ [LeetCode #136: Single Number](https://leetcode.com/problems/single-number/)  
- **Concept Used**: Bitwise XOR  
- **Logic**: XOR-ing all numbers cancels out pairs, leaving the unique number.  
### 2️⃣ [LeetCode #88: Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)  
- **Concept Used**: Two-pointer technique + Sorting  
- **Logic**: Merge two sorted arrays into one sorted array in-place.  
### 3️⃣ [LeetCode #350: Intersection of Two Arrays II](https://leetcode.com/problems/intersection-of-two-arrays-ii/)  
- **Concept Used**: Sorting + Two-pointer  
- **Logic**: Traverse both sorted arrays and collect common elements.


### ✅ Day 5 
**Problems Solved:**
### 1. [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/) (LeetCode #14)
- **Problem:** Find the longest common prefix among an array of strings.
- **Approach:**  
  - Compare characters of strings vertically.
  - Stop when characters mismatch or one string ends.
- **Key Concept:** String comparison and prefix trimming.
### 2. [Happy Number](https://leetcode.com/problems/happy-number/) (LeetCode #202)
- **Problem:** Determine if a number is a "happy number" (repeatedly replace the number with the sum of the squares of its digits until it becomes 1).
- **Approach:**  
  - Use a `HashSet` to track visited numbers and detect cycles.
  - If number reaches `1` → Happy Number.
- **Key Concept:** Cycle detection using HashSet
### 3. [Number of 1 Bits](https://leetcode.com/problems/number-of-1-bits/) (LeetCode #191)
- **Problem:** Count the number of `1` bits in an integer’s binary representation.
- **Approach:**  
  - Use **Brian Kernighan’s Algorithm**: repeatedly turn off the rightmost `1` bit using `n & (n - 1)`.
- **Key Concept:** Bit manipulation.

### ✅ Day 6  
**Problems Solved:**
### 1. [Valid Anagram](https://leetcode.com/problems/valid-anagram/) (LeetCode #242)  
- **Problem:** Check if two strings are anagrams of each other.  
- **Approach:**  
  - Sort both strings or use a frequency counter.  
- **Key Concept:** HashMap / Sorting.
### 2. [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) (LeetCode #217)  
- **Problem:** Check if any element appears more than once in an array.  
- **Approach:**  
  - Use a HashSet to track seen elements.  
- **Key Concept:** HashSet for duplicate detection.
### 3. [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) (LeetCode #125)  
- **Problem:** Check if a string is a palindrome (ignoring non-alphanumeric and case).  
- **Approach:**  
  - Use two pointers: left & right, skip non-alphanumeric, compare characters.  
- **Key Concept:** Two-pointer technique + String sanitization.

### ✅ Day 7  
**Problems Solved:**
1️⃣ LeetCode #6: Zigzag Conversion  
**Concept Used:** Simulation + String Manipulation  
**Logic:** Place characters in a zigzag pattern by tracking the current row and direction, then combine rows to form the result.  
2️⃣ LeetCode #443: String Compression  
**Concept Used:** Two-pointer technique + In-place array modification  
**Logic:** Use one pointer to traverse the array and another to build the compressed version by counting consecutive characters.  
3️⃣ LeetCode #179: Largest Number  
**Concept Used:** Custom Sorting  
**Logic:** Sort numbers as strings with a custom comparator (compare `a+b` vs `b+a`) to form the largest concatenated number.  

### ✅ Day 8  
**Problems Solved:**
## 🔹 LeetCode #2: Add Two Numbers
- Problem Link: [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/)  
- Approach: Used iterative addition with carry handling, constructing the result as a new linked list.
## 🔹 LeetCode #206: Reverse Linked List
- Problem Link: [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)  
- Approach: Iteratively reversed pointers while traversing the list using `prev`, `curr`, and `next`.
## 🔹 LeetCode #496: Next Greater Element I
- Problem Link: [Next Greater Element I](https://leetcode.com/problems/next-greater-element-i/)  
- Approach: Used a monotonic stack and hashmap to precompute the next greater element for each number.


### ✅ Day 9 
**Problems Solved:**
### 1️⃣ [LeetCode #232: Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/)
- **Concept Used:** Two Stacks  
- **Logic:** One stack for input, one for output. Shift elements only when needed.  
- **Complexity:** Amortized O(1) per operation.  
### 2️⃣ [LeetCode #933: Number of Recent Calls](https://leetcode.com/problems/number-of-recent-calls/)
- **Concept Used:** Queue (Sliding Window)  
- **Logic:** Keep timestamps in a queue and remove those older than 3000ms.  
- **Complexity:** O(1) amortized per `ping` operation.  
### 3️⃣ [LeetCode #622: Design Circular Queue](https://leetcode.com/problems/design-circular-queue/)
- **Concept Used:** Array + Modular Arithmetic  
- **Logic:** Use `front`, `rear`, and modulo to implement circular behavior.  
- **Complexity:** O(1) for all operations.  


### ✅ Day 10
**Problems Completed:**
LeetCode #187: Repeated DNA Sequences
- Approach: Rolling hash with bitmasking to track repeated substrings.
LeetCode #408: Valid Word Abbreviation
- Approach: Parsed abbreviations carefully handling digit groups.
LeetCode #680: Valid Palindrome II
- Approach: Two-pointer method with helper allowing one mismatch removal.

### ✅ Day 11
**Problems Completed:**
### 🔹 LeetCode #303: Range Sum Query – Immutable
- Approach: Built a prefix sum array for O(1) queries, storing cumulative sums at each index.
### 🔹 LeetCode #724: Find Pivot Index
- Approach: Computed total sum, then iterated while maintaining prefix sum to check balance condition.
### 🔹 LeetCode #1480: Running Sum of 1D Array
- Approach: Iteratively accumulated running totals to construct the result array.


### ✅ Day 12
**Problems Completed:**
### 1. [Valid Perfect Square (Problem 367)](https://leetcode.com/problems/valid-perfect-square/)
- **Valid Perfect Square:** Used binary search to avoid brute-force iteration, reducing complexity.
### 2. [First Bad Version (Problem 278)](https://leetcode.com/problems/first-bad-version/)
- **First Bad Version:** Learned how to minimize API calls by narrowing down with binary search.
### 3. [Peak Index in a Mountain Array (Problem 852)](https://leetcode.com/problems/peak-index-in-a-mountain-array/)
- **Peak Index in a Mountain Array:** Applied binary search logic in a modified way to find the peak efficiently.



### ✅ Day 13
**Problems Completed:**
-   [1365 -- How Many Numbers Are Smaller Than the Current
    Number](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/)\
-   [561 -- Array
    Partition](https://leetcode.com/problems/array-partition/)\
-   [1773 -- Count Items Matching a
    Rule](https://leetcode.com/problems/count-items-matching-a-rule/)


### ✅ Day 14  
**Problems Solved:**  
### 1️⃣ [LeetCode #441: Arranging Coins](https://leetcode.com/problems/arranging-coins/)  
- **Concept Used:** Math + Binary Search  
- **Logic:** Find maximum complete staircase rows by solving quadratic equation.  
- **Complexity:** O(1) using formula.  

### 2️⃣ [LeetCode #1011: Capacity to Ship Packages Within D Days](https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/)  
- **Concept Used:** Binary Search on Answer  
- **Logic:** Find minimum ship capacity by checking feasibility with binary search.  
- **Complexity:** O(n log sum(weights)).  

### 3️⃣ [LeetCode #410: Split Array Largest Sum](https://leetcode.com/problems/split-array-largest-sum/)  
- **Concept Used:** Binary Search + Greedy Partitioning  
- **Logic:** Split array into `k` subarrays minimizing the largest subarray sum.  
- **Complexity:** O(n log sum(nums)).  


### ✅ Day 15  
**Problems Solved:**  
### 1️⃣ [LeetCode #1047: Remove All Adjacent Duplicates In String](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/)  
- **Concept Used:** Stack / StringBuilder as stack  
- **Logic:** Traverse string and remove last char if it matches current, else append.  
- **Complexity:** O(n).  
### 2️⃣ [LeetCode #856: Score of Parentheses](https://leetcode.com/problems/score-of-parentheses/)  
- **Concept Used:** Stack  
- **Logic:** Push scores on stack, combine based on `()` → 1 or `(A)` → `2*A`.  
- **Complexity:** O(n).  
### 3️⃣ [LeetCode #1209: Remove All Adjacent Duplicates in String II](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/)  
- **Concept Used:** Stack with counts  
- **Logic:** Track frequency of consecutive characters and remove substring when count == k.  
- **Complexity:** O(n).  


  ### ✅ Day 16  
**Problems Solved:**  
### 1️⃣ [LeetCode #860: Lemonade Change](https://leetcode.com/problems/lemonade-change/)  
- **Concept Used:** Greedy  
- **Logic:** Track count of $5 and $10 bills. Give change using higher denominations first to preserve smaller bills.  
- **Complexity:** O(n).  
### 2️⃣ [LeetCode #134: Gas Station](https://leetcode.com/problems/gas-station/)  
- **Concept Used:** Greedy + Prefix Sum  
- **Logic:** Traverse stations while maintaining fuel balance. If balance drops below zero, reset start point.  
- **Complexity:** O(n).  
### 3️⃣ [LeetCode #406: Queue Reconstruction by Height](https://leetcode.com/problems/queue-reconstruction-by-height/)  
- **Concept Used:** Sorting + Insertion  
- **Logic:** Sort by height (desc), then insert each person at index = k.  
- **Complexity:** O(n²) in worst case due to list insertions.  


### ✅ Day 17  
**Problems Solved:**  
### 1️⃣ [LeetCode #61: Rotate List](https://leetcode.com/problems/rotate-list/)  
- **Concept Used:** Linked List + Two Pointers  
- **Logic:** Find length, connect tail to head (circular list), then break at correct position after `(len - k % len)` steps.  
- **Complexity:** O(n).  
### 2️⃣ [LeetCode #24: Swap Nodes in Pairs](https://leetcode.com/problems/swap-nodes-in-pairs/)  
- **Concept Used:** Iterative Linked List Manipulation  
- **Logic:** Swap every two adjacent nodes by adjusting pointers using a dummy node.  
- **Complexity:** O(n).  
### 3️⃣ [LeetCode #138: Copy List with Random Pointer](https://leetcode.com/problems/copy-list-with-random-pointer/)  
- **Concept Used:** Hashing / In-place Node Copying  
- **Logic:** Clone nodes in-between originals, assign random pointers, then separate original and copied lists.  
- **Complexity:** O(n).  

### ✅ Day 18  
**Problems Solved:**  
### 1️⃣ [LeetCode #703: Kth Largest Element in a Stream](https://leetcode.com/problems/kth-largest-element-in-a-stream/)  
- **Concept Used:** Min-Heap  
- **Logic:** Maintain a min-heap of size `k`. The root always represents the kth largest element.  
- **Complexity:** O(log k) per insertion.  
### 2️⃣ [LeetCode #973: K Closest Points to Origin](https://leetcode.com/problems/k-closest-points-to-origin/)  
- **Concept Used:** Max-Heap  
- **Logic:** Keep a max-heap of size `k` with distances. Pop the farthest when size exceeds `k`.  
- **Complexity:** O(n log k).  
### 3️⃣ [LeetCode #295: Find Median from Data Stream](https://leetcode.com/problems/find-median-from-data-stream/)  
- **Concept Used:** Two Heaps (Max-Heap + Min-Heap)  
- **Logic:** Balance two heaps: max-heap for lower half, min-heap for upper half. Median depends on heap sizes.  
- **Complexity:** O(log n) for insertion, O(1) for median retrieval.  

### ✅ Day 19  
**Problems Solved:**  
1. **Remove Duplicates from Sorted Array**  
   🔗 [LeetCode #26](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)  
   - Used **two-pointer technique** to shift unique values forward.  
   - Achieved **O(n) time complexity**.  
2. **Merge Sorted Array**  
   🔗 [LeetCode #88](https://leetcode.com/problems/merge-sorted-array/)  
   - Handled merging **two sorted arrays in-place**.  
   - Utilized **swapping + sorting approach** for correctness.  
3. **Intersection of Two Arrays II**  
   🔗 [LeetCode #350](https://leetcode.com/problems/intersection-of-two-arrays-ii/)  
   - Solved using **two pointers after sorting both arrays**.  
   - Constructed result array efficiently.  


### ✅ Day 20
**Problems Solved:**  
1. **Number of Recent Calls**  
   🔗 [LeetCode #933](https://leetcode.com/problems/number-of-recent-calls/description/)  
   - Implemented a **queue-based sliding window** to track recent requests.  
   - Efficiently removed outdated calls outside the 3000ms range.  
2. **Implement Stack using Queues**  
   🔗 [LeetCode #225](https://leetcode.com/problems/implement-stack-using-queues/description/)  
   - Simulated a **stack (LIFO)** using two **queues**.  
   - Ensured top and pop operations behave correctly with reordering.  
3. **Design Linked List**  
   🔗 [LeetCode #707](https://leetcode.com/problems/design-linked-list/description/)  
   - Built a **custom linked list** from scratch.  
   - Supported operations: get, add at head, add at tail, add at index, and delete at index.  


### ✅ Day 21
**Problems Solved:**  
1. **Subsets II**  
   🔗 [LeetCode #90](https://leetcode.com/problems/subsets-ii)  
   - Generated all possible subsets of an array that may contain duplicates.  
   - Used sorting + recursion + set to **avoid duplicate subsets**.  
2. **Combination Sum II**  
   🔗 [LeetCode #40](https://leetcode.com/problems/combination-sum-ii)  
   - Found unique combinations where numbers sum to a target.  
   - Used **backtracking with pruning** and skipped duplicates smartly.  
3. **Permutations II**  
   🔗 [LeetCode #47](https://leetcode.com/problems/permutations-ii)  
   - Generated all unique permutations of numbers that may contain duplicates.  
   - Applied **boolean visited array** and duplicate skipping conditions.  

### ✅ Day 22
**Problems Solved:** 
1. **Binary Tree Inorder Traversal**  
   🔗 [LeetCode #94](https://leetcode.com/problems/binary-tree-inorder-traversal/)  
   - Used a **stack** to simulate recursion.  
   - Traversed in order: Left ➝ Root ➝ Right.  
2. **Binary Tree Preorder Traversal**  
   🔗 [LeetCode #144](https://leetcode.com/problems/binary-tree-preorder-traversal/)  
   - Iterative solution with a **stack**.  
   - Traversed in order: Root ➝ Left ➝ Right.  
3. **Binary Tree Postorder Traversal**  
   🔗 [LeetCode #145](https://leetcode.com/problems/binary-tree-postorder-traversal/)  
   - Used **stack + linked list (addFirst)** to reverse the process.  
   - Traversed in order: Left ➝ Right ➝ Root.


### ✅ Day 23
**Problems Solved:** 
1. **Binary Tree Level Order Traversal (LeetCode 102)**  
   🔗 [Problem Link](https://leetcode.com/problems/binary-tree-level-order-traversal/)  
   - Implemented BFS using a queue.  
   - Collected node values level by level.  
2. **Maximum Depth of Binary Tree (LeetCode 104)**  
   🔗 [Problem Link](https://leetcode.com/problems/maximum-depth-of-binary-tree/)  
   - Used recursion.  
   - Depth = `1 + max(leftDepth, rightDepth)`  
3. **Minimum Depth of Binary Tree (LeetCode 111)**  
   🔗 [Problem Link](https://leetcode.com/problems/minimum-depth-of-binary-tree/)  
   - Special case: when one child is `null`, we must take the non-null child’s depth.  
   - Depth = `1 + min(leftDepth, rightDepth)`


### ✅ Day 24
**Problems Solved:** 
1. **Diameter of Binary Tree (LeetCode 543)**  
   🔗 [Problem Link](https://leetcode.com/problems/diameter-of-binary-tree/)  
   - Used DFS recursion.  
   - Diameter is the max of `leftHeight + rightHeight` at each node.  
2. **Symmetric Tree (LeetCode 101)**  
   🔗 [Problem Link](https://leetcode.com/problems/symmetric-tree/)  
   - Recursively checked mirror property:  
     - Left child of one tree == Right child of the other.  
     - Right child of one tree == Left child of the other.  
3. **Same Tree (LeetCode 100)**  
   🔗 [Problem Link](https://leetcode.com/problems/same-tree/)  
   - Trees are the same if:  
     - Both nodes are null.  
     - Values match and left/right subtrees are identical.  

### ✅ Day 25
**Problems Solved:** 
1. **Sum of Left Leaves (LeetCode 404)**  
   🔗 [Problem Link](https://leetcode.com/problems/sum-of-left-leaves/)  
   - Used DFS traversal.  
   - If a node has a left child that is a leaf → add to sum.  
2. **Range Sum of BST (LeetCode 938)**  
   🔗 [Problem Link](https://leetcode.com/problems/range-sum-of-bst/)  
   - Pruned unnecessary branches using BST property.  
   - Traversed only nodes that could fall within `[low, high]`.  
3. **Search in a BST (LeetCode 700)**  
   🔗 [Problem Link](https://leetcode.com/problems/search-in-a-binary-search-tree/)  
   - Performed recursive search.  
   - If `val < root.val` → search left.  
   - If `val > root.val` → search right.  

### ✅ Day 26
**Problems Solved:** 
1. **Max Area of Island (LeetCode 695)**  
   🔗 [Problem Link](https://leetcode.com/problems/max-area-of-island/)  
   - Used **DFS** to count connected land cells.  
   - Updated the maximum area found.  
2. **Island Perimeter (LeetCode 463)**  
   🔗 [Problem Link](https://leetcode.com/problems/island-perimeter/)  
   - Each land cell contributes `+4`.  
   - Checked for **shared edges** with top/left cells to subtract 2.  
3. **Keys and Rooms (LeetCode 841)**  
   🔗 [Problem Link](https://leetcode.com/problems/keys-and-rooms/)  
   - Traversed graph using **DFS with keys**.  
   - Verified if all rooms could be visited.
  
### ✅ Day 27
**Problems Solved:** 
  1. **Is Graph Bipartite? (LeetCode 785)**  
   🔗 [Problem Link](https://leetcode.com/problems/is-graph-bipartite/)  
   - Used **DFS coloring** approach.  
   - Ensured no two adjacent nodes had the same color.  
2. **Graph Valid Tree (LeetCode 261)**  
   🔗 [Problem Link](https://leetcode.com/problems/graph-valid-tree/)  
   - Verified **n-1 edges** for tree property.  
   - Checked connectivity using DFS.  
3. **Number of Connected Components in an Undirected Graph (LeetCode 323)**  
   🔗 [Problem Link](https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/)  
   - Built adjacency list.  
   - Counted connected components using DFS traversal. 

### ✅ Day 28
**Problems Solved:** 
### 1. [Word Break (139)](https://leetcode.com/problems/word-break/)  
- Learned how to use **DP + substring checking**.  
- Key idea: check if a prefix can be broken into words from the dictionary.  
### 2. [Target Sum (494)](https://leetcode.com/problems/target-sum/)  
- Converted into a **subset sum problem**.  
- Used DP to count possible ways.  
### 3. [Coin Change (322)](https://leetcode.com/problems/coin-change/)  
- Solved using **bottom-up DP**.  
- Key learning: choose the minimum number of coins to reach the target amount.

### ✅ Day 29  
**Problems Solved:**  
### 1️⃣ [LeetCode #62: Unique Paths](https://leetcode.com/problems/unique-paths/)  
- **Concept Used:** Dynamic Programming (Grid DP)  
- **Logic:** Count all unique paths from top-left to bottom-right by accumulating paths from top and left cells. Optimized using a 1D DP array.  
- **Complexity:** O(m × n) time, O(n) space  
### 2️⃣ [LeetCode #329: Longest Increasing Path in a Matrix](https://leetcode.com/problems/longest-increasing-path-in-a-matrix/)  
- **Concept Used:** DFS + Memoization  
- **Logic:** Explore all 4 directions from each cell and store the length of the longest increasing path in a memoization matrix to avoid recomputation.  
- **Complexity:** O(m × n) time, O(m × n) space  
### 3️⃣ [LeetCode #64: Minimum Path Sum](https://leetcode.com/problems/minimum-path-sum/)  
- **Concept Used:** Bottom-Up Dynamic Programming  
- **Logic:** Update each cell with the minimum sum to reach it from the top-left, using values from the top and left neighbors.  
- **Complexity:** O(m × n) time, O(1) extra space (modifying the input grid)  

### ✅ Day 30 
**Problems Solved:**
### 1. [Unique Paths II (63)](https://leetcode.com/problems/unique-paths-ii/)  
- Learned to handle **grid paths with obstacles** using DP.  
- If start or end has an obstacle, no path exists.  
### 2. [Triangle (120)](https://leetcode.com/problems/triangle/)  
- Solved using **bottom-up DP**.  
- Updated each row by adding the minimum path sum from the row below.  
### 3. [Cheapest Flights Within K Stops (787)](https://leetcode.com/problems/cheapest-flights-within-k-stops/)  
- Applied **Bellman-Ford algorithm** with at most `k+1` relaxations.  
- Tracked the minimum cost to reach the destination with stop limits.  
## Learnings  
- Practiced **Dynamic Programming** in grids and triangles.  
- Reinforced **graph algorithms** with edge relaxations.  

---

## 🏆 Inspiration
“Consistency is the secret ingredient that transforms small efforts into big achievements.”  

I’ll keep updating this file every day with the problems I solve ✅.  

More updates coming soon! 🚀
