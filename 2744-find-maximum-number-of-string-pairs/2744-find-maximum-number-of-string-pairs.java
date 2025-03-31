class Solution {
    public String reverse(String s){
        StringBuilder st = new StringBuilder(s);
        st.reverse();
        return st.toString();
    }
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> ans= new HashSet<>();
        
        int countpair=0;
        int n = words.length;
         
        // for(int i=0; i<n;i++){
        //     String temp = reverse(words[i]);
        //     if(ans.contains(temp)) {
        //         ans.remove(temp);
        //         countpair++;
        //     }
        //     else{
        //         ans.add(words[i]);
        //     }
        // }

        for(int i = 0 ;i<n;i++){
            String temp = reverse(words[i]);
            for(int j=i+1 ;j<n;j++){
                if(words[j].equals(temp))
                countpair++;
            }
        }

        return countpair;

    }
}