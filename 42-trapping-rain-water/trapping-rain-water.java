class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length -1;
        int lef_max=0;
        int rig_max=0;
        int res=0;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>lef_max){
                    lef_max=height[left];
                }
                else{
                    res=res+(lef_max-height[left]);
                }
                left++;
            }
            else
            {
                if(height[right]>rig_max){
                    rig_max=height[right];
                }
                else{
                    res=res+(rig_max-height[right]);
                }
                right--;
            }
        }
        return res;
       
}
}