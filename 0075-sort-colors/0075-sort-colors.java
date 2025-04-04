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
        int index=0;
        for(int i=0;i<a;i++)
        {
            nums[index]=0;
            index++;
        }
         for(int i=0;i<b;i++)
        {
            nums[index]=1;
            index++;
        }
         for(int i=0;i<c;i++)
        {
            nums[index]=2;
            index++;
        }
        
    }
}