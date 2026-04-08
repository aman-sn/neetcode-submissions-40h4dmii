class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int element=nums[i];
            if(set.contains(element)){
                return true;
            }
            else
                set.add(element);
        }
        return false;
    }
}
