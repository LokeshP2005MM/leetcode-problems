class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=0;
        int n=nums.length;
        int r=n-1;
       
        while(l<r)
        {
            int sum=nums[l]+nums[r];
            if(sum==target)
            {
               
                return new int[] {l+1,r+1};

            }
            else if(sum>target)
            {
              r--;
            }
            else{
                l++;
            }
            
        }
     return new int[]{l+1,r+1};    
    }
   
}