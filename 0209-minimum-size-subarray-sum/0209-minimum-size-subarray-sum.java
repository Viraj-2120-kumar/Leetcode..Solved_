class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        //t.c o(n^2) time limit exceeded
        /*
        int n = nums.length;
        int len=Integer.MAX_VALUE;
        for(int i=0 ; i<n;i++){
            int sum=0;
            for(int j =i ; j<n ;j++){
                sum+=nums[j];
                if(sum>=target) len = Math.min(len , j-i+1);
            }
        }
        if(len==Integer.MAX_VALUE) return 0;
        return len;

        */

        int r=0;
        int l=0;
        int sum=0;
        int minlen = Integer.MAX_VALUE;
        while(r < nums.length){
            sum=sum+nums[r];
            while(sum>= target){
                minlen=Math.min(minlen, r-l+1);
                sum=sum-nums[l];
                l++;
            }
            r++;
        }
        if(minlen==Integer.MAX_VALUE) return 0;
        return minlen;
    }
}