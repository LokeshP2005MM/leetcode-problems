class Solution {
    public int[] getConcatenation(int[] nums) {

        int[] ob = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            ob[i] = nums[i];
            ob[i + nums.length] = nums[i];
        }

        return ob;
    }
}