class Solution {
    public int[] sumZero(int n) {
        int arr[] = new int[n];
        int id=0;
        if(n%2==1) arr[id++]=0;

        for(int i=1;i<=n/2;i++){
            arr[id++]=i;
            arr[id++]=-i;
        }

        return arr;

    }
}