# Two Sum Problem 

## Problem Statement

Given an array `nums` and a target value, find indices of two numbers such that they add up to the target.



## Approaches


### ️1. Brute Force Approach

#### Idea:

* Check every possible pair of elements.
* For each element, compare it with all elements after it.
* If their sum equals the target → return indices.

#### Intuition:

You try all combinations without optimizing — simple but inefficient.

#### Complexity:

* Time: **O(n²)**
* Space: **O(1)**

---

### ️2 Better Approach (Sorting + Two Pointers)

#### Idea:

* First, sort the array (while keeping track of original indices).
* Use two pointers:

  * One at the beginning
  * One at the end
* Move pointers based on sum:

  * If sum < target → move left pointer forward
  * If sum > target → move right pointer backward
  * If equal → solution found

#### Intuition:

Sorting allows you to eliminate unnecessary checks and narrow down search efficiently.

####  Note:

Sorting changes indices, so you must track original positions.

#### Complexity:

* Time: **O(n log n)**
* Space: **O(n)**

---

### 3️Optimal Approach (Hash Map)

#### Idea:

* Traverse the array once.
* For each element:

  * Calculate: `target - current element`
  * Check if this value already exists in a hash map

    * If yes → solution found
    * If no → store current element with its index

#### Intuition:

Instead of searching again, you "remember" what you've already seen.

#### Complexity:

* Time: **O(n)**
* Space: **O(n)**

