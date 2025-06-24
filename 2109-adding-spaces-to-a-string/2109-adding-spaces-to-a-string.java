class Solution {
    public String addSpaces(String s, int[] spaces) {
        int m=s.length();
        int n = spaces.length;
        int i,j=0;
        StringBuilder sb=new StringBuilder();
        //we can't directly use string result+=s.charAt(i);or result+=" ";
        /*In Java, strings are immutable, so every time you 
        do result +=   something, a new string is created.
         This makes the operation O(k²) in the worst case when done in a 
         loop — which kills performance for large strings. tle aayega
         */
        //o(m+n) is t.c 
        for(i=0;i<m;i++){
            if(  j<n && i==spaces[j] ){
                sb.append(" ");
                j++;
            }
              sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}