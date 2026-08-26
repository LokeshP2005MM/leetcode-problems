class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int countzero=0;
        int n=nums.length;
        int left=0;
        int max=0;
        for(int i=0 ;i<n;i++){
            if(nums[i]==0){
                countzero++;
            }
            if(countzero>k){
                if(nums[left]==0){
                    countzero--;
                }
                left++;
            }
        }
        return n-left;
    }
}