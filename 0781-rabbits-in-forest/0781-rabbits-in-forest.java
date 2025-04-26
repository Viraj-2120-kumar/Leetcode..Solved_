class Solution {
    public int numRabbits(int[] answers) {
        //creating a hashmap = total rabit in group, frequncy of each group  type

        HashMap<Integer, Integer> mapp = new HashMap<>();


        for(int ele : answers){
            // we will also count itself for each rabbit so ele+1 khudko bhi rabbit count kargeea 
            if(mapp.containsKey(ele+1)){
                int f= mapp.get(ele+1);
                mapp.put(ele+1,f+1);
            }
            else{
                mapp.put(ele+1,1);
            }
        }
        
        int ans=0;

        for(int key : mapp.keySet()){
            int f= mapp.get(key);
            int quotient = f/key;
            ans+=quotient*key;
            int rem = f%key;
            if(rem>0){
                ans+=key;
            }
        }

        return ans;
    }
}