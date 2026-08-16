class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
        int nonZero = 0;

        for(int n : nums){
            xor ^= n;

            if(n != 0){
                nonZero++;
            } 
        }
        if(nonZero == 0) return 0;

        if(xor != 0) return nums.length;

        return nums.length -1;
        
    }
}