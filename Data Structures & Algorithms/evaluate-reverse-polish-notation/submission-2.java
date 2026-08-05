class Solution {
    public int eval(int l, char o, int r){
        if(o == '+')
            return l + r;
        else if(o == '-')
            return l - r;
        else if(o == '*')
            return l * r;
        else
            return l / r;
    }

    public boolean isNumber(String str){
        return str != null && str.matches("-?\\d+");
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token: tokens){
            if(isNumber(token)){
                stack.push(Integer.parseInt(token));
            }
            else{
                int r = stack.pop();
                char o = token.charAt(0);
                int l = stack.pop();
                stack.push(eval(l,o,r));
            }
        }
        return stack.pop();
    }
}
