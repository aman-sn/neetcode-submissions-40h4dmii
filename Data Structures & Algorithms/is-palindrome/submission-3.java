class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String filtered = s.replaceAll("[^a-z0-9]", "");
        String reversed = new StringBuilder(filtered).reverse().toString();
        return filtered.equals(reversed);
    }
}
