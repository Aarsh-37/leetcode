# Check if Array Is Sorted and Rotated

---

## 🔹 Problem Statement

Given an array `nums`, determine if it was originally sorted in non-decreasing order and then rotated.

---

## 🔸 Key Idea

A sorted and rotated array has **at most one inversion point**.

An inversion occurs when:

```
nums[i] > nums[i+1]
```

---

## 🔸 Optimal Approach (O(n))

### Steps:

1. Initialize a counter:

   ```
   count = 0
   ```

2. Traverse the array from `0` to `n-1`:

   * Compare each element with the next element
   * Use circular comparison for last element:

     ```
     nums[i] > nums[(i + 1) % n]
     ```
   * If condition is true → increment `count`

3. Final Decision:

   * If `count <= 1` → array is sorted & rotated → return `true`
   * Else → return `false`

---

## 🔸 Why Circular Comparison?

* Ensures last element is compared with first
* Necessary to validate rotation

---

## 🔸 Example Insight

```
[3,4,5,1,2]
```

* Only one inversion → valid

```
[2,1,3,4]
```

* More than one inversion → invalid

---

## 🔸 Complexity

* Time Complexity: `O(n)`
* Space Complexity: `O(1)`

---

## 🔸 Edge Cases

* Already sorted array → valid
* All elements same → valid
* Multiple drops in order → invalid

---

## 🔸 Summary

Count how many times order breaks in the array.
If it breaks more than once, it cannot be a sorted rotated array.
