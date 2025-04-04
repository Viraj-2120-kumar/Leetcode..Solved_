class Solution {
    private void reversearray(int arr[], int i, int j){
        while(i<j){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
       /* extra array use
        int n = nums.length;
        k=k%n;
        int ans[] = new int[n];
        int id=0;
        for(int i=n-k;i<n;i++){
            ans[id]=nums[i];
            id++;
        }
        for(int i=0;i<n-k;i++){
            ans[id]=nums[i];
            id++;
        }
        for(int i=0;i<n;i++){
            nums[i]=ans[i];
        }
        */

        // approch 2
        //reverse the complete array first
        int n =nums.length;
        k=k%n;
        reversearray(nums,0,n-1);
        // now reverse the part again 0 to k-1 and again k to n-1;
        reversearray(nums,0,k-1);
        reversearray(nums,k,n-1);

    }
}