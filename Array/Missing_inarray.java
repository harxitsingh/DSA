class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;// 0 to n

        int expectedSum = n * (n + 1) / 2;
        int arraySum = 0;

        for (int ele : nums) {
            arraySum += ele;
        }

        return expectedSum - arraySum;
    }
}