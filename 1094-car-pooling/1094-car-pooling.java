class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int tripdistance[] = new int[1001];

        for(int []t : trips){
            int passenger=t[0];
            int first = t[1];
            int end =t[2];
            tripdistance[first]+=passenger;
            tripdistance[end]-=passenger;
        } 

        int currentload=0;
        for(int i=0;i<tripdistance.length;i++){
            currentload+=tripdistance[i];
            if(currentload>capacity)
            return false;
        }
        return true;

    }
}