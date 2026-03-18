# Maximum Subarray Sum (Kadane’s Algorithm)

## Problem
Given an integer array, find the maximum sum of a contiguous subarray.

---

# 1. Brute Force Approach

## Idea
Generate all possible subarrays, calculate their sums, and track the maximum.

## Steps
- Choose a starting index
- Choose an ending index
- Compute the sum of elements between them
- Update the maximum if needed

## Complexity
- Time Complexity: O(n³)
- Space Complexity: O(1)

## Drawback
- Recomputes sums repeatedly, making it inefficient

---

# 2. Better Approach

## Idea
Avoid recomputing sums by maintaining a running sum.

## Steps
- Fix a starting index
- Initialize sum = 0
- Expand subarray by moving the ending index
- Keep adding elements to sum
- Update maximum after each addition

## Complexity
- Time Complexity: O(n²)
- Space Complexity: O(1)

## Improvement
- Eliminates the inner loop used for recomputation

---

# 3. Optimal Approach (Kadane’s Algorithm)

## Core Idea
If the running sum becomes negative, discard it and start fresh.

Because a negative sum will reduce the total of any future subarray.

## Steps
- Initialize:
  - sum = 0
  - max = very small number
- Traverse the array:
  - Add current element to sum
  - Update max if sum is greater
  - If sum becomes negative:
    - Reset sum to 0

## Complexity
- Time Complexity: O(n)
- Space Complexity: O(1)

---

# Key Intuition

At each index:
- Either extend the previous subarray
- Or start a new subarray from the current element

---



# Edge Case

If all elements are negative:
- The answer is the maximum single element
- Kadane still works if max is initialized properly
