class Solution {
    public int missingNumber(int[] nums) {
        int actualSum=0,l=nums.length;
        for(int n:nums){
            actualSum+=n;
        }
        int expectedSum=l*(l+1)/2;
        return expectedSum-actualSum;
    }
    
}
