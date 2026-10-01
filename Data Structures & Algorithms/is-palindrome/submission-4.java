class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int l = 0, r = s.length() - 1;
        while(l<r){
            while(l < r && !Character.isLetterOrDigit(s.charAt(l)))
            l++;
            while(r > l && !Character.isLetterOrDigit(s.charAt(r)))
            r--;
            char lc = s.charAt(l);
            char rc = s.charAt(r);
            if(lc != rc)
                return false;
            l++;
            r--;
        }

        return true;
    }
}
