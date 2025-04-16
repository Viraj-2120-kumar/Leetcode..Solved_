class Solution {
        int leftmost(int nums[],int target){
            int start=0;
            int end=nums.length-1;
            int leftmost=-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(nums[mid]==target){
                    leftmost=mid;
                    end=mid-1;
                }
                else if(nums[mid]>target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            return leftmost;

        }
        int rightmost(int nums[],int target){
            int start=0;
            int end=nums.length-1;
            int rightmost=-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(nums[mid]==target){
                    rightmost=mid;
                    start=mid+1;
                }
               else if(nums[mid]>target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            return rightmost;

        }
          public int[] searchRange(int[] nums, int target) {
            int ans[]=new int[2];
            int left=leftmost( nums, target);
            int right=rightmost( nums, target);
            ans[0]=left;ans[1]=right;
            return ans;
    }
}