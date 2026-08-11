class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        Set<Integer> seen = new HashSet<>(n);
        for(int num : nums)
         seen.add(num);
       int seqSum = nums[0];
       for(int j = 1; j<n ; j++){
        if(nums[j]==nums[j-1]+1){
            seqSum += nums[j];
        } else break;
       } 
       while(seen.contains(seqSum))
            seqSum++;

        return seqSum;
        }
    }