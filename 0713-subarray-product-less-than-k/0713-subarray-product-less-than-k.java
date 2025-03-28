class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;

        int l=0;
        int r=0;
        int count=0;
        int pd=1;
        
        while(r<n){
            pd=pd*nums[r];
            while(pd >= k  && l<=r){
                pd=pd/nums[l];
                l++;
            }
           if(pd < k ) count+= r-l+1;
            r++;
        }
       return count;

    }
}