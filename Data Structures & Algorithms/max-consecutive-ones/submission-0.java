class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int total = 0;
        int max = 0;

        for(int i: nums) {
            if(i == 1) {
                total++;
                max = Math.max(total, max);
            } else {
                total = 0;
            }
        }

        return max;
    }
}