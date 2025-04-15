class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int f=0;
        int l=n-1;
        int ans=n;
        while(f<=l){
            int mid=f+(l-f)/2;
            if(nums[mid]>=target){
                ans=mid;
                l=mid-1;
            }
            else{
                f=mid+1;
            }
        }
        return ans;
    }
}