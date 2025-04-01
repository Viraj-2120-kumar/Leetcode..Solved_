class Solution {
    public boolean isAnagram(String s, String t) {
        /* brute force
        if(s.length()!=t.length())
        return false;
        char[] a=s.toCharArray();
        char[] b= t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i])
            return false;
        }
        return true;
        */

        // using hashmap
        //character and its frequency store karegi
        //for string t
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> map1= new HashMap<>();  
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map1.containsKey(ch)){
                int freq = map1.get(ch);
                map1.put(ch,freq+1);
            }
            else{
                map1.put(ch,1);
            }
        }
         // for second string t
         HashMap<Character,Integer> map2= new HashMap<>();  
        for(int i=0;i<t.length();i++){
            char ca = t.charAt(i);
            if(map2.containsKey(ca)){
                int freq = map2.get(ca);
                map2.put(ca,freq+1);
            }
            else{
                map2.put(ca,1);
            }
        }

        for(char key  : map1.keySet()){
            int val1= map1.get(key);
            if(!map2.containsKey(key)) return false;
            int val2=map2.get(key);
            if(val1!=val2) return false;
        }

        return true;
        
    }
}