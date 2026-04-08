class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> prevIndices=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int num=nums[i];
        int diff=target-num;
        if(prevIndices.containsKey(diff))
        return new int[] {prevIndices.get(diff),i};
        prevIndices.put(num,i);
       } 
       return new int[] {};
    }
}
