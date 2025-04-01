class Solution {
    public int[] twoSum(int[] nums, int target) {
        /* brute force approach o(n^2) is time complexity,s.c o(1)
            int arr[] = new int[2];
            for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
        */

        int arr[] ={-1,-1};
        // to store element and index t.c o(n)  s.c o(n)
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int remaining = target-nums[i];
            if(map.containsKey(remaining)){
                arr[0]=i;
                arr[1]=map.get(remaining);
                break;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return arr;

    }
};