class Solution {
    public int findMin(int[] nums) {
        int lo= 0;
        int hi=nums.length-1;
        int ans= Integer.MAX_VALUE;
        while(lo<=hi){
            int mid =lo+(hi-lo)/2;
            if(nums[lo]<=nums[hi]){
                // means complete array sorted hai toh minimum 0th element
                ans=Math.min(ans,nums[lo]);
                break;
            }
            if(nums[lo]<=nums[mid]){
                //when left half is sorted minimum is nums[low]
                // move to right half
                ans=Math.min(ans,nums[lo]);
                lo=mid+1;
            }
            else{
               //when right half is sorted minimum is nums[mid]
                // move to left half for finding sabse min
                ans=Math.min(ans,nums[mid]);
                hi=mid-1;
            }

        }
        return ans;
    }
}