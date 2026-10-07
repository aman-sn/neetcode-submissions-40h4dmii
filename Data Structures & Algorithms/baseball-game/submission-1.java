class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String operation : operations){
            if(operation.equals("+")){
                int top = stack.pop();
                int second = stack.peek();

                stack.push(top);
                stack.push(top + second);           
            }
            else if(operation.equals("C")){
                stack.pop();
            }
            else if(operation.equals("D")){
                stack.push(2 * stack.peek());
            }
            else{
                stack.push(Integer.parseInt(operation));
            }
        }
        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        return sum;
    }
}