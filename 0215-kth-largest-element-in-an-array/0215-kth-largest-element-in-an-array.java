class Solution {
    public int findKthLargest(int[] nums, int k) {
        // boolean swap;
        // for(int i=0;i<nums.length;i++){
        //      swap=false;
        //     for(int j=1;j<nums.length-i-1;j++){
        //         if(nums[j]>nums[j+1]){
        //             int t=nums[j];
        //             nums[j]=nums[j+1];
        //             nums[j+1]=t;
        //             swap=true;
        //         }
        //     }
        //     if(swap==false)break;
        // }
        // return nums[nums.length-k];
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for(int val : nums){
            minheap.add(val);
            if(minheap.size()>k) minheap.poll();
        }
        return minheap.peek();
        
    }
}