class Solution {
    public int maxArea(int[] nums) {
        int maxArea=0;
        int l=0,r=nums.length-1;
        while(l<r){
            int w=r-l;
            if(nums[l]<nums[r]){
                maxArea=Math.max(maxArea,w*nums[l]);
                l++;
        }
            else{
                maxArea=Math.max(maxArea,w*nums[r]);
                r--;
        }
        }
        return maxArea;
    }
}
