class KthLargest {
    private int k;
    private PriorityQueue<Integer> minheap;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        this.minheap=new PriorityQueue<>();
        for(int num : nums){
            add(num);
        }
       

    }
    
    public int add(int val) {
         minheap.add(val);
         if(minheap.size()>k){
            minheap.poll();
         }
        return minheap.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */