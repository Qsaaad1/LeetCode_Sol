// 169. Majority Element

class Solution {
    public int majorityElement(int[] nums) {
        
        int n = nums.length;
        int m = nums[0];
        int c = 1;
        
        for (int i = 1; i < n; i++){
            if (nums[i]== m){
                c++;
            }
            else if (c > 0){
                c--;
            }
            else {
                m = nums[i]; c = 1;
            }
        }
        return m;
}}