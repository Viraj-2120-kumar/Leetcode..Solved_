class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int n=digits.length;
         
         //stroing the digits and frquency
        for(int i=0;i<n;i++){
            int key =digits[i];
            if(map.containsKey(key)){
                int freq= map.get(key);
                map.put(key,freq+1);
            }
            else{
                map.put(key,1);
            }
        } 
         
         //all threedigit number possible 100 to 999 only even
         ArrayList<Integer> an = new ArrayList<>();
         for(int i=100 ;i<=999;i+=2){
            int x=i;
            //finding digits abc =212 example
            int c=x%10; x/=10;
            int b=x%10; x/=10;
            int a= x;
            if(map.containsKey(a)){
                int freqa= map.get(a);
                map.put(a,freqa-1);
                if(freqa==1)map.remove(a);
                if(map.containsKey(b)){
                    int freqb = map.get(b);
                    map.put(b,freqb-1);
                    if(freqb==1) map.remove(b);
                        if(map.containsKey(c)){
                            an.add(i);
                        }
                    map.put(b,freqb);
                }
                map.put(a,freqa);
            }

         }

         int list[]= new int[an.size()];
         for(int i=0;i<list.length;i++){
            list[i]=an.get(i);
         }

         return list;


    }
}