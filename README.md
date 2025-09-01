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



   
---

## 🏆 Inspiration
“Consistency is the secret ingredient that transforms small efforts into big achievements.”  

I’ll keep updating this file every day with the problems I solve ✅.  

More updates coming soon! 🚀
