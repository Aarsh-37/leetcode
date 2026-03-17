# Majority Element 

## Problem Statement

Given an array `nums` of size `n`, find the element that appears more than ⌊n/2⌋ times.

* The majority element always exists.

---

## Approaches 


### 1) Brute Force Approach

#### Idea:

* For each element, count how many times it appears in the array.
* If the count is greater than n/2, return that element.

#### Intuition:

Check the frequency of every element one by one.

#### Complexity:

* Time: O(n²)
* Space: O(1)

---

### 2) Better Approach (Hash Map)

#### Idea:

* Use a hash map to store frequency of each element.
* Traverse the array and update counts.
* If any element’s count exceeds n/2, return it.

#### Intuition:

Store frequencies to avoid repeated counting.

#### Complexity:

* Time: O(n)
* Space: O(n)

---

### 3) Optimal Approach (Moore’s Voting Algorithm)

#### Idea:

* Maintain a candidate and a count.
* Traverse the array:

  * If count is 0, set current element as candidate.
  * If element equals candidate, increment count.
  * Otherwise, decrement count.

#### Intuition:

The majority element cancels out all other elements and remains at the end.

#### Note:

If the majority element is not guaranteed, a second pass is required to verify.

#### Complexity:

* Time: O(n)
* Space: O(1)


