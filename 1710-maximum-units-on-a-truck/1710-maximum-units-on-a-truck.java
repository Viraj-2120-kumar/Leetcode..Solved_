class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        // sort on the basis of  maximum number of units in each box of type
        // like [5,10] typebox has 5 box each having 10units of goods
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        int ans = 0;

        for (int i = 0; i < boxTypes.length; i++) {
            //(i,0) number of boxes
            while (boxTypes[i][0] > 0 && truckSize > 0) {
                //(i,1) contains unit in each box
                ans += boxTypes[i][1];
                truckSize--;
                boxTypes[i][0]--;
            }
        }
        return ans;
    }
}