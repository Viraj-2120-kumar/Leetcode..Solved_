class Solution {
    public int minCostToMoveChips(int[] position) {
        //Tum free me sirf parity (even/odd) ke andar move kar sakte ho
        //Parity change karne pe hi cost lagta hai
        int even =0;
        int odd=0;
        for(int pos : position){
            if(pos%2==0) even++;
            else odd++;
        }

        return Math.min(even, odd);
    }
}