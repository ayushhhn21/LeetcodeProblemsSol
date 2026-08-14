class Solution {
    public int maximumLengthSubstring(String s) {
        int count = 0;
        int [] f = new int[26];

       for (int l = 0, r = 0; r < s.length(); r++) {
            f[(s.charAt(r) & 31) - 1]++;

            while (f[(s.charAt(r) & 31) - 1] > 2)
                f[(s.charAt(l++) & 31) - 1]--;

            count = Math.max(count, r - l + 1);
       }
        return count;
    }
}