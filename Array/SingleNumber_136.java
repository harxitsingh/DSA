class Solution {
    public int singleNumber(int[] nums) {
        int res = 0; // result = 0 
        for (int n : nums) { // for each loop
            res ^= n; // res = res^n;      
        }
        return res;
    }
}

// concept - XOR bitwise operator