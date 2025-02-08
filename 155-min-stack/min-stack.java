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
        int min=Integer.MAX_VALUE;
        Iterator<Integer> v=s.iterator();
        while(v.hasNext())
        min=Math.min(min,v.next());
        return min;
        
    }
}