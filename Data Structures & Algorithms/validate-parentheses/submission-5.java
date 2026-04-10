class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='['||c=='{'||c=='('){
                switch(c){
                    case '(': stack.push(')');
                    break;
                    case '[': stack.push(']');
                    break;
                    case '{': stack.push('}');
                    default:
                }
            }
            else if(c==']'||c=='}'||c==')'){
                if(stack.size()>0 && stack.peek()==c)
                    stack.pop();
                else
                    return false;
            }
            else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}
