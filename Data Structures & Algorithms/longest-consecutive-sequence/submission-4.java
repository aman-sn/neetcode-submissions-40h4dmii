class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int num: nums){
            numSet.add(num);
        }
        
        int maxResult = 0;
        for(int num: nums){
            if (!numSet.contains(num - 1)){
            int counter = 1;
            while(numSet.contains(++num)){
                counter++;
            }
            maxResult = Math.max(counter, maxResult);
        }
        }
        return maxResult;
    }
}
