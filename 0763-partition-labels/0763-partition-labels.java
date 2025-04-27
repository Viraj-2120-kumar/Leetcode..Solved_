class Solution {
    public List<Integer> partitionLabels(String s) {
     ArrayList<Integer> result = new ArrayList<>();

     if(s.length()==0 || s==null) return result;  

     HashMap<Character, Integer> mapp = new HashMap<>();

     for(int i=0;i<s.length();i++){
        mapp.put(s.charAt(i),i);
    }
     
     int start=0;
     int end = 0;
     for(int i=0;i<s.length();i++){
        char ch =s.charAt(i);
        end= Math.max(end,mapp.get(ch));

        if(i==end){
            result.add(end-start+1);
            start=end+1;
        }
     }
     return result;

    }
}