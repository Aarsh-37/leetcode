# Find Maximum Consecutive Ones – Approach

---

## 🔹 Problem Statement

Given a binary array `nums`, find the maximum number of consecutive `1`s in the array.

---

# 🔸 1. Brute Force Approach

### Idea:

Check every possible subarray and count consecutive `1`s.

---

### Steps:

1. For each index `i`:

   * Start counting consecutive `1`s from `i`
2. Stop when a `0` is encountered
3. Track the maximum count obtained

---

### Complexity:

* Time: `O(n^2)`
* Space: `O(1)`

---

### Drawback:

* Inefficient due to repeated work

---

# 🔸 2. Optimal Approach (Single Pass)

### Idea:

Traverse once while maintaining a running count of consecutive `1`s.

---

### Steps:

1. Initialize:

   ```
   count = 0
   maxCount = 0
   ```

2. Traverse array:

   * If element is `1`:

     * Increment `count`
     * Update `maxCount`
   * If element is `0`:

     * Reset `count = 0`

3. Return `maxCount`

---

### Complexity:

* Time: `O(n)`
* Space: `O(1)`

---

### Why It Works:

* Consecutive sequence breaks at `0`
* Resetting ensures only continuous `1`s are counted


