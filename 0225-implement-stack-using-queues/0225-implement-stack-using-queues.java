class MyStack {
    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>(); // queue in java can be implemented using linked list or arraydequeue, the latter is faster.
    }
    
    public void push(int x) {
        q.add(x);

        // rotate all previous elements
        int size = q.size();
        for (int i = 0; i < size - 1; i++) {
            q.add(q.remove());
        }
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */