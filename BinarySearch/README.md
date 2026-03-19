# Binary Search – Approach

## 🔹 Prerequisite
- The array must be **sorted** (ascending or descending)

---

## 🔸 Iterative Approach

### Steps:
1. Initialize:
   - `low = 0`
   - `high = n - 1`

2. Loop until `low <= high`:
   - Find middle:
     ```
     mid = low + (high - low) / 2
     ```
   - Compare:
     - If `arr[mid] == target` → return `mid`
     - If `arr[mid] < target` → search right → `low = mid + 1`
     - If `arr[mid] > target` → search left → `high = mid - 1`

3. If not found → return `-1`

---

## 🔸 Recursive Approach

### Steps:
1. Base case:
   - If `low > high` → return `-1`

2. Compute mid:
   mid = low + (high - low) / 2


3. Recur:
- If `arr[mid] == target` → return `mid`
- If `arr[mid] > target` → search left
- Else → search right

---

## 🔸 Key Idea
- Divide and Conquer
- Reduce search space by half each time

---

## 🔸 Time Complexity
- Best Case: `O(1)`
- Worst Case: `O(log n)`

---

## 🔸 Space Complexity
- Iterative: `O(1)`
- Recursive: `O(log n)`

---

## 🔸 Recurrence Relation
      T(n) = T(n/2) + O(1)
