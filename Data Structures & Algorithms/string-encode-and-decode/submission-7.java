class Solution {

    public String encode(List<String> strs) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<strs.size();i++){
            str.append(strs.get(i).length()+";"+strs.get(i));
        }
        System.out.print(str);
        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> strs=new ArrayList<>();
        int i=0;
        while(i<str.length()){
        int j = i;
            while (str.charAt(j) != ';') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j)); 
            i = j + 1; 

        strs.add(str.substring(i,i+length));
        i+=length;
    }
        return strs;
    }
}
