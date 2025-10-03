class Solution {
    public int romanToInt(String s) {
        int[] nums = new int[128];
        nums['I'] = 1; nums['V'] = 5; nums['X'] = 10;
        nums['L'] = 50; nums['C'] = 100; nums['D'] = 500; nums['M'] = 1000;
        int result = 0;
        for (int i = 0; i < s.length(); ++i) {
            int curr = nums[s.charAt(i)];
            if (i + 1 < s.length() && curr < nums[s.charAt(i + 1)]) {
                result -= curr;
            } else {
                result += curr;
            }
        }
        return result;
    }
}
