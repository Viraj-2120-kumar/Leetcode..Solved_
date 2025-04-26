class Solution {
    public int findMinArrowShots(int[][] points) {
        //sort acording to the first index starting ke base pe
      Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));

       int start=points[0][0];
       int end = points[0][1];

       int count=1;//initially 1 arrow require for start or end
       
       for(int i[] : points){
        if(i[0]<=end){
            end=Math.min(end,i[1]);
        }
        else{
            start=i[0];
            end=i[1];
            count++;
        }
       }

       return count;
    }
}