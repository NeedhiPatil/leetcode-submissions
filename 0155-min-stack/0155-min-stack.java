    class MinStack {

        Stack<Integer> stk = new Stack<>(); 
        Stack<Integer> minStack = new Stack<>(); 

        public MinStack() {
        
        }
        
        public void push(int value) {
            stk.push(value);

            if(minStack.isEmpty()){
                minStack.push(value);
            }else{
                minStack.push(Math.min(value, minStack.peek()));
            }
        }
        
        public void pop() {
            stk.pop();
            minStack.pop();
        }
        
        public int top() {
            return stk.peek();
        }
        
        public int getMin() {
            return minStack.peek();
        }
    }

    /**
    * Your MinStack object will be instantiated and called as such:
    * MinStack obj = new MinStack();
    * obj.push(value);
    * obj.pop();
    * int param_3 = obj.top();
    * int param_4 = obj.getMin();
    */