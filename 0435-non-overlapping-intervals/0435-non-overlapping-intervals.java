class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
       
       if(intervals.length==0) return 0;

        //sort based on end time
        Arrays.sort(intervals , (a,b) -> Integer.compare(a[1],b[1]));
         
        int end =intervals[0][1]; 
        int count=0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<end){
              count++;
            }
            else{
               end=intervals[i][1];
            }
        }
        return count;
    }
}