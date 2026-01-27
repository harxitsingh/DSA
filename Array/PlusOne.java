import java.util.Vector;
import java.util.Collections;

class Solution {
    public int[] plusOne(int[] arr) {
        Vector<Integer> ans = new Vector<>();
        int n = arr.length;
        int carry = 1;

        for (int i = n - 1; i >= 0; i--) { // n-1 -- start from last index  in array
            int val = arr[i] + carry; // add 1 to all (n-1)index elements 
            if (val <= 9) {
                ans.add(val); // if sum(val) is equal to or less than 9
                carry = 0; // then carry 0
            } else {
                ans.add(0); // last digit 0
                carry = 1;// carry 1
            }
        }

        if (carry == 1) ans.add(1);

        Collections.reverse(ans);

        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}
