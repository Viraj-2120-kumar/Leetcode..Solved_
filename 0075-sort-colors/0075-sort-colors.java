class Solution {
    public void sortColors(int[] nums) {
        int a=0,b=0,c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
            a++;
             if(nums[i]==1)
            b++;
             if(nums[i]==2)
            c++;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i<a)nums[i]=0;
            else if(i>=a && i<a+b) nums[i]=1;
            else nums[i]=2;
          
        }
        
    }
}