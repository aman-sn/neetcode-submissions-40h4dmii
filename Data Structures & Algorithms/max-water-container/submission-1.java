class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1, maxArea = 0;
        while(l < r){
            int height, width;
            if(heights[l] < heights[r]){
                height = heights[l];
                width = r - l;
                l++;
            }
            else{
                height = heights[r];
                width = r - l;
                r--; 
            }
            maxArea = Math.max(maxArea, height * width);
        }
        return maxArea;
    }
}
