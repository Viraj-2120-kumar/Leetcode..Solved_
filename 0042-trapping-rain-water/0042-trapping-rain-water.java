class Solution {
    public int trap(int[] height) {
        int n=height.length;
        /*
        int left[]=new int[n];
        int right[]=new int [n];
        left[0]=height[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],height[i]);
        }
        right[n-1]=height[n-1];
        for(int i=n-2;i>=0 ;i--){
            right[i]=Math.max(right[i+1],height[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=(Math.min(left[i],right[i])-height[i]);
        }
        return ans;
        */
         
         //approch  t.c o(n), s.c o(1)
         int ans=0;
         int left=0; int right=n-1;
         int leftmax=height[0];
         int rightmax=height[n-1];
         while(left<right){
            if(leftmax<=rightmax){
               ans+=leftmax-height[left];
               left++;
               leftmax=Math.max(leftmax,height[left]);
            }
            else{
                ans+=rightmax-height[right];
                right--;
                rightmax=Math.max(rightmax,height[right]);
            }
         }
         return ans;

        
    }
}