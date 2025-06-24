class Solution {
    public String addSpaces(String s, int[] spaces) {
        int m=s.length();
        int n = spaces.length;
        int i,j=0;
        String result="";
        //o(m+n) is t.c 
        //easy ques
        for(i=0;i<m;i++){
            if(  j<n && i==spaces[j] ){
                result+=" ";
                j++;
            }
            result+=s.charAt(i);
        }
        return result;
    }
}