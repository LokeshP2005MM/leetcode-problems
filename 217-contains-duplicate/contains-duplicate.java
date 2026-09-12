class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> ob=new HashSet<>();
        for (int i=0;i<nums.length;i++){
             if(ob.contains(nums[i])){
                 return true;
            }
            ob.add(nums[i]);
        }
        return false;
          
    }
}