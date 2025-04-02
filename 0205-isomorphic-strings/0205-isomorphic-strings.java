class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        int n = s.length();
        HashMap<Character,Character> map = new HashMap<>();
        for(int i=0;i<n;i++){
            char key = s.charAt(i);
            char val =t.charAt(i);
            if(map.containsKey(key)){
                if(map.get(key)!=(val)){
                    return false;
                }
            }
            else if(map.containsValue(val)){
                return false;
            }
            else{
                map.put(key,val);
            }
        }
        return true;

    }
}