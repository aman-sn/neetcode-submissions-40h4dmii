class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> miniStack;

    public MinStack() {
        stack = new Stack<>();
        miniStack = new Stack<>();
    }
    
    public void push(int val) {
        miniStack.push(Math.min(val, miniStack.isEmpty() ? Integer.MAX_VALUE : miniStack.peek()));
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
        miniStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return miniStack.peek();
    }
}
