class Solution {
    public int majorityElement(int[] nums) {
        int element = 0, count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                count = 1;
                element = nums[i];
            } else if (element == nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        int finalCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element) {
                finalCount++;
            }
        }

        if (finalCount > nums.length / 2) {
            return element;
        } else {
            return -1;
        }
    }
}
