class Solution {
    public int maxIceCream(int[] costs, int coins) {
        //Brute Force t.c o(nlogn)
        // Arrays.sort(costs);
        // int count = 0;
        // for(int i = 0; i<costs.length;i++){
        //     if(costs[i]<=coins){
        //         count++;
        //         coins-=costs[i];
        //     }
        // }
        // return count;
        

        // counting sort t.c o(n+max(element))
        int l =Integer.MIN_VALUE;
        for(int ele : costs){
            l=Math.max(l,ele);
        }
         
        // creating frequency array
        int ans[] = new int[l+1];
        for(int i = 0; i<costs.length ; i++){
            int x = costs[i];
            ans[x]++;
        }
         // now checking the number of ice cream 
         int result= 0;
         for(int i=1;i < ans.length;i++){
            if(ans[i]!=0){
                int freq= ans[i];
                while( freq > 0 && i <= coins){
                    coins-=i;
                    result++;
                    freq--;
                }
            }
         }
         return result;
         
    }
}