class Solution {
    public int longestOnes(int[] nums, int k) {

        // T.c O(2n)  s.c (1)
        int n = nums.length;

        int l=0;
        int r=0;
        int maxlen=0;
        int countzero=0;

        while(r<n){
            if(nums[r]==0)countzero++;
             while(countzero>k){
                if(nums[l]==0) countzero--;
                l++;
            }
            if(countzero <= k){
                int len = r-l+1;
                maxlen = Math.max(maxlen, len);
            }
            r++;
        }
        return maxlen;
    }
}