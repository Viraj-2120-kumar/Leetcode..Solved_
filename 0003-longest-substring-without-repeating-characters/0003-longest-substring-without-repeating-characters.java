class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int n = s.length();
        int[] hash = new int[256];
        //total characters is 256

        Arrays.fill(hash,-1);

        int l=0;
        int r=0;
        int mxlen=0;

        while(r<n){
            int index = s.charAt(r); // ascii value of character us index 
            if(hash[index]!=-1){// pe -1 update hojyega 256 hash array me
                if(hash[index]>=l){
                    l=hash[index]+1;
                }
            }
            int len = r-l+1;
            mxlen = Math.max(mxlen , len);
            hash[index]=r;
            r++;
        }

        return mxlen;

    }
}