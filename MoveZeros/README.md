# Move Zeroes – Approach

---

## 🔹 Problem Statement

Given an integer array `nums`, move all `0`s to the end while maintaining the relative order of non-zero elements.

---

# 🔸 1. Brute Force Approach

### Idea:

Use an extra array to store non-zero elements first, then fill remaining positions with zeroes.

---

### Steps:

1. Create a temporary array
2. Traverse original array:

   * Add all non-zero elements to temp
3. Fill remaining positions in temp with `0`
4. Copy temp back to original array

---

### Complexity:

* Time: `O(n)`
* Space: `O(n)`

---

### Drawback:

* Uses extra space

---

# 🔸 2. Better Approach (Two Pass Method)

### Idea:

Shift all non-zero elements forward, then fill remaining with zeroes.

---

### Steps:

1. Initialize index `idx = 0`
2. Traverse array:

   * If element is non-zero:

     ```
     nums[idx] = nums[i]
     idx++
     ```
3. Fill remaining positions from `idx` to end with `0`

---

### Complexity:

* Time: `O(n)`
* Space: `O(1)`

---

### Advantage:

* In-place solution
* Maintains order

---

# 🔸 3. Optimal Approach (Two Pointer Swap)

### Idea:

Swap non-zero elements with zero positions as you traverse.

---

### Steps:

1. Maintain two pointers:

   * `i` → traverses array
   * `j` → tracks position of next non-zero

2. Traverse array:

   * If `nums[i] != 0`:

     * Swap `nums[i]` with `nums[j]`
     * Increment `j`

---

### Complexity:

* Time: `O(n)`
* Space: `O(1)`

---

### Advantage:

* Single pass
* Minimizes unnecessary writes

