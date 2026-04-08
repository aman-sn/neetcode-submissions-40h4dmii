class Solution {
    public boolean isValid(char c){
        return Character.isLetterOrDigit(c);
    }

    public boolean isPalindrome(String s){
        int i=0, j=s.length()-1;
        s=s.toLowerCase();
        while(i<=j){
            char first=s.charAt(i);
            char second=s.charAt(j);
            if(!isValid(first))
                i++;
            else if(!isValid(second))
                j--;   
            else{
                if(first!=second)
                return false;
                i++;
                j--;
            }        
        }
        return true;
    }
}
