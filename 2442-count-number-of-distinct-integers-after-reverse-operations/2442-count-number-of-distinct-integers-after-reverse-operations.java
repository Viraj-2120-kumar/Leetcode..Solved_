class Solution {
    public static int reverse(int a){
        int rev=0;
        while(a>0){
            int rem=a%10;
            rev=rev*10 + rem;
            a/=10;
        }
        return rev;
    }
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> ans = new HashSet<>();

        int n = nums.length;
        for(int ele : nums){
            ans.add(ele);
        }
        for(int i=0;i<n;i++){
            int temp = reverse(nums[i]);
            ans.add(temp);
        }

        return ans.size();
    }
}