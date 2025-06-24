class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n =colors.length();
        int time=0;
        int prev=neededTime[0]; // initially prev hoga 1st elelment
        for(int i=1;i<n;i++){
            if(colors.charAt(i-1)!=colors.charAt(i)){
                prev =0;
            //agar different colors ke ballon hai tb set krdoprev ko 0
            }
            int curr = neededTime[i];
            time+=Math.min(prev,curr);
            prev=Math.max(prev,curr);
        }

        return time;

    }
}