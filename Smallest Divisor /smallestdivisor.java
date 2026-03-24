class Solution {

    private int TotalSum(int[] nums, int div) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += Math.ceil((double) nums[i] / div);
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        int low = 1, high = max;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (TotalSum(nums, mid) <= threshold) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
