// leetcode question number =167
//Approach - Two pointer - without using nested loop

import java.util.*;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];

            if (sum == target)
                return new int[] { i + 1, j + 1 };
            else if (sum < target)
                i++;// bcz sorted array , sum greater so i++
            else
                j--; // sum is lesser than target so j--
        }
        return new int[] { -1, 1 }; // if target not found then this
    }
}

public class TwoSumII {
    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] numbers = { -10, -3, 0, 2, 4, 9, 15 };
        int target = 6;

        int[] result = obj.twoSum(numbers, target);
        System.out.println(Arrays.toString(result)); // Arrays.toString()
    }
}
