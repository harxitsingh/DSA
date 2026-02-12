public class MoveZeroes { 

    // leetcode question no 283 Move zeroes
    public static void main(String[] args) {

        int[] nums = {6, 0, 2, 0, 3};

        int insertPos = 0;

        // Move non-zero elements forward
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        // Fill remaining with zeros
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }

        // Print result
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}