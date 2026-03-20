# Best Time to Buy and Sell Stock – Approach

---

## 🔹 Problem Statement

Given an array `prices`, where `prices[i]` is the price of a stock on day `i`, find the maximum profit you can achieve by buying once and selling once.

---

# 🔸 1. Brute Force Approach

### Idea:

Try every possible pair of days to buy and sell.

---

### Steps:

1. For each day `i` (buy day):

   * For each day `j > i` (sell day):

     * Calculate profit = `prices[j] - prices[i]`
2. Track maximum profit

---

### Complexity:

* Time: `O(n²)`
* Space: `O(1)`

---

### Drawback:

* Too slow for large inputs

---

# 🔸 2. Optimal Approach (Single Pass)

### Idea:

Track the **minimum price so far** and calculate profit at each step.

---

### Steps:

1. Initialize:

   ```
   minPrice = ∞
   maxProfit = 0
   ```

2. Traverse array:

   * Update minimum price:

     ```
     minPrice = min(minPrice, prices[i])
     ```
   * Calculate profit if sold today:

     ```
     profit = prices[i] - minPrice
     ```
   * Update maximum profit:

     ```
     maxProfit = max(maxProfit, profit)
     ```

3. Return `maxProfit`

---

### Complexity:

* Time: `O(n)`
* Space: `O(1)`

---

### Why It Works:

* Always buy at the **lowest price seen so far**
* At each step, check best possible profit if selling today

