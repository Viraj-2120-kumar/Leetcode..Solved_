class Solution {
    public int longestPalindrome(String[] words) {

        // t.c is o(n)
        HashMap<String, Integer> mapp = new HashMap<>();

        for (String ele : words) {
            if(mapp.containsKey(ele)){
                int freq =  mapp.get(ele);
                mapp.put(ele , freq+1);
            }
            else{
                mapp.put(ele,1);
            }
        }

        int longestpalindrome = 0;
        boolean flag = false;

        for (String ele : mapp.keySet()) {
            String reverse = new StringBuilder(ele).reverse().toString();
            int freqword = mapp.get(ele);

            if (ele.equals(reverse)) {
                longestpalindrome += (freqword / 2) * 4;
                if (freqword % 2 == 1) {
                    flag = true;
                }
            } 
            else if (mapp.containsKey(reverse)) {
                
                int reversefreq = mapp.get(reverse);
                if (reversefreq > 0) {
                    int minl = Math.min(freqword, reversefreq);
                    longestpalindrome += minl * 4;
                    mapp.put(ele, freqword - minl);
                    mapp.put(reverse, reversefreq - minl);
                }
            }
        }

        if (flag) longestpalindrome += 2;
        return longestpalindrome;
    }
}
