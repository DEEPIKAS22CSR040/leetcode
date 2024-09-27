class MinStack {
    Stack<Integer> s;

    public MinStack() {
        s=new Stack<>();
        
    }
    
    public void push(int val) {
        s.push(val);
        
    }
    
    public void pop() {
        if(!s.isEmpty())
        s.pop();
        
    }
    
    public int top() {
        //if(!s.isEmpty())
        return s.peek();
        
    }
    
    public int getMin() {
        List<Integer> l=new ArrayList<>();
        Iterator<Integer> v=s.iterator();
        while(v.hasNext())
        l.add(v.next());
        Collections.sort(l);
        return l.get(0);
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */