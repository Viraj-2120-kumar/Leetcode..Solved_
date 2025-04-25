class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        //sort initilaaly
        Arrays.sort(nums);

        //make the min negative elemnts positive
        // ex3 : 2,-3,-1,5,-4  ,k=2
        // -4,-3,-1,2,5 sorting
        int i=0;
        while(i<nums.length && k>0 && nums[i]<0){
            nums[i]*=-1;
            k--;
            i++;
        }
       //4,3,-1,2,5, k=0 so direct sum
       // if k left =1
       // sort -1,2,3,4,5
       // 1,2,3,4,5 below condition then sum
        if(k%2==1){
            Arrays.sort(nums);
            nums[0]*=-1;
        }   
        int sum=0;
        for(int le : nums){
            sum+=le;
        }
        return sum;
    }
}