class Solution {
    private int reverse (int a){
        int rev=0;
        while(a!=0){
            int r=a%10;
            rev=rev*10+r;
            a/=10;
        }
        return rev;
    }
    public int countNicePairs(int[] nums) {
        
        int n= nums.length;
        HashMap<Integer,Integer > map =new HashMap<>();
        
        //to count number of nice subarrays
        int count=0;

        for(int i=0 ;i<n;i++){
            int key = nums[i]-reverse(nums[i]);
            if(map.containsKey(key)){
                int freq=map.get(key);
                count+=freq;// important this will store total pairs count
                count%=1000000007;// as given for too large number return 
                //its  count modulo 10^9+7  
                map.put(key,freq+1);
            }
            else{
                map.put(key,1);
            }
        }
        return count;
    }
}