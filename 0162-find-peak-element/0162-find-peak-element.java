class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        if(n==1)return 0;

         // As nums[-1] = nums[n] = -∞ that why
        if(nums[0]>nums[1]) return 0;
        if(nums[n-1]>nums[n-2]) return n-1;
        //by doing this trim down the search space

        int lo=1;
        int hi=n-2;

        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
                return mid;
            }
            //mtlb yha tk increaing hai isliye peak aage milega
            else if(nums[mid] > nums[mid-1] ){
                lo=mid+1;

            }
            //ye check krega ki peak ke aage agay kya
            else {
                hi=mid-1;
            }
        }
       
           return -1; 
    }
}