class MedianFinder {
    List<Integer> l;
    public MedianFinder()
    {
        l=new ArrayList<>();
    }

    public void addNum(int num) {
        int i;
       if(l.size()>0)
       {
        for(i=0;i<l.size() && l.get(i)<num;i++)
        {

        }
        l.add(i,num);
       } 
       else
       l.add(num);            
    }
    
    public double findMedian() {
        if(l.size()>0)
        {
        int m=l.size()/2;
        if(l.size()%2==0)
        return (double)((l.get(m)+l.get(m-1))/2.0);
        else
        return l.get(m);
        }
        return 0;
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */