//Leetcode question no 167 
//Approach- Brute Force : square each element 

import java.util.*;
class Solution {
    public int[] SortedSquares(int[]nums){
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
public class SortedSquares {
    public static void main(String[] args) {
            Solution obj = new Solution();   // Object create
        int []nums ={-4,-1,0,3,10};
        int[] result = obj.SortedSquares(nums);
        System.out.println(Arrays.toString(result));
    }
}




    

