class MedianFinder {
    PriorityQueue<Integer> min;
    PriorityQueue<Integer> max;

    public MedianFinder() {
        min=new PriorityQueue<>();        
        max=new PriorityQueue<>(Collections.reverseOrder());
    }
    public void addNum(int num) {
         if(max.isEmpty() || max.peek()>=num){
            max.add(num);
         }
         else{
            min.add(num);
         }
         if(min.size()>max.size()){
            max.add(min.poll());
         }
         else if(max.size()>min.size()+1){
            min.add(max.poll());
          
         }
        
    }
    
    public double findMedian() {
        if (max.size() > min.size()) {
            return max.peek();
        } else {
            return (max.peek() + min.peek()) / 2.0;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */