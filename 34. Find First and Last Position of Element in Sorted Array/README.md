# 34. Find First and Last Position of Element in Sorted Array

## 🔴 Brute Force Approach

### Idea:
- Traverse the entire array and track occurrences of the target.

### Steps:
1. Initialize two variables: `first = -1`, `last = -1`
2. Loop through the array from start to end:
   - If current element equals target:
     - If `first` is not set, assign current index to `first`
     - Update `last` with current index
3. Return `[first, last]`

### Time Complexity:
- O(n)

### Space Complexity:
- O(1)

---

## 🟡 Better Approach (Two Traversals)

### Idea:
- Find first occurrence from the left.
- Find last occurrence from the right.

### Steps:
1. Traverse from the beginning:
   - Stop when first occurrence of target is found
2. Traverse from the end:
   - Stop when last occurrence is found
3. Return both indices

### Time Complexity:
- O(n) (can be faster due to early stopping)

### Space Complexity:
- O(1)

---

## 🟢 Optimal Approach (Binary Search)

### Idea:
- Since array is sorted, use binary search twice:
  - Once to find the **first occurrence**
  - Once to find the **last occurrence**

---

### Steps to Find First Occurrence:
1. Apply binary search
2. If target is found:
   - Store index
   - Move search to left half to check for earlier occurrence
3. Continue until search space is exhausted

---

### Steps to Find Last Occurrence:
1. Apply binary search
2. If target is found:
   - Store index
   - Move search to right half to check for later occurrence
3. Continue until search space is exhausted

---

### Time Complexity:
- O(log n)

### Space Complexity:
- O(1)

---

## ✅ Summary

| Approach | Time | Space |
|--------|------|-------|
| Brute | O(n) | O(1) |
| Better | O(n) | O(1) |
| Optimal (Binary Search) | O(log n) | O(1) |
