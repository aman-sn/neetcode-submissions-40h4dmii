class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength=0;
       Set<Character> set=new HashSet<>();
       int l=0;

       for(int r=0; r<s.length();r++){
        char c= s.charAt(r);

        while(set.contains(c)){
            set.remove(s.charAt(l));
            l++;
        }
        set.add(c);
        maxLength=Math.max(maxLength,r-l+1);

       } 
       return maxLength;
    }
}
