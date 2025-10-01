import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Small performance tweak: give initial capacity to HashMap
        HashMap<Integer, Integer> map = new HashMap<>(nums.length);
        
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            Integer prevIndex = map.get(diff);
            if (prevIndex != null) {
                return new int[] { prevIndex, i };
            }
            map.put(nums[i], i);
        }
        return new int[0]; // as per problem, this won't be reached
    }
}
