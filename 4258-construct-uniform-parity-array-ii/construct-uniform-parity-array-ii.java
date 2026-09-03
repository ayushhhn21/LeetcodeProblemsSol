class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean hasOdd = false;
        int min = nums1[0];

        for(int x : nums1) {
            min = Math.min(min, x);

            if(x % 2 != 0) {
                hasOdd = true;
            }
        }

        return (min % 2 != 0) || !hasOdd;
    }
}