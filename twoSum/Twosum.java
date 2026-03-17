import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] array, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int complement = target - array[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(array[i], i);
        }

        return new int[]{}; 
    }
}
