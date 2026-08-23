class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double winsum=0;
        double avg=0;
        for(int i=0;i<k;i++){
            winsum+=nums[i];
           avg=winsum/k;
        }
         
        double maxavg=avg;
        for(int j=k;j<n;j++){
            winsum+=nums[j];
            winsum-=nums[j-k];
            avg=winsum/k;
            maxavg=Math.max(avg,maxavg);
        }
        return maxavg;
    }
}