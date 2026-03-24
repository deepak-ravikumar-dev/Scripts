# Scripts
## Beginner Level: Loops and Basic Logic
#### 1. Reverse a String: Use two pointers (start and end) to swap characters moving toward the center.

    Input: "hello" | Output: "olleh"

#### 2. Second Largest in Array: Maintain two variables (max and secondMax) and update them in a single linear scan.

    Input: [12, 35, 1, 10, 34] | Output: 34

#### 3. Check Palindrome: Reverse the digits mathematically (using % and /) and compare with the original number.

    Input: 121 | Output: true

#### 4. Count Vowels/Consonants: Iterate through the string and check each character against a set of vowels.

    Input: "coding" | Output: Vowels: 2, Consonants: 4

#### 5. Factorial (Recursion): Solve by multiplying the current number by the function's own result for (n-1).

    Input: 5 | Output: 120

#### 6. Linear vs. Binary Search: Use a loop for unsorted data vs. halving the search range for sorted data.

    Input: [1, 3, 5, 7, 9], target: 7 | Output: Index: 3

#### 7. Frequency of Elements: Use a HashMap to store elements as keys and their counts as values.

    Input: [1, 2, 2, 3, 3, 3] | Output: {1:1, 2:2, 3:3}

#### 8. Check Anagrams: Sort both strings and compare, or compare their character frequency counts.

    Input: "listen", "silent" | Output: true





## Intermediate Level: Optimization and Pointers
#### 1. First Non-Repeating Character: Store counts in a HashMap and pick the first character with a count of 1.

    Input: "swiss" | Output: "w"

#### 2. Implement Stack using Array: Use a fixed-size array and a "top" pointer to track the last inserted element.

    Input: push(10), push(20), pop() | Output: 20

#### 3. Solve Two Sum (Hashing): Iterate once and check if the (target - current) value exists in a HashMap.

    Input: nums: [2, 7, 11, 15], target: 9 | Output: [0, 1]

#### 4. Longest Substring (No Repeats): Use a sliding window with a Set to track and remove duplicate characters.

    Input: "abcabcbb" | Output: 3 (for "abc")

#### 5. Queue using Two Stacks: Use one stack for enqueuing and another for reversing the order to dequeue.

    Input: enqueue(1), enqueue(2), dequeue() | Output: 1

#### 6. Detect Cycle in Linked List: Use two pointers (slow and fast); if they meet, a cycle exists.

    Input: 1 -> 2 -> 3 -> (back to 2) | Output: true

#### 7. Intersection of Two Arrays: Use a Set to store one array's elements and filter the second array against it.

    Input: [1, 2, 2, 1], [2, 2] | Output: [2]

#### 8. Implement Merge Sort: Recursively divide the array into halves and merge them back in sorted order.

    Input: [38, 27, 43, 3] | Output: [3, 27, 38, 43]

#### 9. Find Majority Element: Use the Boyer-Moore Voting Algorithm to cancel out different elements.

    Input: [3, 2, 3] | Output: 3





## Advanced Level: Complex Structures and DP
#### 1. Implement LRU Cache: Combine a HashMap for O(1) access and a Doubly Linked List for O(1) updates.

    Input: put(1, 1), put(2, 2), get(1), put(3, 3) | Output: Evicts key 2

#### 2. Longest Increasing Subsequence: Use Dynamic Programming to store the max subsequence length ending at each index.

    Input: [10, 9, 2, 5, 3, 7] | Output: 3 (for [2, 5, 7])

#### 3. Dijkstra’s Shortest Path: Use a Priority Queue to always expand the node with the current shortest distance.

    Input: Graph, Start: A, End: D | Output: Shortest distance: 7

#### 4. Implement Trie (Prefix Tree): Use a tree of nodes where each node represents a single character in a prefix.

    Input: insert("apple"), search("app") | Output: true (prefix exists)

#### 5. Word Break Problem: Use Dynamic Programming to check if substrings can be formed by valid dictionary words.

    Input: "leetcode", ["leet", "code"] | Output: true

#### 6. Strongly Connected Components: Use Kosaraju’s Algorithm (two DFS passes and a graph transposition).

    Input: Directed Graph | Output: List of SCC groups

#### 7. KMP String Matching: Pre-process a pattern-prefix table to skip redundant character comparisons.

    Input: text: "ABABDABACD", pattern: "ABACD" | Output: Index: 5

#### 8. Design Real-Time Streaming System: Design using partitioned message queues (like Kafka) and distributed consumers.

    Input: High-velocity log data | Output: Real-time analytics dashboard