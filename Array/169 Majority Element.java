/*
Majority Element
LeetCode 169

Approach:
Using Boyer-Moore Voting Algorithm.
We keep a candidate and count.
If count becomes 0 → change candidate.
If same element → count++
Else → count--

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element: " + majorityElement(nums));
    }
}

