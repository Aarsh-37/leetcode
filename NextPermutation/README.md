# Next Permutation

## Problem
Given an array representing a permutation, rearrange it into the next lexicographically greater permutation.  
If not possible, rearrange it into the smallest possible order.

---

# 1. Brute Force Approach

## Idea
Generate all possible permutations of the array, sort them, and find the next permutation in order.

## Steps
- Generate all permutations of the array
- Sort them in lexicographical order
- Locate the current permutation
- Return the next permutation in the list
- If it is the last permutation, return the first (smallest)

## Complexity
- Time Complexity: O(n! × n)
- Space Complexity: O(n!)

## Drawback
- Extremely inefficient for large inputs
- Not feasible for practical use

---

# 2. Better Approach

## Idea
Instead of generating all permutations, find a way to rearrange the array by modifying a suffix.

## Steps
- Traverse from right to left and find a position where order breaks
- Try swapping with a greater element on the right side
- Sort the remaining suffix to get the smallest order

## Complexity
- Time Complexity: O(n log n)
- Space Complexity: O(1) or O(n) depending on sorting method

## Improvement
- Avoids generating all permutations
- Still uses sorting, which is slower than needed

---

# 3. Optimal Approach

## Core Idea
Make the smallest possible change to get the next greater permutation.

## Steps

### Step 1: Find Breakpoint
- Traverse from right to left
- Find the first index where:
  - nums[i] < nums[i + 1]
- This is the pivot

### Step 2: Handle Edge Case
- If no such index exists:
  - The array is in descending order
  - Reverse the entire array

### Step 3: Find Next Greater Element
- Traverse from the end
- Find the first element greater than nums[pivot]

### Step 4: Swap
- Swap pivot with that element

### Step 5: Reverse Suffix
- Reverse the subarray after pivot
- This ensures the smallest possible suffix

---

## Complexity
- Time Complexity: O(n)
- Space Complexity: O(1)

---

# Key Intuition

- The suffix after the pivot is in decreasing order
- Swapping gives a slightly larger permutation
- Reversing ensures the smallest possible arrangement after the pivot

---

# Summary

- Brute force generates all permutations
- Better approach avoids full generation but still uses sorting
- Optimal approach uses pivot, swap, and reverse
- Optimal solution runs in linear time with constant space
