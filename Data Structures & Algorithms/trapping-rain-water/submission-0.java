class Solution {
    public int trap(int[] height) {
        int len = height.length, result = 0;
        int[] leftMax = new int[len];
        int[] rightMax = new int[len];
        int max = 0;
        for(int i = 0; i < len; i++){
            leftMax[i] = max;
            max = Math.max(max, height[i]); 
        }
        max = 0;
        for(int i = len - 1; i >= 0; i--){
            rightMax[i] = max;
            max = Math.max(max, height[i]); 
        }
        for(int i = 0; i < len; i++){
            int water = Math.min(leftMax[i], rightMax[i]) - height[i];
            result += (water>0) ? water : 0; 
        }
        return result;
    }
}
