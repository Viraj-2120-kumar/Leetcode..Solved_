class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        for(String s : word1){
            one.append(s);
        }
        for(String u : word2){
            two.append(u);
        }
        return   one.toString().equals(two.toString());
    }
}