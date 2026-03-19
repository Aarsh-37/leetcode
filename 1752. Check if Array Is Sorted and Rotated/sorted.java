class Solution {
    public boolean check(int[] nums) {
        int countBreaks = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                countBreaks++;
            }
    
            if (countBreaks > 1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {3, 4, 5, 1, 2};
        int[] nums2 = {2, 1, 3, 4};   
        int[] nums3 = {1, 2, 3};       

        System.out.println(solution.check(nums1)); 
        System.out.println(solution.check(nums2)); 
        System.out.println(solution.check(nums3)); 
    }
}
