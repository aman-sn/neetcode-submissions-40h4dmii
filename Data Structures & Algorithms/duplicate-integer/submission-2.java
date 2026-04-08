class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numbers=new HashSet<>();
        for(int i:nums){
            if(numbers.contains(i)) return true;
            numbers.add(i);
        }
        return false;
    }
}