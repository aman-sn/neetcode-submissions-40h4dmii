class Solution {

    public String encode(List<String> strs) {
         StringBuilder encodedString = new StringBuilder();
        for (String str : strs) {
            encodedString.append(str.length()).append('#').append(str);
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {
         List<String> decodedList = new ArrayList<>();
        int i = 0;
        
        while (i < str.length()) {
            int delimiterIndex = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, delimiterIndex));
            i = delimiterIndex + 1; 
            String substring = str.substring(i, i + length);
            decodedList.add(substring);
            i += length; 
        }
        
        return decodedList;
    }
}
