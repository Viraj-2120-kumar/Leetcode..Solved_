class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int index = 1;
        int minrow=0;
        int maxrow=n-1;
        int mincol=0;
        int maxcol=n-1;

        while(minrow<=maxrow && mincol<=maxcol){
            for(int i=mincol;i<=maxcol;i++){
                mat[minrow][i]=index++;
            }
            minrow++;
            for(int j=minrow;j<=maxrow;j++){
                mat[j][maxcol]=index++;
            }
            maxcol--;
            if(minrow<=maxrow){
                for(int i=maxcol;i>=mincol;i--){
                    mat[maxrow][i]=index++;
                }
                maxrow--;
            }
            if(mincol<=maxcol){
                for(int j=maxrow;j>=minrow;j--){
                    mat[j][mincol]=index++;

                }
                mincol++;
            }
        }
        return mat;
    }
}