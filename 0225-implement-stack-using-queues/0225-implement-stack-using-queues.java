class MyStack {
        Queue<Integer> q1;
        Queue<Integer> q2;
        MyStack(){
            q1 = new ArrayDeque<>();
            q2 = new ArrayDeque<>();
        }

    public void push(int x) {
        q1.offer(x);
    }
    
    public int pop() {
        while(q1.size()>1){
            q2.offer(q1.poll());
        }
          int popped = q1.poll();
          Queue<Integer> temp = q1;
          q1 = q2;
          q2 = temp;
          return popped;
    }
    
    public int top() {
            while(q1.size()>1){
                q2.offer(q1.poll());
            }
          int top = q1.poll();
          q2.offer(top);
          Queue<Integer> temp = q1;
          q1 = q2;
          q2 = temp;
          return top;
    }
    
    public boolean empty() {
        return q1.isEmpty();
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