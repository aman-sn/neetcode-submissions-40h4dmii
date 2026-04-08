class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> fMap=new HashMap<>();
      //  HashMap<Character> s2=new HashMap<>();
        if(s.length()!=t.length())
        return false;
        for(char c:s.toCharArray())
            fMap.put(c,fMap.getOrDefault(c,0)+1);
        for(char c:t.toCharArray())
            fMap.put(c,fMap.getOrDefault(c,0)-1);
        for(char c='a';c<='z';c++){
            if(fMap.getOrDefault(c,0)!=0)
            return false;
        }
        return true;
    }
}