# Sort Colors (Dutch National Flag Problem)

## Problem
Given an array consisting of only 0s, 1s, and 2s, sort the array in-place such that:
- All 0s come first
- Then all 1s
- Then all 2s

---

# 1. Brute Force Approach

## Idea
Use a general sorting algorithm to sort the array.

## Steps
- Apply any standard sorting technique (e.g., comparison-based sorting)
- The sorted array will automatically arrange 0s, 1s, and 2s in order

## Complexity
- Time Complexity: O(n log n)
- Space Complexity: O(1) (depends on sorting method)

## Drawback
- Does not use the special property of the problem (only 3 distinct elements)
- Not optimal

---

# 2. Better Approach (Counting Method)

## Idea
Count the number of 0s, 1s, and 2s, then overwrite the array accordingly.

## Steps
- Traverse the array and count:
  - Number of 0s
  - Number of 1s
  - Number of 2s
- Rewrite the array:
  - Fill 0s first
  - Then 1s
  - Then 2s

## Complexity
- Time Complexity: O(n)
- Space Complexity: O(1)

## Improvement
- Avoids sorting
- Efficient but requires two passes

---

# 3. Optimal Approach (Dutch National Flag Algorithm)

## Core Idea
Use three pointers to partition the array into three sections in a single pass.

## Pointers
- low: boundary for 0s
- mid: current index
- high: boundary for 2s

---

## Steps
- Initialize:
  - low = 0
  - mid = 0
  - high = n - 1

- Traverse while mid <= high:
  - If element is 0:
    - Swap with low
    - Increment both low and mid
  - If element is 1:
    - Move mid forward
  - If element is 2:
    - Swap with high
    - Decrement high (do not move mid)

---

## Key Intuition

- Elements before low are all 0s
- Elements after high are all 2s
- Elements between low and mid are 1s
- The rest is unprocessed

---

## Complexity
- Time Complexity: O(n)
- Space Complexity: O(1)

---

# Summary

- Brute force uses general sorting
- Better approach uses counting
- Optimal approach uses three pointers
- Dutch National Flag algorithm is the most efficient solution
