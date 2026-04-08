class Solution {
    public boolean isValid(String s) {
        Stack<Character> parantheses=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='{'||c=='('||c=='['){
                if(c=='{')
                    parantheses.push('}');  
                else if(c=='[')
                    parantheses.push(']');
                else if(c=='(')
                    parantheses.push(')');  
            } 
            else if(c=='}'||c==')'||c==']'){
                if(parantheses.size()>0&&parantheses.peek()==c)
                    parantheses.pop();
                else
                    return false;
            }
        
        }
        return parantheses.isEmpty();
    }
}
