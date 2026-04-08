class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numbers=new HashSet<>();
        for(int num:nums){
            numbers.add(num);
        }
        int longest=0;
        for(int num:nums){
            int l=0;
            if(numbers.contains(num-1))
            l=1;
            while(numbers.contains(num+l)){
            l++;
            }
            longest=Math.max(longest,l);
        }
        
        return longest;
    }
}
