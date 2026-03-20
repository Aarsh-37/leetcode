# Rotate Array (Right Rotation by k Steps)

---

## Problem Statement

Given an array `nums`, rotate the array to the right by `k` steps.

---

# 1. Brute Force Approach

### Idea:

Rotate the array **one step at a time**, repeat `k` times.

### Steps:

1. Repeat `k` times:

   * Store last element
   * Shift all elements to right by one
   * Place last element at index `0`

---

### Complexity:

* Time Complexity: `O(n * k)`
* Space Complexity: `O(1)`

---

### Drawback:

* Very slow for large `k`

---

# 2. Better Approach (Using Extra Array)

### Idea:

Use a temporary array to store rotated positions.

---

### Steps:

1. Create a new array `temp` of size `n`
2. For each index `i`:

   ```
   temp[(i + k) % n] = nums[i]
   ```
3. Copy `temp` back to original array

---

### Complexity:

* Time Complexity: `O(n)`
* Space Complexity: `O(n)`

---

### Advantage:

* Simple and easy to implement

---

# 3. Optimal Approach (Reversal Algorithm)

### Idea:

Reverse parts of the array to achieve rotation **in-place**

---

### Steps:

1. Handle large `k`:

   ```
   k = k % n
   ```

2. Reverse entire array

3. Reverse first `k` elements

4. Reverse remaining `n - k` elements

---

### Intuition:

```
[1,2,3,4,5,6,7], k = 3
```

After full reverse:

```
[7,6,5,4,3,2,1]
```

Reverse first k:

```
[5,6,7,4,3,2,1]
```

Reverse remaining:

```
[5,6,7,1,2,3,4]
```

---

### Complexity:

* Time Complexity: `O(n)`
* Space Complexity: `O(1)`

---

### Advantage:

* Most efficient (in-place)
* Preferred in interviews


